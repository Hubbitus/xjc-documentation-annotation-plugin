
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
 *         The &lt;code&gt;&amp;lt;execution&amp;gt;&lt;/code&gt; element contains informations required for the
 *         execution of a plugin.
 *         
 *       
 * 
 * &lt;p&gt;Java class for PluginExecution complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="PluginExecution"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="phase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="goals" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="goal" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
@XmlType(name = "PluginExecution", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@XsdInfo(name = "The <code>&lt;execution&gt;</code> element contains informations required for the\n        execution of a plugin.", xsdElementPart = "<complexType name=\"PluginExecution\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <all>\n        <element name=\"id\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"phase\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"goals\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <element name=\"goal\" type=\"{http://www.w3.org/2001/XMLSchema}string\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n        <element name=\"inherited\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"configuration\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <any processContents='skip' maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n      </all>\n    </restriction>\n  </complexContent>\n</complexType>")
public class PluginExecution {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "default")
    @XsdInfo(name = "The identifier of this execution for labelling the goals during the build,\n            and for matching executions to merge during inheritance and profile injection.")
    protected String id;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The build lifecycle phase to bind the goals in this execution to. If omitted,\n            the goals will be bound to the default phase specified by the plugin.")
    protected String phase;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The goals to execute with the given configuration.")
    protected PluginExecution.Goals goals;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Whether any configuration should be propagated to child POMs. Note: While the type\n            of this field is <code>String</code> for technical reasons, the semantic type is actually\n            <code>Boolean</code>. Default value is <code>true</code>.")
    protected String inherited;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "<p>The configuration as DOM object.</p>\n            <p>By default, every element content is trimmed, but starting with Maven 3.1.0, you can add\n            <code>xml:space=\"preserve\"</code> to elements you want to preserve whitespace.</p>\n            <p>You can control how child POMs inherit configuration from parent POMs by adding <code>combine.children</code>\n            or <code>combine.self</code> attributes to the children of the configuration element:</p>\n            <ul>\n            <li><code>combine.children</code>: available values are <code>merge</code> (default) and <code>append</code>,</li>\n            <li><code>combine.self</code>: available values are <code>merge</code> (default) and <code>override</code>.</li>\n            </ul>\n            <p>See <a href=\"http://maven.apache.org/pom.html#Plugins\">POM Reference documentation</a> and\n            <a href=\"http://plexus.codehaus.org/plexus-utils/apidocs/org/codehaus/plexus/util/xml/Xpp3DomUtils.html\">Xpp3DomUtils</a>\n            for more information.</p>")
    protected PluginExecution.Configuration configuration;

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
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhase(String value) {
        this.phase = value;
    }

    /**
     * Gets the value of the goals property.
     * 
     * @return
     *     possible object is
     *     {@link PluginExecution.Goals }
     *     
     */
    public PluginExecution.Goals getGoals() {
        return goals;
    }

    /**
     * Sets the value of the goals property.
     * 
     * @param value
     *     allowed object is
     *     {@link PluginExecution.Goals }
     *     
     */
    public void setGoals(PluginExecution.Goals value) {
        this.goals = value;
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
     *     {@link PluginExecution.Configuration }
     *     
     */
    public PluginExecution.Configuration getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link PluginExecution.Configuration }
     *     
     */
    public void setConfiguration(PluginExecution.Configuration value) {
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
     *         &amp;lt;element name="goal" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
        "goals"
    })
    @XsdInfo(name = "", xsdElementPart = "<complexType>\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <sequence>\n        <element name=\"goal\" type=\"{http://www.w3.org/2001/XMLSchema}string\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n      </sequence>\n    </restriction>\n  </complexContent>\n</complexType>")
    public static class Goals {

        @XmlElement(name = "goal", namespace = "http://maven.apache.org/POM/4.0.0")
        @XsdInfo(name = "")
        protected List<String> goals;

        /**
         * Gets the value of the goals property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the goals property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getGoals().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getGoals() {
            if (goals == null) {
                goals = new ArrayList<String>();
            }
            return this.goals;
        }

    }

}
