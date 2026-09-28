
package info.hubbitus.xjc.plugin.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import info.hubbitus.annotation.XsdInfo;


/**
 * Section for management of reports and their configuration.
 * 
 * &lt;p&gt;Java class for Reporting complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Reporting"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="excludeDefaults" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="outputDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="plugins" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="plugin" type="{http://maven.apache.org/POM/4.0.0}ReportPlugin" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
@XmlType(name = "Reporting", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@XsdInfo(name = "Section for management of reports and their configuration.", xsdElementPart = "<complexType name=\"Reporting\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <all>\n        <element name=\"excludeDefaults\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"outputDirectory\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"plugins\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <element name=\"plugin\" type=\"{http://maven.apache.org/POM/4.0.0}ReportPlugin\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n      </all>\n    </restriction>\n  </complexContent>\n</complexType>")
public class Reporting {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "If true, then the default reports are not included in the site generation.\n            This includes the reports in the \"Project Info\" menu. Note: While the type\n            of this field is <code>String</code> for technical reasons, the semantic type is actually\n            <code>Boolean</code>. Default value is <code>false</code>.")
    protected String excludeDefaults;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Where to store all of the generated reports. The default is\n            <code>${project.build.directory}/site</code>.")
    protected String outputDirectory;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The reporting plugins to use and their configuration.")
    protected Reporting.Plugins plugins;

    /**
     * Gets the value of the excludeDefaults property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExcludeDefaults() {
        return excludeDefaults;
    }

    /**
     * Sets the value of the excludeDefaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExcludeDefaults(String value) {
        this.excludeDefaults = value;
    }

    /**
     * Gets the value of the outputDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutputDirectory() {
        return outputDirectory;
    }

    /**
     * Sets the value of the outputDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutputDirectory(String value) {
        this.outputDirectory = value;
    }

    /**
     * Gets the value of the plugins property.
     * 
     * @return
     *     possible object is
     *     {@link Reporting.Plugins }
     *     
     */
    public Reporting.Plugins getPlugins() {
        return plugins;
    }

    /**
     * Sets the value of the plugins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reporting.Plugins }
     *     
     */
    public void setPlugins(Reporting.Plugins value) {
        this.plugins = value;
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
     *         &amp;lt;element name="plugin" type="{http://maven.apache.org/POM/4.0.0}ReportPlugin" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
        "plugins"
    })
    @XsdInfo(name = "", xsdElementPart = "<complexType>\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <sequence>\n        <element name=\"plugin\" type=\"{http://maven.apache.org/POM/4.0.0}ReportPlugin\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n      </sequence>\n    </restriction>\n  </complexContent>\n</complexType>")
    public static class Plugins {

        @XmlElement(name = "plugin", namespace = "http://maven.apache.org/POM/4.0.0")
        @XsdInfo(name = "")
        protected List<ReportPlugin> plugins;

        /**
         * Gets the value of the plugins property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the plugins property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getPlugins().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link ReportPlugin }
         * 
         * 
         */
        public List<ReportPlugin> getPlugins() {
            if (plugins == null) {
                plugins = new ArrayList<ReportPlugin>();
            }
            return this.plugins;
        }

    }

}
