
package info.hubbitus.xjc.plugin.example;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import info.hubbitus.annotation.XsdInfo;


/**
 * Пользователь
 * 
 * &lt;p&gt;Java class for Customer complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Customer"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer", propOrder = {
    "name",
    "age"
})
@XsdInfo(name = "Пользователь", xsdElementPart = "<complexType name=\"Customer\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <sequence>\n        <element name=\"name\" type=\"{http://www.w3.org/2001/XMLSchema}string\"/>\n        <element name=\"age\" type=\"{http://www.w3.org/2001/XMLSchema}positiveInteger\"/>\n      </sequence>\n    </restriction>\n  </complexContent>\n</complexType>")
public class Customer {

    @XmlElement(required = true)
    @XsdInfo(name = "Фамилия и имя")
    protected String name;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    @XsdInfo(name = "Возраст")
    protected BigInteger age;

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
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAge(BigInteger value) {
        this.age = value;
    }

}
