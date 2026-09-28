
package info.hubbitus.xjc.plugin.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import info.hubbitus.annotation.XsdInfo;


/**
 * Repository contains the information needed for deploying to the remote
 *         repository.
 * 
 * &lt;p&gt;Java class for DeploymentRepository complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="DeploymentRepository"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="uniqueVersion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="releases" type="{http://maven.apache.org/POM/4.0.0}RepositoryPolicy" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="snapshots" type="{http://maven.apache.org/POM/4.0.0}RepositoryPolicy" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="layout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/all&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeploymentRepository", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@XsdInfo(name = "Repository contains the information needed for deploying to the remote\n        repository.", xsdElementPart = "<complexType name=\"DeploymentRepository\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <all>\n        <element name=\"uniqueVersion\" type=\"{http://www.w3.org/2001/XMLSchema}boolean\" minOccurs=\"0\"/>\n        <element name=\"releases\" type=\"{http://maven.apache.org/POM/4.0.0}RepositoryPolicy\" minOccurs=\"0\"/>\n        <element name=\"snapshots\" type=\"{http://maven.apache.org/POM/4.0.0}RepositoryPolicy\" minOccurs=\"0\"/>\n        <element name=\"id\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"name\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"url\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"layout\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n      </all>\n    </restriction>\n  </complexContent>\n</complexType>")
public class DeploymentRepository {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "true")
    @XsdInfo(name = "Whether to assign snapshots a unique version comprised of the timestamp and\n            build number, or to use the same version each time")
    protected Boolean uniqueVersion;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "How to handle downloading of releases from this repository.")
    protected RepositoryPolicy releases;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "How to handle downloading of snapshots from this repository.")
    protected RepositoryPolicy snapshots;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "A unique identifier for a repository. This is used to match the repository\n            to configuration in the <code>settings.xml</code> file, for example. Furthermore, the identifier is\n            used during POM inheritance and profile injection to detect repositories that should be merged.")
    protected String id;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Human readable name of the repository.")
    protected String name;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The url of the repository, in the form <code>protocol://hostname/path</code>.")
    protected String url;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "default")
    @XsdInfo(name = "The type of layout this repository uses for locating and storing artifacts -\n            can be <code>legacy</code> or <code>default</code>.")
    protected String layout;

    /**
     * Gets the value of the uniqueVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUniqueVersion() {
        return uniqueVersion;
    }

    /**
     * Sets the value of the uniqueVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUniqueVersion(Boolean value) {
        this.uniqueVersion = value;
    }

    /**
     * Gets the value of the releases property.
     * 
     * @return
     *     possible object is
     *     {@link RepositoryPolicy }
     *     
     */
    public RepositoryPolicy getReleases() {
        return releases;
    }

    /**
     * Sets the value of the releases property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepositoryPolicy }
     *     
     */
    public void setReleases(RepositoryPolicy value) {
        this.releases = value;
    }

    /**
     * Gets the value of the snapshots property.
     * 
     * @return
     *     possible object is
     *     {@link RepositoryPolicy }
     *     
     */
    public RepositoryPolicy getSnapshots() {
        return snapshots;
    }

    /**
     * Sets the value of the snapshots property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepositoryPolicy }
     *     
     */
    public void setSnapshots(RepositoryPolicy value) {
        this.snapshots = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

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
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayout() {
        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayout(String value) {
        this.layout = value;
    }

}
