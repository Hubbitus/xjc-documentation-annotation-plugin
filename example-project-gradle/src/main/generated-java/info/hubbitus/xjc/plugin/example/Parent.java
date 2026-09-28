
package info.hubbitus.xjc.plugin.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import info.hubbitus.annotation.XsdInfo;


/**
 * 
 *         
 *         The &lt;code&gt;&amp;lt;parent&amp;gt;&lt;/code&gt; element contains information required to locate the parent project from which
 *         this project will inherit from.
 *         &lt;strong&gt;Note:&lt;/strong&gt; The children of this element are not interpolated and must be given as literal values.
 *         
 *       
 * 
 * &lt;p&gt;Java class for Parent complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Parent"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="artifactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="relativePath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/all&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Parent", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@XsdInfo(name = "The <code>&lt;parent&gt;</code> element contains information required to locate the parent project from which\n        this project will inherit from.\n        <strong>Note:</strong> The children of this element are not interpolated and must be given as literal values.", xsdElementPart = "<complexType name=\"Parent\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <all>\n        <element name=\"groupId\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"artifactId\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"version\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"relativePath\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n      </all>\n    </restriction>\n  </complexContent>\n</complexType>")
public class Parent {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The group id of the parent project to inherit from.")
    protected String groupId;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The artifact id of the parent project to inherit from.")
    protected String artifactId;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The version of the parent project to inherit.")
    protected String version;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "../pom.xml")
    @XsdInfo(name = "The relative path of the parent <code>pom.xml</code> file within the check out.\n            If not specified, it defaults to <code>../pom.xml</code>.\n            Maven looks for the parent POM first in this location on\n            the filesystem, then the local repository, and lastly in the remote repo.\n            <code>relativePath</code> allows you to select a different location,\n            for example when your structure is flat, or deeper without an intermediate parent POM.\n            However, the group ID, artifact ID and version are still required,\n            and must match the file in the location given or it will revert to the repository for the POM.\n            This feature is only for enhancing the development in a local checkout of that project.\n            Set the value to an empty string in case you want to disable the feature and always resolve\n            the parent POM from the repositories.")
    protected String relativePath;

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

    /**
     * Gets the value of the relativePath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelativePath() {
        return relativePath;
    }

    /**
     * Sets the value of the relativePath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelativePath(String value) {
        this.relativePath = value;
    }

}
