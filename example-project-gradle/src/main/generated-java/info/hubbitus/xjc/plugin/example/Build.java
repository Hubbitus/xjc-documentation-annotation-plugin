
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
 *         The &lt;code&gt;&amp;lt;build&amp;gt;&lt;/code&gt; element contains informations required to build the project.
 *         Default values are defined in Super POM.
 *         
 *       
 * 
 * &lt;p&gt;Java class for Build complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Build"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="sourceDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="scriptSourceDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="testSourceDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="outputDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="testOutputDirectory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="extensions" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="extension" type="{http://maven.apache.org/POM/4.0.0}Extension" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="defaultGoal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="resources" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="resource" type="{http://maven.apache.org/POM/4.0.0}Resource" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="testResources" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="testResource" type="{http://maven.apache.org/POM/4.0.0}Resource" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="directory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="finalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="filters" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="filter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="pluginManagement" type="{http://maven.apache.org/POM/4.0.0}PluginManagement" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="plugins" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="plugin" type="{http://maven.apache.org/POM/4.0.0}Plugin" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
@XmlType(name = "Build", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@XsdInfo(name = "The <code>&lt;build&gt;</code> element contains informations required to build the project.\n        Default values are defined in Super POM.", xsdElementPart = "<complexType name=\"Build\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <all>\n        <element name=\"sourceDirectory\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"scriptSourceDirectory\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"testSourceDirectory\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"outputDirectory\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"testOutputDirectory\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"extensions\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <element name=\"extension\" type=\"{http://maven.apache.org/POM/4.0.0}Extension\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n        <element name=\"defaultGoal\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"resources\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <element name=\"resource\" type=\"{http://maven.apache.org/POM/4.0.0}Resource\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n        <element name=\"testResources\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <element name=\"testResource\" type=\"{http://maven.apache.org/POM/4.0.0}Resource\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n        <element name=\"directory\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"finalName\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"filters\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <element name=\"filter\" type=\"{http://www.w3.org/2001/XMLSchema}string\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n        <element name=\"pluginManagement\" type=\"{http://maven.apache.org/POM/4.0.0}PluginManagement\" minOccurs=\"0\"/>\n        <element name=\"plugins\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <element name=\"plugin\" type=\"{http://maven.apache.org/POM/4.0.0}Plugin\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n      </all>\n    </restriction>\n  </complexContent>\n</complexType>")
public class Build {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "This element specifies a directory containing the source of the project. The\n            generated build system will compile the sources from this directory when the project is\n            built. The path given is relative to the project descriptor.\n            The default value is <code>src/main/java</code>.")
    protected String sourceDirectory;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "This element specifies a directory containing the script sources of the\n            project. This directory is meant to be different from the sourceDirectory, in that its\n            contents will be copied to the output directory in most cases (since scripts are\n            interpreted rather than compiled).\n            The default value is <code>src/main/scripts</code>.")
    protected String scriptSourceDirectory;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "This element specifies a directory containing the unit test source of the\n            project. The generated build system will compile these directories when the project is\n            being tested. The path given is relative to the project descriptor.\n            The default value is <code>src/test/java</code>.")
    protected String testSourceDirectory;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The directory where compiled application classes are placed.\n            The default value is <code>target/classes</code>.")
    protected String outputDirectory;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The directory where compiled test classes are placed.\n            The default value is <code>target/test-classes</code>.")
    protected String testOutputDirectory;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "A set of build extensions to use from this project.")
    protected Build.Extensions extensions;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The default goal (or phase in Maven 2) to execute when none is specified for\n            the project. Note that in case of a multi-module build, only the default goal of the top-level\n            project is relevant, i.e. the default goals of child modules are ignored. Since Maven 3,\n            multiple goals/phases can be separated by whitespace.")
    protected String defaultGoal;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "This element describes all of the classpath resources such as properties\n            files associated with a project. These resources are often included in the final\n            package.\n            The default value is <code>src/main/resources</code>.")
    protected Build.Resources resources;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "This element describes all of the classpath resources such as properties\n            files associated with a project's unit tests.\n            The default value is <code>src/test/resources</code>.")
    protected Build.TestResources testResources;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The directory where all files generated by the build are placed.\n            The default value is <code>target</code>.")
    protected String directory;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The filename (excluding the extension, and with no path information) that\n            the produced artifact will be called.\n            The default value is <code>${artifactId}-${version}</code>.")
    protected String finalName;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The list of filter properties files that are used when filtering is enabled.")
    protected Build.Filters filters;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Default plugin information to be made available for reference by projects\n            derived from this one. This plugin configuration will not be resolved or bound to the\n            lifecycle unless referenced. Any local configuration for a given plugin will override\n            the plugin's entire definition here.")
    protected PluginManagement pluginManagement;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The list of plugins to use.")
    protected Build.Plugins plugins;

    /**
     * Gets the value of the sourceDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDirectory() {
        return sourceDirectory;
    }

    /**
     * Sets the value of the sourceDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDirectory(String value) {
        this.sourceDirectory = value;
    }

    /**
     * Gets the value of the scriptSourceDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptSourceDirectory() {
        return scriptSourceDirectory;
    }

    /**
     * Sets the value of the scriptSourceDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptSourceDirectory(String value) {
        this.scriptSourceDirectory = value;
    }

    /**
     * Gets the value of the testSourceDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestSourceDirectory() {
        return testSourceDirectory;
    }

    /**
     * Sets the value of the testSourceDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestSourceDirectory(String value) {
        this.testSourceDirectory = value;
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
     * Gets the value of the testOutputDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestOutputDirectory() {
        return testOutputDirectory;
    }

    /**
     * Sets the value of the testOutputDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestOutputDirectory(String value) {
        this.testOutputDirectory = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link Build.Extensions }
     *     
     */
    public Build.Extensions getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Build.Extensions }
     *     
     */
    public void setExtensions(Build.Extensions value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the defaultGoal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultGoal() {
        return defaultGoal;
    }

    /**
     * Sets the value of the defaultGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultGoal(String value) {
        this.defaultGoal = value;
    }

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link Build.Resources }
     *     
     */
    public Build.Resources getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link Build.Resources }
     *     
     */
    public void setResources(Build.Resources value) {
        this.resources = value;
    }

    /**
     * Gets the value of the testResources property.
     * 
     * @return
     *     possible object is
     *     {@link Build.TestResources }
     *     
     */
    public Build.TestResources getTestResources() {
        return testResources;
    }

    /**
     * Sets the value of the testResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link Build.TestResources }
     *     
     */
    public void setTestResources(Build.TestResources value) {
        this.testResources = value;
    }

    /**
     * Gets the value of the directory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectory() {
        return directory;
    }

    /**
     * Sets the value of the directory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectory(String value) {
        this.directory = value;
    }

    /**
     * Gets the value of the finalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinalName() {
        return finalName;
    }

    /**
     * Sets the value of the finalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinalName(String value) {
        this.finalName = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * @return
     *     possible object is
     *     {@link Build.Filters }
     *     
     */
    public Build.Filters getFilters() {
        return filters;
    }

    /**
     * Sets the value of the filters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Build.Filters }
     *     
     */
    public void setFilters(Build.Filters value) {
        this.filters = value;
    }

    /**
     * Gets the value of the pluginManagement property.
     * 
     * @return
     *     possible object is
     *     {@link PluginManagement }
     *     
     */
    public PluginManagement getPluginManagement() {
        return pluginManagement;
    }

    /**
     * Sets the value of the pluginManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PluginManagement }
     *     
     */
    public void setPluginManagement(PluginManagement value) {
        this.pluginManagement = value;
    }

    /**
     * Gets the value of the plugins property.
     * 
     * @return
     *     possible object is
     *     {@link Build.Plugins }
     *     
     */
    public Build.Plugins getPlugins() {
        return plugins;
    }

    /**
     * Sets the value of the plugins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Build.Plugins }
     *     
     */
    public void setPlugins(Build.Plugins value) {
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
     *         &amp;lt;element name="extension" type="{http://maven.apache.org/POM/4.0.0}Extension" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
        "extensions"
    })
    @XsdInfo(name = "", xsdElementPart = "<complexType>\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <sequence>\n        <element name=\"extension\" type=\"{http://maven.apache.org/POM/4.0.0}Extension\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n      </sequence>\n    </restriction>\n  </complexContent>\n</complexType>")
    public static class Extensions {

        @XmlElement(name = "extension", namespace = "http://maven.apache.org/POM/4.0.0")
        @XsdInfo(name = "")
        protected List<Extension> extensions;

        /**
         * Gets the value of the extensions property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the extensions property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getExtensions().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link Extension }
         * 
         * 
         */
        public List<Extension> getExtensions() {
            if (extensions == null) {
                extensions = new ArrayList<Extension>();
            }
            return this.extensions;
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
     *         &amp;lt;element name="filter" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
        "filters"
    })
    @XsdInfo(name = "", xsdElementPart = "<complexType>\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <sequence>\n        <element name=\"filter\" type=\"{http://www.w3.org/2001/XMLSchema}string\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n      </sequence>\n    </restriction>\n  </complexContent>\n</complexType>")
    public static class Filters {

        @XmlElement(name = "filter", namespace = "http://maven.apache.org/POM/4.0.0")
        @XsdInfo(name = "")
        protected List<String> filters;

        /**
         * Gets the value of the filters property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the filters property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getFilters().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFilters() {
            if (filters == null) {
                filters = new ArrayList<String>();
            }
            return this.filters;
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
     *         &amp;lt;element name="plugin" type="{http://maven.apache.org/POM/4.0.0}Plugin" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
    @XsdInfo(name = "", xsdElementPart = "<complexType>\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <sequence>\n        <element name=\"plugin\" type=\"{http://maven.apache.org/POM/4.0.0}Plugin\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n      </sequence>\n    </restriction>\n  </complexContent>\n</complexType>")
    public static class Plugins {

        @XmlElement(name = "plugin", namespace = "http://maven.apache.org/POM/4.0.0")
        @XsdInfo(name = "")
        protected List<Plugin> plugins;

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
         * {@link Plugin }
         * 
         * 
         */
        public List<Plugin> getPlugins() {
            if (plugins == null) {
                plugins = new ArrayList<Plugin>();
            }
            return this.plugins;
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
     *         &amp;lt;element name="resource" type="{http://maven.apache.org/POM/4.0.0}Resource" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
        "resources"
    })
    @XsdInfo(name = "", xsdElementPart = "<complexType>\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <sequence>\n        <element name=\"resource\" type=\"{http://maven.apache.org/POM/4.0.0}Resource\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n      </sequence>\n    </restriction>\n  </complexContent>\n</complexType>")
    public static class Resources {

        @XmlElement(name = "resource", namespace = "http://maven.apache.org/POM/4.0.0")
        @XsdInfo(name = "")
        protected List<Resource> resources;

        /**
         * Gets the value of the resources property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the resources property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getResources().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link Resource }
         * 
         * 
         */
        public List<Resource> getResources() {
            if (resources == null) {
                resources = new ArrayList<Resource>();
            }
            return this.resources;
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
     *         &amp;lt;element name="testResource" type="{http://maven.apache.org/POM/4.0.0}Resource" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
        "testResources"
    })
    @XsdInfo(name = "", xsdElementPart = "<complexType>\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <sequence>\n        <element name=\"testResource\" type=\"{http://maven.apache.org/POM/4.0.0}Resource\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n      </sequence>\n    </restriction>\n  </complexContent>\n</complexType>")
    public static class TestResources {

        @XmlElement(name = "testResource", namespace = "http://maven.apache.org/POM/4.0.0")
        @XsdInfo(name = "")
        protected List<Resource> testResources;

        /**
         * Gets the value of the testResources property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the testResources property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getTestResources().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link Resource }
         * 
         * 
         */
        public List<Resource> getTestResources() {
            if (testResources == null) {
                testResources = new ArrayList<Resource>();
            }
            return this.testResources;
        }

    }

}
