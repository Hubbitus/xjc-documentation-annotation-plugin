
package info.hubbitus.xjc.plugin.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import info.hubbitus.annotation.XsdInfo;


/**
 * 
 *         
 *         The &lt;code&gt;&amp;lt;exclusion&amp;gt;&lt;/code&gt; element contains informations required to exclude
 *         an artifact to the project.
 *         
 *       
 * 
 * &lt;p&gt;Java class for Exclusion complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Exclusion"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="artifactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/all&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Exclusion", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@XsdInfo(name = "The <code>&lt;exclusion&gt;</code> element contains informations required to exclude\n        an artifact to the project.", xsdElementPart = "<complexType name=\"Exclusion\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <all>\n        <element name=\"artifactId\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"groupId\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n      </all>\n    </restriction>\n  </complexContent>\n</complexType>")
public class Exclusion {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The artifact ID of the project to exclude.")
    protected String artifactId;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The group ID of the project to exclude.")
    protected String groupId;

    /**
     * Gets the value of the artifactId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArtifactId() {
        return artifactId;
    }

    /**
     * Sets the value of the artifactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArtifactId(String value) {
        this.artifactId = value;
    }

    /**
     * Gets the value of the groupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * Sets the value of the groupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupId(String value) {
        this.groupId = value;
    }

}
