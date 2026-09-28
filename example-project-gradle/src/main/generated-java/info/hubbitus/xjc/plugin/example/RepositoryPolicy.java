
package info.hubbitus.xjc.plugin.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import info.hubbitus.annotation.XsdInfo;


/**
 * Download policy.
 * 
 * &lt;p&gt;Java class for RepositoryPolicy complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="RepositoryPolicy"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="updatePolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="checksumPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/all&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepositoryPolicy", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@XsdInfo(name = "Download policy.", xsdElementPart = "<complexType name=\"RepositoryPolicy\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <all>\n        <element name=\"enabled\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"updatePolicy\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"checksumPolicy\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n      </all>\n    </restriction>\n  </complexContent>\n</complexType>")
public class RepositoryPolicy {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Whether to use this repository for downloading this type of artifact. Note: While the type\n            of this field is <code>String</code> for technical reasons, the semantic type is actually\n            <code>Boolean</code>. Default value is <code>true</code>.")
    protected String enabled;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The frequency for downloading updates - can be\n            <code>always,</code>\n            <code>daily</code>\n            (default),\n            <code>interval:XXX</code>\n            (in minutes) or\n            <code>never</code>\n            (only if it doesn't exist locally).")
    protected String updatePolicy;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "What to do when verification of an artifact checksum fails. Valid values are\n            <code>ignore</code>\n            ,\n            <code>fail</code>\n            or\n            <code>warn</code>\n            (the default).")
    protected String checksumPolicy;

    /**
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnabled(String value) {
        this.enabled = value;
    }

    /**
     * Gets the value of the updatePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatePolicy() {
        return updatePolicy;
    }

    /**
     * Sets the value of the updatePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatePolicy(String value) {
        this.updatePolicy = value;
    }

    /**
     * Gets the value of the checksumPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecksumPolicy() {
        return checksumPolicy;
    }

    /**
     * Sets the value of the checksumPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecksumPolicy(String value) {
        this.checksumPolicy = value;
    }

}
