
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
 * Configures one method for notifying users/developers when a build breaks.
 * 
 * &lt;p&gt;Java class for Notifier complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Notifier"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sendOnError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sendOnFailure" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sendOnSuccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="sendOnWarning" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
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
@XmlType(name = "Notifier", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@XsdInfo(name = "Configures one method for notifying users/developers when a build breaks.", xsdElementPart = "<complexType name=\"Notifier\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <all>\n        <element name=\"type\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"sendOnError\" type=\"{http://www.w3.org/2001/XMLSchema}boolean\" minOccurs=\"0\"/>\n        <element name=\"sendOnFailure\" type=\"{http://www.w3.org/2001/XMLSchema}boolean\" minOccurs=\"0\"/>\n        <element name=\"sendOnSuccess\" type=\"{http://www.w3.org/2001/XMLSchema}boolean\" minOccurs=\"0\"/>\n        <element name=\"sendOnWarning\" type=\"{http://www.w3.org/2001/XMLSchema}boolean\" minOccurs=\"0\"/>\n        <element name=\"address\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"configuration\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <any processContents='skip' maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n      </all>\n    </restriction>\n  </complexContent>\n</complexType>")
public class Notifier {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "mail")
    @XsdInfo(name = "The mechanism used to deliver notifications.")
    protected String type;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "true")
    @XsdInfo(name = "Whether to send notifications on error.")
    protected Boolean sendOnError;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "true")
    @XsdInfo(name = "Whether to send notifications on failure.")
    protected Boolean sendOnFailure;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "true")
    @XsdInfo(name = "Whether to send notifications on success.")
    protected Boolean sendOnSuccess;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "true")
    @XsdInfo(name = "Whether to send notifications on warning.")
    protected Boolean sendOnWarning;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "<b>Deprecated</b>. Where to send the notification to - eg email address.")
    protected String address;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Extended configuration specific to this notifier goes here.")
    protected Notifier.Configuration configuration;

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
     * Gets the value of the sendOnError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendOnError() {
        return sendOnError;
    }

    /**
     * Sets the value of the sendOnError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendOnError(Boolean value) {
        this.sendOnError = value;
    }

    /**
     * Gets the value of the sendOnFailure property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendOnFailure() {
        return sendOnFailure;
    }

    /**
     * Sets the value of the sendOnFailure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendOnFailure(Boolean value) {
        this.sendOnFailure = value;
    }

    /**
     * Gets the value of the sendOnSuccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendOnSuccess() {
        return sendOnSuccess;
    }

    /**
     * Sets the value of the sendOnSuccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendOnSuccess(Boolean value) {
        this.sendOnSuccess = value;
    }

    /**
     * Gets the value of the sendOnWarning property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendOnWarning() {
        return sendOnWarning;
    }

    /**
     * Sets the value of the sendOnWarning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendOnWarning(Boolean value) {
        this.sendOnWarning = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link Notifier.Configuration }
     *     
     */
    public Notifier.Configuration getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notifier.Configuration }
     *     
     */
    public void setConfiguration(Notifier.Configuration value) {
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

}
