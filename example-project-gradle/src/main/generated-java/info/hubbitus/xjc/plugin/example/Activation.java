
package info.hubbitus.xjc.plugin.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import info.hubbitus.annotation.XsdInfo;


/**
 * The conditions within the build runtime environment which will trigger the
 *         automatic inclusion of the build profile. Multiple conditions can be defined, which must
 *         be all satisfied to activate the profile.
 *       
 * 
 * &lt;p&gt;Java class for Activation complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Activation"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="activeByDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="jdk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="os" type="{http://maven.apache.org/POM/4.0.0}ActivationOS" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="property" type="{http://maven.apache.org/POM/4.0.0}ActivationProperty" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="file" type="{http://maven.apache.org/POM/4.0.0}ActivationFile" minOccurs="0"/&amp;gt;
 *       &amp;lt;/all&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Activation", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@XsdInfo(name = "The conditions within the build runtime environment which will trigger the\n        automatic inclusion of the build profile. Multiple conditions can be defined, which must\n        be all satisfied to activate the profile.", xsdElementPart = "<complexType name=\"Activation\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <all>\n        <element name=\"activeByDefault\" type=\"{http://www.w3.org/2001/XMLSchema}boolean\" minOccurs=\"0\"/>\n        <element name=\"jdk\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"os\" type=\"{http://maven.apache.org/POM/4.0.0}ActivationOS\" minOccurs=\"0\"/>\n        <element name=\"property\" type=\"{http://maven.apache.org/POM/4.0.0}ActivationProperty\" minOccurs=\"0\"/>\n        <element name=\"file\" type=\"{http://maven.apache.org/POM/4.0.0}ActivationFile\" minOccurs=\"0\"/>\n      </all>\n    </restriction>\n  </complexContent>\n</complexType>")
public class Activation {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "false")
    @XsdInfo(name = "If set to true, this profile will be active unless another profile in this\n            pom is activated using the command line -P option or by one of that profile's\n            activators.")
    protected Boolean activeByDefault;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Specifies that this profile will be activated when a matching JDK is detected.\n            For example, <code>1.4</code> only activates on JDKs versioned 1.4,\n            while <code>!1.4</code> matches any JDK that is not version 1.4. Ranges are supported too:\n            <code>[1.5,)</code> activates when the JDK is 1.5 minimum.")
    protected String jdk;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Specifies that this profile will be activated when matching operating system\n            attributes are detected.")
    protected ActivationOS os;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Specifies that this profile will be activated when this system property is\n            specified.")
    protected ActivationProperty property;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Specifies that this profile will be activated based on existence of a file.")
    protected ActivationFile file;

    /**
     * Gets the value of the activeByDefault property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveByDefault() {
        return activeByDefault;
    }

    /**
     * Sets the value of the activeByDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveByDefault(Boolean value) {
        this.activeByDefault = value;
    }

    /**
     * Gets the value of the jdk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJdk() {
        return jdk;
    }

    /**
     * Sets the value of the jdk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJdk(String value) {
        this.jdk = value;
    }

    /**
     * Gets the value of the os property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationOS }
     *     
     */
    public ActivationOS getOs() {
        return os;
    }

    /**
     * Sets the value of the os property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationOS }
     *     
     */
    public void setOs(ActivationOS value) {
        this.os = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationProperty }
     *     
     */
    public ActivationProperty getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationProperty }
     *     
     */
    public void setProperty(ActivationProperty value) {
        this.property = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link ActivationFile }
     *     
     */
    public ActivationFile getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivationFile }
     *     
     */
    public void setFile(ActivationFile value) {
        this.file = value;
    }

}
