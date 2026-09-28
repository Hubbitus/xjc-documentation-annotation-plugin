
package info.hubbitus.xjc.plugin.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import info.hubbitus.annotation.XsdInfo;


/**
 * This is the file specification used to activate the profile. The &lt;code&gt;missing&lt;/code&gt; value
 *         is the location of a file that needs to exist, and if it doesn't, the profile will be
 *         activated. On the other hand, &lt;code&gt;exists&lt;/code&gt; will test for the existence of the file and if it is
 *         there, the profile will be activated.&lt;br/&gt;
 *         Variable interpolation for these file specifications is limited to &lt;code&gt;${basedir}&lt;/code&gt;,
 *         System properties and request properties.
 * 
 * &lt;p&gt;Java class for ActivationFile complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ActivationFile"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="missing" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="exists" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/all&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivationFile", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@XsdInfo(name = "This is the file specification used to activate the profile. The <code>missing</code> value\n        is the location of a file that needs to exist, and if it doesn't, the profile will be\n        activated. On the other hand, <code>exists</code> will test for the existence of the file and if it is\n        there, the profile will be activated.<br/>\n        Variable interpolation for these file specifications is limited to <code>${basedir}</code>,\n        System properties and request properties.", xsdElementPart = "<complexType name=\"ActivationFile\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <all>\n        <element name=\"missing\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"exists\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n      </all>\n    </restriction>\n  </complexContent>\n</complexType>")
public class ActivationFile {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The name of the file that must be missing to activate the\n          profile.")
    protected String missing;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The name of the file that must exist to activate the profile.")
    protected String exists;

    /**
     * Gets the value of the missing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMissing() {
        return missing;
    }

    /**
     * Sets the value of the missing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMissing(String value) {
        this.missing = value;
    }

    /**
     * Gets the value of the exists property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExists() {
        return exists;
    }

    /**
     * Sets the value of the exists property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExists(String value) {
        this.exists = value;
    }

}
