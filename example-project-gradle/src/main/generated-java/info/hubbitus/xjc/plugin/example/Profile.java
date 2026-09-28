
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
 * Modifications to the build process which is activated based on environmental
 *         parameters or command line arguments.
 * 
 * &lt;p&gt;Java class for Profile complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Profile"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="activation" type="{http://maven.apache.org/POM/4.0.0}Activation" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="build" type="{http://maven.apache.org/POM/4.0.0}BuildBase" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="modules" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="module" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="distributionManagement" type="{http://maven.apache.org/POM/4.0.0}DistributionManagement" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="properties" minOccurs="0"&amp;gt;
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
 *         &amp;lt;element name="dependencyManagement" type="{http://maven.apache.org/POM/4.0.0}DependencyManagement" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="dependencies" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="dependency" type="{http://maven.apache.org/POM/4.0.0}Dependency" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="repositories" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="repository" type="{http://maven.apache.org/POM/4.0.0}Repository" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="pluginRepositories" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="pluginRepository" type="{http://maven.apache.org/POM/4.0.0}Repository" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="reports" minOccurs="0"&amp;gt;
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
 *         &amp;lt;element name="reporting" type="{http://maven.apache.org/POM/4.0.0}Reporting" minOccurs="0"/&amp;gt;
 *       &amp;lt;/all&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@XsdInfo(name = "Modifications to the build process which is activated based on environmental\n        parameters or command line arguments.", xsdElementPart = "<complexType name=\"Profile\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <all>\n        <element name=\"id\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"activation\" type=\"{http://maven.apache.org/POM/4.0.0}Activation\" minOccurs=\"0\"/>\n        <element name=\"build\" type=\"{http://maven.apache.org/POM/4.0.0}BuildBase\" minOccurs=\"0\"/>\n        <element name=\"modules\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <element name=\"module\" type=\"{http://www.w3.org/2001/XMLSchema}string\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n        <element name=\"distributionManagement\" type=\"{http://maven.apache.org/POM/4.0.0}DistributionManagement\" minOccurs=\"0\"/>\n        <element name=\"properties\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <any processContents='skip' maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n        <element name=\"dependencyManagement\" type=\"{http://maven.apache.org/POM/4.0.0}DependencyManagement\" minOccurs=\"0\"/>\n        <element name=\"dependencies\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <element name=\"dependency\" type=\"{http://maven.apache.org/POM/4.0.0}Dependency\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n        <element name=\"repositories\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <element name=\"repository\" type=\"{http://maven.apache.org/POM/4.0.0}Repository\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n        <element name=\"pluginRepositories\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <element name=\"pluginRepository\" type=\"{http://maven.apache.org/POM/4.0.0}Repository\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n        <element name=\"reports\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <any processContents='skip' maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n        <element name=\"reporting\" type=\"{http://maven.apache.org/POM/4.0.0}Reporting\" minOccurs=\"0\"/>\n      </all>\n    </restriction>\n  </complexContent>\n</complexType>")
public class Profile {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "default")
    @XsdInfo(name = "The identifier of this build profile. This is used for command line\n            activation, and identifies profiles to be merged.")
    protected String id;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The conditional logic which will automatically trigger the inclusion of this\n            profile.")
    protected Activation activation;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Information required to build the project.")
    protected BuildBase build;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The modules (sometimes called subprojects) to build as a part of this\n            project. Each module listed is a relative path to the directory containing the module.\n            To be consistent with the way default urls are calculated from parent, it is recommended\n            to have module names match artifact ids.")
    protected Profile.Modules modules;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Distribution information for a project that enables deployment of the site\n            and artifacts to remote web servers and repositories respectively.")
    protected DistributionManagement distributionManagement;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Properties that can be used throughout the POM as a substitution, and\n            are used as filters in resources if enabled.\n            The format is <code>&lt;name&gt;value&lt;/name&gt;</code>.")
    protected Profile.Properties properties;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Default dependency information for projects that inherit from this one. The\n            dependencies in this section are not immediately resolved. Instead, when a POM derived\n            from this one declares a dependency described by a matching groupId and artifactId, the\n            version and other values from this section are used for that dependency if they were not\n            already specified.")
    protected DependencyManagement dependencyManagement;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "This element describes all of the dependencies associated with a\n            project.\n            These dependencies are used to construct a classpath for your\n            project during the build process. They are automatically downloaded from the\n            repositories defined in this project.\n            See <a href=\"http://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html\">the\n            dependency mechanism</a> for more information.")
    protected Profile.Dependencies dependencies;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The lists of the remote repositories for discovering dependencies and\n            extensions.")
    protected Profile.Repositories repositories;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The lists of the remote repositories for discovering plugins for builds and\n            reports.")
    protected Profile.PluginRepositories pluginRepositories;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "<b>Deprecated</b>. Now ignored by Maven.")
    protected Profile.Reports reports;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "This element includes the specification of report plugins to use\n            to generate the reports on the Maven-generated site.\n            These reports will be run when a user executes <code>mvn site</code>.\n            All of the reports will be included in the navigation bar for browsing.")
    protected Reporting reporting;

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
     * Gets the value of the activation property.
     * 
     * @return
     *     possible object is
     *     {@link Activation }
     *     
     */
    public Activation getActivation() {
        return activation;
    }

    /**
     * Sets the value of the activation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Activation }
     *     
     */
    public void setActivation(Activation value) {
        this.activation = value;
    }

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link BuildBase }
     *     
     */
    public BuildBase getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildBase }
     *     
     */
    public void setBuild(BuildBase value) {
        this.build = value;
    }

    /**
     * Gets the value of the modules property.
     * 
     * @return
     *     possible object is
     *     {@link Profile.Modules }
     *     
     */
    public Profile.Modules getModules() {
        return modules;
    }

    /**
     * Sets the value of the modules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profile.Modules }
     *     
     */
    public void setModules(Profile.Modules value) {
        this.modules = value;
    }

    /**
     * Gets the value of the distributionManagement property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionManagement }
     *     
     */
    public DistributionManagement getDistributionManagement() {
        return distributionManagement;
    }

    /**
     * Sets the value of the distributionManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionManagement }
     *     
     */
    public void setDistributionManagement(DistributionManagement value) {
        this.distributionManagement = value;
    }

    /**
     * Gets the value of the properties property.
     * 
     * @return
     *     possible object is
     *     {@link Profile.Properties }
     *     
     */
    public Profile.Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profile.Properties }
     *     
     */
    public void setProperties(Profile.Properties value) {
        this.properties = value;
    }

    /**
     * Gets the value of the dependencyManagement property.
     * 
     * @return
     *     possible object is
     *     {@link DependencyManagement }
     *     
     */
    public DependencyManagement getDependencyManagement() {
        return dependencyManagement;
    }

    /**
     * Sets the value of the dependencyManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link DependencyManagement }
     *     
     */
    public void setDependencyManagement(DependencyManagement value) {
        this.dependencyManagement = value;
    }

    /**
     * Gets the value of the dependencies property.
     * 
     * @return
     *     possible object is
     *     {@link Profile.Dependencies }
     *     
     */
    public Profile.Dependencies getDependencies() {
        return dependencies;
    }

    /**
     * Sets the value of the dependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profile.Dependencies }
     *     
     */
    public void setDependencies(Profile.Dependencies value) {
        this.dependencies = value;
    }

    /**
     * Gets the value of the repositories property.
     * 
     * @return
     *     possible object is
     *     {@link Profile.Repositories }
     *     
     */
    public Profile.Repositories getRepositories() {
        return repositories;
    }

    /**
     * Sets the value of the repositories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profile.Repositories }
     *     
     */
    public void setRepositories(Profile.Repositories value) {
        this.repositories = value;
    }

    /**
     * Gets the value of the pluginRepositories property.
     * 
     * @return
     *     possible object is
     *     {@link Profile.PluginRepositories }
     *     
     */
    public Profile.PluginRepositories getPluginRepositories() {
        return pluginRepositories;
    }

    /**
     * Sets the value of the pluginRepositories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profile.PluginRepositories }
     *     
     */
    public void setPluginRepositories(Profile.PluginRepositories value) {
        this.pluginRepositories = value;
    }

    /**
     * Gets the value of the reports property.
     * 
     * @return
     *     possible object is
     *     {@link Profile.Reports }
     *     
     */
    public Profile.Reports getReports() {
        return reports;
    }

    /**
     * Sets the value of the reports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Profile.Reports }
     *     
     */
    public void setReports(Profile.Reports value) {
        this.reports = value;
    }

    /**
     * Gets the value of the reporting property.
     * 
     * @return
     *     possible object is
     *     {@link Reporting }
     *     
     */
    public Reporting getReporting() {
        return reporting;
    }

    /**
     * Sets the value of the reporting property.
     * 
     * @param value
     *     allowed object is
     *     {@link Reporting }
     *     
     */
    public void setReporting(Reporting value) {
        this.reporting = value;
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
     *         &amp;lt;element name="dependency" type="{http://maven.apache.org/POM/4.0.0}Dependency" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
        "dependencies"
    })
    @XsdInfo(name = "", xsdElementPart = "<complexType>\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <sequence>\n        <element name=\"dependency\" type=\"{http://maven.apache.org/POM/4.0.0}Dependency\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n      </sequence>\n    </restriction>\n  </complexContent>\n</complexType>")
    public static class Dependencies {

        @XmlElement(name = "dependency", namespace = "http://maven.apache.org/POM/4.0.0")
        @XsdInfo(name = "")
        protected List<Dependency> dependencies;

        /**
         * Gets the value of the dependencies property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the dependencies property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getDependencies().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link Dependency }
         * 
         * 
         */
        public List<Dependency> getDependencies() {
            if (dependencies == null) {
                dependencies = new ArrayList<Dependency>();
            }
            return this.dependencies;
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
     *         &amp;lt;element name="module" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
        "modules"
    })
    @XsdInfo(name = "", xsdElementPart = "<complexType>\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <sequence>\n        <element name=\"module\" type=\"{http://www.w3.org/2001/XMLSchema}string\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n      </sequence>\n    </restriction>\n  </complexContent>\n</complexType>")
    public static class Modules {

        @XmlElement(name = "module", namespace = "http://maven.apache.org/POM/4.0.0")
        @XsdInfo(name = "")
        protected List<String> modules;

        /**
         * Gets the value of the modules property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the modules property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getModules().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getModules() {
            if (modules == null) {
                modules = new ArrayList<String>();
            }
            return this.modules;
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
     *         &amp;lt;element name="pluginRepository" type="{http://maven.apache.org/POM/4.0.0}Repository" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
        "pluginRepositories"
    })
    @XsdInfo(name = "", xsdElementPart = "<complexType>\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <sequence>\n        <element name=\"pluginRepository\" type=\"{http://maven.apache.org/POM/4.0.0}Repository\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n      </sequence>\n    </restriction>\n  </complexContent>\n</complexType>")
    public static class PluginRepositories {

        @XmlElement(name = "pluginRepository", namespace = "http://maven.apache.org/POM/4.0.0")
        @XsdInfo(name = "")
        protected List<Repository> pluginRepositories;

        /**
         * Gets the value of the pluginRepositories property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the pluginRepositories property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getPluginRepositories().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link Repository }
         * 
         * 
         */
        public List<Repository> getPluginRepositories() {
            if (pluginRepositories == null) {
                pluginRepositories = new ArrayList<Repository>();
            }
            return this.pluginRepositories;
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
    public static class Properties {

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
    public static class Reports {

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
     *         &amp;lt;element name="repository" type="{http://maven.apache.org/POM/4.0.0}Repository" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
        "repositories"
    })
    @XsdInfo(name = "", xsdElementPart = "<complexType>\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <sequence>\n        <element name=\"repository\" type=\"{http://maven.apache.org/POM/4.0.0}Repository\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n      </sequence>\n    </restriction>\n  </complexContent>\n</complexType>")
    public static class Repositories {

        @XmlElement(name = "repository", namespace = "http://maven.apache.org/POM/4.0.0")
        @XsdInfo(name = "")
        protected List<Repository> repositories;

        /**
         * Gets the value of the repositories property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the repositories property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getRepositories().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link Repository }
         * 
         * 
         */
        public List<Repository> getRepositories() {
            if (repositories == null) {
                repositories = new ArrayList<Repository>();
            }
            return this.repositories;
        }

    }

}
