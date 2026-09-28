
package info.hubbitus.xjc.plugin.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import info.hubbitus.annotation.XsdInfo;


/**
 * This is an activator which will detect an operating system's attributes in order
 *         to activate its profile.
 * 
 * &lt;p&gt;Java class for ActivationOS complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ActivationOS"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="family" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="arch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/all&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivationOS", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@XsdInfo(name = "This is an activator which will detect an operating system's attributes in order\n        to activate its profile.", xsdElementPart = "<complexType name=\"ActivationOS\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <all>\n        <element name=\"name\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"family\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"arch\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"version\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n      </all>\n    </restriction>\n  </complexContent>\n</complexType>")
public class ActivationOS {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The name of the operating system to be used to activate the profile. This must be an exact match\n            of the <code>${os.name}</code> Java property, such as <code>Windows XP</code>.")
    protected String name;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The general family of the OS to be used to activate the profile, such as\n            <code>windows</code> or <code>unix</code>.")
    protected String family;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The architecture of the operating system to be used to activate the\n          profile.")
    protected String arch;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The version of the operating system to be used to activate the\n          profile.")
    protected String version;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the family property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamily() {
        return family;
    }

    /**
     * Sets the value of the family property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamily(String value) {
        this.family = value;
    }

    /**
     * Gets the value of the arch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArch() {
        return arch;
    }

    /**
     * Sets the value of the arch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArch(String value) {
        this.arch = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
