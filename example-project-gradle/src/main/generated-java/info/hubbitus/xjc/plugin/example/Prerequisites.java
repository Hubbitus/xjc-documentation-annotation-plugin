
package info.hubbitus.xjc.plugin.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import info.hubbitus.annotation.XsdInfo;


/**
 * Describes the prerequisites a project can have.
 * 
 * &lt;p&gt;Java class for Prerequisites complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Prerequisites"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="maven" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/all&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Prerequisites", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@XsdInfo(name = "Describes the prerequisites a project can have.", xsdElementPart = "<complexType name=\"Prerequisites\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <all>\n        <element name=\"maven\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n      </all>\n    </restriction>\n  </complexContent>\n</complexType>")
public class Prerequisites {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "2.0")
    @XsdInfo(name = "For a plugin project, the minimum version of Maven required to use\n            the resulting plugin.<br />\n            For specifying the minimum version of Maven required to build a\n            project, this element is <b>deprecated</b>. Use the Maven Enforcer\n            Plugin's <a href=\"https://maven.apache.org/enforcer/enforcer-rules/requireMavenVersion.html\"><code>requireMavenVersion</code></a>\n            rule instead.")
    protected String maven;

    /**
     * Gets the value of the maven property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaven() {
        return maven;
    }

    /**
     * Sets the value of the maven property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaven(String value) {
        this.maven = value;
    }

}
