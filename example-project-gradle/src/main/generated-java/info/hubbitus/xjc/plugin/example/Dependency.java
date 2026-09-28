
package info.hubbitus.xjc.plugin.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import info.hubbitus.annotation.XsdInfo;


/**
 * 
 *         
 *         The &lt;code&gt;&amp;lt;dependency&amp;gt;&lt;/code&gt; element contains information about a dependency
 *         of the project.
 *         
 *       
 * 
 * &lt;p&gt;Java class for Dependency complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Dependency"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="artifactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="classifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="scope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="systemPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="exclusions" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="exclusion" type="{http://maven.apache.org/POM/4.0.0}Exclusion" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="optional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/all&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dependency", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@XsdInfo(name = "The <code>&lt;dependency&gt;</code> element contains information about a dependency\n        of the project.", xsdElementPart = "<complexType name=\"Dependency\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <all>\n        <element name=\"groupId\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"artifactId\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"version\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"type\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"classifier\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"scope\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"systemPath\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"exclusions\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <element name=\"exclusion\" type=\"{http://maven.apache.org/POM/4.0.0}Exclusion\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n        <element name=\"optional\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n      </all>\n    </restriction>\n  </complexContent>\n</complexType>")
public class Dependency {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The project group that produced the dependency, e.g.\n            <code>org.apache.maven</code>.")
    protected String groupId;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The unique id for an artifact produced by the project group, e.g.\n            <code>maven-artifact</code>.")
    protected String artifactId;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The version of the dependency, e.g. <code>3.2.1</code>. In Maven 2, this can also be\n            specified as a range of versions.")
    protected String version;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "jar")
    @XsdInfo(name = "The type of dependency. While it\n            usually represents the extension on the filename of the dependency,\n            that is not always the case. A type can be mapped to a different\n            extension and a classifier.\n            The type often corresponds to the packaging used, though this is also\n            not always the case.\n            Some examples are <code>jar</code>, <code>war</code>, <code>ejb-client</code>\n            and <code>test-jar</code>: see <a href=\"../maven-core/artifact-handlers.html\">default\n            artifact handlers</a> for a list.\n            New types can be defined by plugins that set\n            <code>extensions</code> to <code>true</code>, so this is not a complete list.")
    protected String type;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The classifier of the dependency. It is appended to\n            the filename after the version. This allows:\n            <ul>\n            <li>refering to attached artifact, for example <code>sources</code> and <code>javadoc</code>:\n            see <a href=\"../maven-core/artifact-handlers.html\">default artifact handlers</a> for a list,</li>\n            <li>distinguishing two artifacts\n            that belong to the same POM but were built differently.\n            For example, <code>jdk14</code> and <code>jdk15</code>.</li>\n            </ul>")
    protected String classifier;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The scope of the dependency - <code>compile</code>, <code>runtime</code>,\n            <code>test</code>, <code>system</code>, and <code>provided</code>. Used to\n            calculate the various classpaths used for compilation, testing, and so on.\n            It also assists in determining which artifacts to include in a distribution of\n            this project. For more information, see\n            <a href=\"http://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html\">the\n            dependency mechanism</a>.")
    protected String scope;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "FOR SYSTEM SCOPE ONLY. Note that use of this property is <b>discouraged</b>\n            and may be replaced in later versions. This specifies the path on the filesystem\n            for this dependency.\n            Requires an absolute path for the value, not relative.\n            Use a property that gives the machine specific absolute path,\n            e.g. <code>${java.home}</code>.")
    protected String systemPath;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Lists a set of artifacts that should be excluded from this dependency's\n            artifact list when it comes to calculating transitive dependencies.")
    protected Dependency.Exclusions exclusions;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Indicates the dependency is optional for use of this library. While the\n            version of the dependency will be taken into account for dependency calculation if the\n            library is used elsewhere, it will not be passed on transitively. Note: While the type\n            of this field is <code>String</code> for technical reasons, the semantic type is actually\n            <code>Boolean</code>. Default value is <code>false</code>.")
    protected String optional;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the classifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassifier() {
        return classifier;
    }

    /**
     * Sets the value of the classifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassifier(String value) {
        this.classifier = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScope() {
        return scope;
    }

    /**
     * Sets the value of the scope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScope(String value) {
        this.scope = value;
    }

    /**
     * Gets the value of the systemPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemPath() {
        return systemPath;
    }

    /**
     * Sets the value of the systemPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemPath(String value) {
        this.systemPath = value;
    }

    /**
     * Gets the value of the exclusions property.
     * 
     * @return
     *     possible object is
     *     {@link Dependency.Exclusions }
     *     
     */
    public Dependency.Exclusions getExclusions() {
        return exclusions;
    }

    /**
     * Sets the value of the exclusions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dependency.Exclusions }
     *     
     */
    public void setExclusions(Dependency.Exclusions value) {
        this.exclusions = value;
    }

    /**
     * Gets the value of the optional property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptional() {
        return optional;
    }

    /**
     * Sets the value of the optional property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptional(String value) {
        this.optional = value;
    }


    /**
     * &lt;p&gt;Java class for anonymous complex type.
     * 
     * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="exclusion" type="{http://maven.apache.org/POM/4.0.0}Exclusion" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "exclusions"
    })
    @XsdInfo(name = "", xsdElementPart = "<complexType>\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <sequence>\n        <element name=\"exclusion\" type=\"{http://maven.apache.org/POM/4.0.0}Exclusion\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n      </sequence>\n    </restriction>\n  </complexContent>\n</complexType>")
    public static class Exclusions {

        @XmlElement(name = "exclusion", namespace = "http://maven.apache.org/POM/4.0.0")
        @XsdInfo(name = "")
        protected List<Exclusion> exclusions;

        /**
         * Gets the value of the exclusions property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the exclusions property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getExclusions().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link Exclusion }
         * 
         * 
         */
        public List<Exclusion> getExclusions() {
            if (exclusions == null) {
                exclusions = new ArrayList<Exclusion>();
            }
            return this.exclusions;
        }

    }

}
