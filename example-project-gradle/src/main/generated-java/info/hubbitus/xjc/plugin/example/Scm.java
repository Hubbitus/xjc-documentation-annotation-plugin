
package info.hubbitus.xjc.plugin.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import info.hubbitus.annotation.XsdInfo;


/**
 * 
 *         
 *         The &lt;code&gt;&amp;lt;scm&amp;gt;&lt;/code&gt; element contains informations required to the SCM
 *         (Source Control Management) of the project.
 *         
 *       
 * 
 * &lt;p&gt;Java class for Scm complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Scm"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="connection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="developerConnection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
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
@XmlType(name = "Scm", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@XsdInfo(name = "The <code>&lt;scm&gt;</code> element contains informations required to the SCM\n        (Source Control Management) of the project.", xsdElementPart = "<complexType name=\"Scm\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <all>\n        <element name=\"connection\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"developerConnection\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"tag\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"url\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n      </all>\n    </restriction>\n  </complexContent>\n</complexType>")
public class Scm {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The source control management system URL\n            that describes the repository and how to connect to the\n            repository. For more information, see the\n            <a href=\"http://maven.apache.org/scm/scm-url-format.html\">URL format</a>\n            and <a href=\"http://maven.apache.org/scm/scms-overview.html\">list of supported SCMs</a>.\n            This connection is read-only.\n            <br /><b>Default value is</b>: parent value [+ path adjustment] + artifactId")
    protected String connection;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Just like <code>connection</code>, but for developers, i.e. this scm connection\n            will not be read only.\n            <br /><b>Default value is</b>: parent value [+ path adjustment] + artifactId")
    protected String developerConnection;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "HEAD")
    @XsdInfo(name = "The tag of current code. By default, it's set to HEAD during development.")
    protected String tag;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The URL to the project's browsable SCM repository, such as ViewVC or Fisheye.\n            <br /><b>Default value is</b>: parent value [+ path adjustment] + artifactId")
    protected String url;

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnection(String value) {
        this.connection = value;
    }

    /**
     * Gets the value of the developerConnection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeveloperConnection() {
        return developerConnection;
    }

    /**
     * Sets the value of the developerConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeveloperConnection(String value) {
        this.developerConnection = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Sets the value of the tag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
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
