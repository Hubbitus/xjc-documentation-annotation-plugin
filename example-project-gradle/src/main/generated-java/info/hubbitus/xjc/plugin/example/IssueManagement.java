
package info.hubbitus.xjc.plugin.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import info.hubbitus.annotation.XsdInfo;


/**
 * Information about the issue tracking (or bug tracking) system used to manage this
 *         project.
 * 
 * &lt;p&gt;Java class for IssueManagement complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="IssueManagement"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="system" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/all&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssueManagement", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@XsdInfo(name = "Information about the issue tracking (or bug tracking) system used to manage this\n        project.", xsdElementPart = "<complexType name=\"IssueManagement\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <all>\n        <element name=\"system\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"url\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n      </all>\n    </restriction>\n  </complexContent>\n</complexType>")
public class IssueManagement {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The name of the issue management system, e.g. Bugzilla")
    protected String system;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "URL for the issue management system used by the project.")
    protected String url;

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystem(String value) {
        this.system = value;
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

}
