
package info.hubbitus.xjc.plugin.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import info.hubbitus.annotation.XsdInfo;
import org.w3c.dom.Element;


/**
 * 
 *         
 *         The &lt;code&gt;&amp;lt;plugin&amp;gt;&lt;/code&gt; element contains informations required for a report plugin.
 *         
 *       
 * 
 * &lt;p&gt;Java class for ReportPlugin complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="ReportPlugin"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="artifactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="reportSets" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="reportSet" type="{http://maven.apache.org/POM/4.0.0}ReportSet" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="inherited" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="configuration" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/all&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportPlugin", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@XsdInfo(name = "The <code>&lt;plugin&gt;</code> element contains informations required for a report plugin.", xsdElementPart = "<complexType name=\"ReportPlugin\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <all>\n        <element name=\"groupId\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"artifactId\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"version\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"reportSets\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <element name=\"reportSet\" type=\"{http://maven.apache.org/POM/4.0.0}ReportSet\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n        <element name=\"inherited\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"configuration\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <any processContents='skip' maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n      </all>\n    </restriction>\n  </complexContent>\n</complexType>")
public class ReportPlugin {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "org.apache.maven.plugins")
    @XsdInfo(name = "The group ID of the reporting plugin in the repository.")
    protected String groupId;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The artifact ID of the reporting plugin in the repository.")
    protected String artifactId;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The version of the reporting plugin to be used.")
    protected String version;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Multiple specifications of a set of reports, each having (possibly) different\n            configuration. This is the reporting parallel to an <code>execution</code> in the build.")
    protected ReportPlugin.ReportSets reportSets;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Whether any configuration should be propagated to child POMs. Note: While the type\n            of this field is <code>String</code> for technical reasons, the semantic type is actually\n            <code>Boolean</code>. Default value is <code>true</code>.")
    protected String inherited;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "<p>The configuration as DOM object.</p>\n            <p>By default, every element content is trimmed, but starting with Maven 3.1.0, you can add\n            <code>xml:space=\"preserve\"</code> to elements you want to preserve whitespace.</p>\n            <p>You can control how child POMs inherit configuration from parent POMs by adding <code>combine.children</code>\n            or <code>combine.self</code> attributes to the children of the configuration element:</p>\n            <ul>\n            <li><code>combine.children</code>: available values are <code>merge</code> (default) and <code>append</code>,</li>\n            <li><code>combine.self</code>: available values are <code>merge</code> (default) and <code>override</code>.</li>\n            </ul>\n            <p>See <a href=\"http://maven.apache.org/pom.html#Plugins\">POM Reference documentation</a> and\n            <a href=\"http://plexus.codehaus.org/plexus-utils/apidocs/org/codehaus/plexus/util/xml/Xpp3DomUtils.html\">Xpp3DomUtils</a>\n            for more information.</p>")
    protected ReportPlugin.Configuration configuration;

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
     * Gets the value of the reportSets property.
     * 
     * @return
     *     possible object is
     *     {@link ReportPlugin.ReportSets }
     *     
     */
    public ReportPlugin.ReportSets getReportSets() {
        return reportSets;
    }

    /**
     * Sets the value of the reportSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportPlugin.ReportSets }
     *     
     */
    public void setReportSets(ReportPlugin.ReportSets value) {
        this.reportSets = value;
    }

    /**
     * Gets the value of the inherited property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInherited() {
        return inherited;
    }

    /**
     * Sets the value of the inherited property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInherited(String value) {
        this.inherited = value;
    }

    /**
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link ReportPlugin.Configuration }
     *     
     */
    public ReportPlugin.Configuration getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportPlugin.Configuration }
     *     
     */
    public void setConfiguration(ReportPlugin.Configuration value) {
        this.configuration = value;
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
     *         &amp;lt;any processContents='skip' maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
        "elements"
    })
    @XsdInfo(name = "", xsdElementPart = "<complexType>\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <sequence>\n        <any processContents='skip' maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n      </sequence>\n    </restriction>\n  </complexContent>\n</complexType>")
    public static class Configuration {

        @XmlAnyElement
        @XsdInfo(name = "")
        protected List<Element> elements;

        /**
         * Gets the value of the elements property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the elements property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getElements().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link Element }
         * 
         * 
         */
        public List<Element> getElements() {
            if (elements == null) {
                elements = new ArrayList<Element>();
            }
            return this.elements;
        }

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
     *         &amp;lt;element name="reportSet" type="{http://maven.apache.org/POM/4.0.0}ReportSet" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
        "reportSets"
    })
    @XsdInfo(name = "", xsdElementPart = "<complexType>\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <sequence>\n        <element name=\"reportSet\" type=\"{http://maven.apache.org/POM/4.0.0}ReportSet\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n      </sequence>\n    </restriction>\n  </complexContent>\n</complexType>")
    public static class ReportSets {

        @XmlElement(name = "reportSet", namespace = "http://maven.apache.org/POM/4.0.0")
        @XsdInfo(name = "")
        protected List<ReportSet> reportSets;

        /**
         * Gets the value of the reportSets property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the reportSets property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getReportSets().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link ReportSet }
         * 
         * 
         */
        public List<ReportSet> getReportSets() {
            if (reportSets == null) {
                reportSets = new ArrayList<ReportSet>();
            }
            return this.reportSets;
        }

    }

}
