
package info.hubbitus.xjc.plugin.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import info.hubbitus.annotation.XsdInfo;


/**
 * Describes the licenses for this project. This is used to generate the license
 *         page of the project's web site, as well as being taken into consideration in other reporting
 *         and validation. The licenses listed for the project are that of the project itself, and not
 *         of dependencies.
 * 
 * &lt;p&gt;Java class for License complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="License"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="distribution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/all&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "License", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@XsdInfo(name = "Describes the licenses for this project. This is used to generate the license\n        page of the project's web site, as well as being taken into consideration in other reporting\n        and validation. The licenses listed for the project are that of the project itself, and not\n        of dependencies.", xsdElementPart = "<complexType name=\"License\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <all>\n        <element name=\"name\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"url\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"distribution\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"comments\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n      </all>\n    </restriction>\n  </complexContent>\n</complexType>")
public class License {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The full legal name of the license.")
    protected String name;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The official url for the license text.")
    protected String url;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The primary method by which this project may be distributed.\n            <dl>\n              <dt>repo</dt>\n              <dd>may be downloaded from the Maven repository</dd>\n              <dt>manual</dt>\n              <dd>user must manually download and install the dependency.</dd>\n            </dl>")
    protected String distribution;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Addendum information pertaining to this license.")
    protected String comments;

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
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the distribution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribution() {
        return distribution;
    }

    /**
     * Sets the value of the distribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribution(String value) {
        this.distribution = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

}
