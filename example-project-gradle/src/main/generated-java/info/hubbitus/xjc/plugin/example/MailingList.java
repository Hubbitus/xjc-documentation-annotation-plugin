
package info.hubbitus.xjc.plugin.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import info.hubbitus.annotation.XsdInfo;


/**
 * This element describes all of the mailing lists associated with a project. The
 *         auto-generated site references this information.
 * 
 * &lt;p&gt;Java class for MailingList complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="MailingList"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="subscribe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="unsubscribe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="post" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="archive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="otherArchives" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="otherArchive" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
@XmlType(name = "MailingList", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@XsdInfo(name = "This element describes all of the mailing lists associated with a project. The\n        auto-generated site references this information.", xsdElementPart = "<complexType name=\"MailingList\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <all>\n        <element name=\"name\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"subscribe\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"unsubscribe\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"post\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"archive\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"otherArchives\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <element name=\"otherArchive\" type=\"{http://www.w3.org/2001/XMLSchema}string\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n      </all>\n    </restriction>\n  </complexContent>\n</complexType>")
public class MailingList {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The name of the mailing list.")
    protected String name;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The email address or link that can be used to subscribe to\n            the mailing list.  If this is an email address, a\n            <code>mailto:</code> link will automatically be created\n            when the documentation is created.")
    protected String subscribe;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The email address or link that can be used to unsubscribe to\n            the mailing list.  If this is an email address, a\n            <code>mailto:</code> link will automatically be created\n            when the documentation is created.")
    protected String unsubscribe;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The email address or link that can be used to post to\n            the mailing list.  If this is an email address, a\n            <code>mailto:</code> link will automatically be created\n            when the documentation is created.")
    protected String post;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The link to a URL where you can browse the mailing list archive.")
    protected String archive;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The link to alternate URLs where you can browse the list archive.")
    protected MailingList.OtherArchives otherArchives;

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
     * Gets the value of the subscribe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscribe() {
        return subscribe;
    }

    /**
     * Sets the value of the subscribe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscribe(String value) {
        this.subscribe = value;
    }

    /**
     * Gets the value of the unsubscribe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnsubscribe() {
        return unsubscribe;
    }

    /**
     * Sets the value of the unsubscribe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnsubscribe(String value) {
        this.unsubscribe = value;
    }

    /**
     * Gets the value of the post property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPost() {
        return post;
    }

    /**
     * Sets the value of the post property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPost(String value) {
        this.post = value;
    }

    /**
     * Gets the value of the archive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchive() {
        return archive;
    }

    /**
     * Sets the value of the archive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchive(String value) {
        this.archive = value;
    }

    /**
     * Gets the value of the otherArchives property.
     * 
     * @return
     *     possible object is
     *     {@link MailingList.OtherArchives }
     *     
     */
    public MailingList.OtherArchives getOtherArchives() {
        return otherArchives;
    }

    /**
     * Sets the value of the otherArchives property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailingList.OtherArchives }
     *     
     */
    public void setOtherArchives(MailingList.OtherArchives value) {
        this.otherArchives = value;
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
     *         &amp;lt;element name="otherArchive" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
        "otherArchives"
    })
    @XsdInfo(name = "", xsdElementPart = "<complexType>\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <sequence>\n        <element name=\"otherArchive\" type=\"{http://www.w3.org/2001/XMLSchema}string\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n      </sequence>\n    </restriction>\n  </complexContent>\n</complexType>")
    public static class OtherArchives {

        @XmlElement(name = "otherArchive", namespace = "http://maven.apache.org/POM/4.0.0")
        @XsdInfo(name = "")
        protected List<String> otherArchives;

        /**
         * Gets the value of the otherArchives property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the otherArchives property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getOtherArchives().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOtherArchives() {
            if (otherArchives == null) {
                otherArchives = new ArrayList<String>();
            }
            return this.otherArchives;
        }

    }

}
