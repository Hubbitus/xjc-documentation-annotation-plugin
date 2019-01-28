import info.hubbitus.annotation.XsdInfo
import info.hubbitus.xjc.plugin.example.Plugin
import spock.lang.Specification


/**
 * @author Pavel Alexeev.
 * @since 2019-01-28 13:25.
 */
class TestGeneratedMavenModel extends Specification {
	/**
	 * Test to demonstrate how to used generated annotations from runtime.
	 * @link <a href="https://stackoverflow.com/questions/42223784/how-can-i-generate-a-class-from-which-i-can-retrieve-the-xml-of-a-node-as-a-stri">By SO question "How can I generate a class from which I can retrieve the XML of a node as a String"</a>
	 */
	def "Simple check present annotations on Plugin class"(){
		when:
			Plugin plugin = new Plugin();
			XsdInfo xsdAnnotation = plugin.getClass().getDeclaredAnnotation(XsdInfo.class);

		then: 'Introspect XSD fragment on class:'
			xsdAnnotation.name() == "The <code>&lt;plugin&gt;</code> element contains informations required for a plugin."
			xsdAnnotation.xsdElementPart() == '''<complexType name="Plugin">
  <complexContent>
    <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
      <all>
        <element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
        <element name="artifactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
        <element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
        <element name="extensions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
        <element name="executions" minOccurs="0">
          <complexType>
            <complexContent>
              <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                <sequence>
                  <element name="execution" type="{http://maven.apache.org/POM/4.0.0}PluginExecution" maxOccurs="unbounded" minOccurs="0"/>
                </sequence>
              </restriction>
            </complexContent>
          </complexType>
        </element>
        <element name="dependencies" minOccurs="0">
          <complexType>
            <complexContent>
              <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                <sequence>
                  <element name="dependency" type="{http://maven.apache.org/POM/4.0.0}Dependency" maxOccurs="unbounded" minOccurs="0"/>
                </sequence>
              </restriction>
            </complexContent>
          </complexType>
        </element>
        <element name="goals" minOccurs="0">
          <complexType>
            <complexContent>
              <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                <sequence>
                  <any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
                </sequence>
              </restriction>
            </complexContent>
          </complexType>
        </element>
        <element name="inherited" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
        <element name="configuration" minOccurs="0">
          <complexType>
            <complexContent>
              <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                <sequence>
                  <any processContents='skip' maxOccurs="unbounded" minOccurs="0"/>
                </sequence>
              </restriction>
            </complexContent>
          </complexType>
        </element>
      </all>
    </restriction>
  </complexContent>
</complexType>'''
	}
}