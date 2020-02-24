package info.hubbitus

import com.sun.tools.xjc.Driver
import com.sun.tools.xjc.XJCListener
import groovy.util.logging.Slf4j
import info.hubbitus.annotation.XsdInfo
import org.xml.sax.SAXParseException
import spock.lang.Specification

import javax.tools.JavaCompiler
import javax.tools.ToolProvider

/**
 * @author Pavel Alexeev.
 * @since 2019-01-27 15:46.
 */
@Slf4j
class XJCPluginDescriptionAnnotationTest extends Specification {
	def "check plugin present in help"(){
		setup:
			// Catch output https://stackoverflow.com/questions/2169330/java-junit-capture-the-standard-input-output-for-use-in-a-unit-test/2169336#2169336
			ByteArrayOutputStream outStream = new ByteArrayOutputStream()
			System.setOut(new PrintStream(outStream));

			ByteArrayOutputStream statusStream = new ByteArrayOutputStream()
		when:
			int res = Driver.run(
				['-help'] as String[]
				,new PrintStream(statusStream)
				,new PrintStream(outStream)
			)
		then:
			res == -1
			outStream.toString().contains("-XPluginDescriptionAnnotation    :  xjc plugin for bring XSD descriptions as annotations")
	}

	def "generate class, compile, load and check annotations"(){
		setup:
			File generatedClassesDir = new File(this.getClass().getResource('/').getPath() + 'generated-classes')
			generatedClassesDir.mkdir()
		when:
			int res = Driver.run(
				[
					'-npa'
					,'-no-header' // To do not generate file headers (prolog comment)
					,'-XPluginDescriptionAnnotation'
					,'-d', generatedClassesDir.absolutePath
					,'-p', 'info.hubbitus.generated.test'
					,this.getClass().getResource('/Example.xsd')
				] as String[]
				,new XJCListener() {
					@Override
					void error(SAXParseException e) {
						log.error("SAX Parse exception: ", e)
						throw new IllegalStateException(e)
					}
					@Override
					void fatalError(SAXParseException e) {
						log.error("SAX Parse fatal exception: ", e)
						throw new IllegalStateException(e)
					}
					@Override
					void warning(SAXParseException e) {
						log.warn("SAX Parse warning: ", e)
					}
					@Override
					void info(SAXParseException e) {
						log.info("SAX Parse information: ", e)
					}
					@Override
					void generatedFile(String fileName, int current, int total) {
						log.debug("XJC generate new file [$fileName] $current from $total")
						super.generatedFile(fileName, current, total)
					}
				}
			)
		then:
			res == 0

		when: // Compile generated class (by https://stackoverflow.com/questions/30912479/create-java-file-and-compile-it-to-a-class-file-at-runtime/33045582#33045582)
			JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
			int compileRes = compiler.run(null, null, null, new File(generatedClassesDir, '/info/hubbitus/generated/test/Customer.java').absolutePath);
		then:
			compileRes == 0
			new File(generatedClassesDir, '/info/hubbitus/generated/test/Customer.class').exists()

		when: // Try load compiled class and instantiate object
			ClassLoader cl = new URLClassLoader([generatedClassesDir.toURI().toURL()] as URL[])
			Class cls = cl.loadClass('info.hubbitus.generated.test.Customer')
			Object obj = cls.getDeclaredConstructor().newInstance()
		then:
			cls
			obj

			XsdInfo classAnnotation = cls.getDeclaredAnnotation(XsdInfo)
			classAnnotation.name() == 'Пользователь'
			classAnnotation.xsdElementPart() == '''<complexType name="Customer">
  <complexContent>
    <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
      <sequence>
        <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
        <element name="age" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
        <element name="address" type="{http://www.w3.org/2001/XMLSchema}string"/>
      </sequence>
    </restriction>
  </complexContent>
</complexType>'''

			cls.getDeclaredFields().size() == 3
			cls.getDeclaredFields().find{ 'name' == it.name }.getAnnotation(XsdInfo).name() == 'Фамилия и имя'
			cls.getDeclaredFields().find{ 'age' == it.name }.getAnnotation(XsdInfo).name() == 'Возраст'
	}
}
