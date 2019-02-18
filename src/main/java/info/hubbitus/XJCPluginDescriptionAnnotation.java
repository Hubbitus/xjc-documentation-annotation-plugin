package info.hubbitus;

import java.io.IOException;
import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

import com.sun.codemodel.JAnnotatable;
import com.sun.codemodel.JAnnotationUse;
import com.sun.codemodel.JExpression;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.util.JavadocEscapeWriter;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.Plugin;
import com.sun.tools.xjc.model.CClassInfo;
import com.sun.tools.xjc.model.CPropertyInfo;
import com.sun.tools.xjc.outline.ClassOutline;
import com.sun.tools.xjc.outline.Outline;
import com.sun.tools.xjc.reader.xmlschema.bindinfo.BindInfo;
import com.sun.xml.xsom.XSComponent;
import com.sun.xml.xsom.impl.AttributeUseImpl;
import com.sun.xml.xsom.impl.ParticleImpl;
import com.sun.xml.xsom.impl.util.SchemaWriter;
import info.hubbitus.annotation.XsdInfo;
import org.xml.sax.ErrorHandler;


/**
 * XJC plugin to place XSD documentation annotations ({@code <xs:annotation><xs:documentation>}) for runtime usage on classes and fields.
 *
 * F.e. for XSD declaration:
 *
 * <pre>{@code
 * 	<xs:complexType name="Customer">
 * 		<xs:annotation>
 * 			<xs:documentation>Пользователь</xs:documentation>
 * 		</xs:annotation>
 * 		<xs:sequence>
 * 			<xs:element name="name" type="xs:string">
 * 				<xs:annotation>
 * 					<xs:documentation>Фамилия и имя</xs:documentation>
 * 				</xs:annotation>
 * 			</xs:element>
 * 			<xs:element name="age" type="xs:positiveInteger">
 * 				<xs:annotation>
 * 					<xs:documentation>Возраст</xs:documentation>
 * 				</xs:annotation>
 * 			</xs:element>
 * 		</xs:sequence>
 * 	</xs:complexType>
 * }</pre>
 * 	Will be generated (stripped, base annotations and methods omitted):
 * <pre>{@code
 * \@XsdInfo(name = "Пользователь", xsdElementPart = "<complexType name=\"Customer\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <sequence>\n        <element name=\"name\" type=\"{http://www.w3.org/2001/XMLSchema}string\"/>\n        <element name=\"age\" type=\"{http://www.w3.org/2001/XMLSchema}positiveInteger\"/>\n      </sequence>\n    </restriction>\n  </complexContent>\n</complexType>")
 * public class Customer {
 *
 *     \@XmlElement(required = true)
 *     \@XsdInfo(name = "Фамилия и имя")
 *     protected String name;
 *     \@XmlElement(required = true)
 *     \@XmlSchemaType(name = "positiveInteger")
 *     \@XsdInfo(name = "Возраст")
 *     protected BigInteger age;
 * \}
 * }</pre>
 *
 *
 * @see <a href="https://blog.jooq.org/tag/xjc-plugin/">How to Implement Your Own XJC Plugin to Generate toString(), equals(), and hashCode() Methods</a>
 * @see <a href="http://www.archive.ricston.com/blog/xjc-plugin/">Creating an XJC plugin</a>
 * @see <a href="https://stackoverflow.com/questions/43233629/xjc-java-classes-generation-where-fields-have-the-same-name-as-xmlelement/43381317#43381317">SOq xjc java classes generation, where fields have the same name as @XmlElement</a>
 * @see <a href="https://stackoverflow.com/questions/21606248/jaxb-convert-non-ascii-characters-to-ascii-characters/21780020#21780020">JAXB convert non-ASCII characters to ASCII characters</a>
 *
 * @see <a href="https://www.javacodegeeks.com/2011/12/reusing-generated-jaxb-classes.html">Reusing generated jaxb classes</a>
 *
 * @author Pavel Alexeev.
 * @since 2019-01-17 03:34.
 */
public class XJCPluginDescriptionAnnotation extends Plugin {
	@Override
	public String getOptionName() {
		return "XPluginDescriptionAnnotation";
	}

	@Override
	public int parseArgument(Options opt, String[] args, int i) {
		return 1;
	}

	@Override
	public String getUsage() {
		return "  -XPluginDescriptionAnnotation    :  xjc plugin for bring XSD descriptions as annotations";
	}

	@Override
	public boolean run(Outline model, Options opt, ErrorHandler errorHandler) {
		model.getClasses().forEach(
			(ClassOutline c)-> {
				CClassInfo classInfo = c.target;
				annotateUnescaped(
					c.implClass
					,XsdInfo.class
					,new LinkedHashMap<String, String>(){{
						put("name", classInfoGetDescriptionAnnotation(classInfo));
						put("xsdElementPart", getXsdXmlDeclaration(classInfo.getSchemaComponent()));
					}}
				);

				c.implClass.fields().forEach((String name, JFieldVar jField) -> {
					CPropertyInfo property = classInfo.getProperties().stream()
						.filter(it-> it.getName(false).equals(jField.name()))
						.findAny()
						.orElseThrow(()-> new IllegalStateException("Can't find property [" + jField.name() + "] in class [" + classInfo.getTypeName() + "]"));

					annotateUnescaped(jField, XsdInfo.class, new LinkedHashMap<String, String>(){{put("name", fieldGetDescriptionAnnotation(property));}});
				});
			}
		);

		return true;
	}

	/**
	 * Workaround method!
	 * By default annotation russian values escaped like '\u0417\u0430\u0433\u043e\u043b\u043e\u0432\u043e\u043a \u0437\u0430\u044f\u0432\u043b\u0435\u043d\u0438\u044f' instead of "Заголовок заявления".
	 * It happened in: {@see com.sun.codemodel.JExpr#quotify(char, java.lang.String)} (call from {@see com.sun.codemodel.JStringLiteralUnescaped#generate(com.sun.codemodel.JFormatter)}). So it is hardcoded in XJC. We search graceful way to override it.
	 * We want it be unescaped.
	 * See <a href="https://github.com/javaee/jaxb-codemodel/issues/30">upstream bug</a>
	 *
	 * So, instead of just do:
	 * <code>
	 * jField.annotate(XsdInfo.class).param("name", "Русское описание");
	 * </code>
	 * You may do instead:
	 * <code>
	 * annotate(jField, XsdInfo.class, Map.Of("name", "Русское описание"))
	 * </code>
	 */
	@SuppressWarnings("unchecked")
	private static void annotateUnescaped(JAnnotatable object, Class<? extends Annotation> annotation, Map<String, String> parameters){
		assert parameters.size() > 0;

		JAnnotationUse ann = object.annotate(annotation);
		final Map<String, JExpression> m; // Lambda requires final variable

		// {@see com.sun.codemodel.JAnnotationUse.memberValues}
		Map<String, JExpression> m1 = (Map<String, JExpression>)getPrivateField(ann, "memberValues");
		if (null == m1){
			ann.param(parameters.keySet().iterator().next(), "");// Just init memberValues private map, such key will be replaced
			m = (Map<String, JExpression>)getPrivateField(ann, "memberValues");
		}
		else{
			m = m1;
		}
		assert m.size() > 0;
		parameters.forEach((key, val) -> {
			m.put(key, new JStringLiteralUnescaped(val));
		});
	}

	private static Object getPrivateField(Object obj, String fieldName) {
		try {
			Field f = obj.getClass().getDeclaredField(fieldName);
			f.setAccessible(true);
			return f.get(obj);
		} catch (NoSuchFieldException | IllegalAccessException e) {
			throw new IllegalStateException("Can't get field [" + fieldName + "] from object [" + obj + "]!", e);
		}
	}

	static private String classInfoGetDescriptionAnnotation(CClassInfo classInfo){
		String description = "";
		if (null != (classInfo.getSchemaComponent()).getAnnotation()){
			description = ((BindInfo)(classInfo.getSchemaComponent()).getAnnotation().getAnnotation()).getDocumentation();
		}
		return description.trim();
	}

	static private String fieldGetDescriptionAnnotation(CPropertyInfo propertyInfo){
		String description = "";
		assert ( (propertyInfo.getSchemaComponent() instanceof AttributeUseImpl) || (propertyInfo.getSchemaComponent() instanceof ParticleImpl) );
		//<xs:complexType name="TDocumentRefer">
		//		<xs:attribute name="documentID" use="required">
		//			<xs:annotation>
		//				<xs:documentation>Идентификатор документа</xs:documentation>
		if ( (propertyInfo.getSchemaComponent() instanceof AttributeUseImpl)
				&& null != ( ((AttributeUseImpl)propertyInfo.getSchemaComponent()).getDecl().getAnnotation() )){
			description = ((BindInfo)((AttributeUseImpl)propertyInfo.getSchemaComponent()).getDecl().getAnnotation().getAnnotation()).getDocumentation();
		}
		// <xs:complexType name="TBasicInterdepStatement">
		//		<xs:element name="header" type="stCom:TInterdepStatementHeader" minOccurs="0">
		//				<xs:annotation>
		//					<xs:documentation>Заголовок заявления</xs:documentation>
		if ( (propertyInfo.getSchemaComponent() instanceof ParticleImpl)
				&& null != ( (((ParticleImpl) propertyInfo.getSchemaComponent()).getTerm()).getAnnotation() )){
			description = ((BindInfo)(((ParticleImpl) propertyInfo.getSchemaComponent()).getTerm()).getAnnotation().getAnnotation()).getDocumentation();
		}
		return description.trim();
	}

//	@Override
//	public void postProcessModel(Model model, ErrorHandler errorHandler) {
//		super.postProcessModel(model, errorHandler);
//	}

	/**
	 * See implementation in {@see ClassSelector#addSchemaFragmentJavadoc(CClassInfo, XSComponent)}
	 */
	static private String getXsdXmlDeclaration(XSComponent sc){
		StringWriter out = new StringWriter();
		SchemaWriter sw = new SchemaWriter(new JavadocEscapeWriter(out){
			@Override
			public void write(int ch) throws IOException {
				out.write(ch);
			}
		});
		sc.visit(sw);
		return out.toString().trim();
	}

}
