package info.hubbitus.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Annotation to handle XSD documentation annotations (russian names and element code).
 *
 * @author Pavel Alexeev.
 * @since 2019-01-18 14:03.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface XsdInfo {
	/**
	 * Russian name of class or field from
	 * <pre>
	 * 	<xs:annotation>
	 * 		<xs:documentation>Идентификатор</xs:documentation>
	 * 	</xs:annotation>
	 * </pre>
	 */
	String name();

	/**
	 * XSD XML element declaration as string. Like:
	 * <pre>
	 * <complexType name="TInterdepStatement">
	 *   <complexContent>
	 *     <restriction base="{http://rosreestr.ru/services/v0.18/TInterdepStatement}TBasicInterdepStatement">
	 *       <sequence>
	 *         <element name="header" type="{http://rosreestr.ru/services/v0.1/TStatementCommons}TInterdepStatementHeader"/>
	 *         <element name="subjects" type="{http://rosreestr.ru/services/v0.18/TInterdepStatement}TInterdepStatementSubjects"/>
	 *         <element name="statementDetails" type="{http://rosreestr.ru/services/v0.18/TInterdepStatement}TInterdepStatementDetails" minOccurs="0"/>
	 *       </sequence>
	 *     </restriction>
	 *   </complexContent>
	 * </complexType>
	 * </pre>
	 */
	String xsdElementPart() default "";
}
