
package info.hubbitus.xjc.plugin.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import info.hubbitus.annotation.XsdInfo;


/**
 * This is the property specification used to activate a profile. If the value field
 *         is empty, then the existence of the named property will activate the profile, otherwise it
 *         does a case-sensitive match against the property value as well.
 * 
 * &lt;p&gt;Java class for ActivationProperty complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ActivationProperty"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/all&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivationProperty", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@XsdInfo(name = "This is the property specification used to activate a profile. If the value field\n        is empty, then the existence of the named property will activate the profile, otherwise it\n        does a case-sensitive match against the property value as well.", xsdElementPart = "<complexType name=\"ActivationProperty\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <all>\n        <element name=\"name\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"value\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n      </all>\n    </restriction>\n  </complexContent>\n</complexType>")
public class ActivationProperty {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The name of the property to be used to activate a profile.")
    protected String name;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The value of the property required to activate a profile.")
    protected String value;

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
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
