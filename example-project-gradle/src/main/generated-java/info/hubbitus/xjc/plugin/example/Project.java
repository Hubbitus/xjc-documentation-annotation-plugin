
package info.hubbitus.xjc.plugin.example;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import info.hubbitus.annotation.XsdInfo;
import org.w3c.dom.Element;


/**
 * 
 *         
 *         The &lt;code&gt;&amp;lt;project&amp;gt;&lt;/code&gt; element is the root of the descriptor.
 *         The following table lists all of the possible child elements.
 *         
 *       
 * 
 * &lt;p&gt;Java class for Model complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="Model"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="modelVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="parent" type="{http://maven.apache.org/POM/4.0.0}Parent" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="groupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="artifactId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="packaging" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="inceptionYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="organization" type="{http://maven.apache.org/POM/4.0.0}Organization" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="licenses" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="license" type="{http://maven.apache.org/POM/4.0.0}License" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="developers" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="developer" type="{http://maven.apache.org/POM/4.0.0}Developer" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="contributors" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="contributor" type="{http://maven.apache.org/POM/4.0.0}Contributor" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="mailingLists" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="mailingList" type="{http://maven.apache.org/POM/4.0.0}MailingList" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="prerequisites" type="{http://maven.apache.org/POM/4.0.0}Prerequisites" minOccurs="0"/&amp;gt;
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
 *         &amp;lt;element name="scm" type="{http://maven.apache.org/POM/4.0.0}Scm" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="issueManagement" type="{http://maven.apache.org/POM/4.0.0}IssueManagement" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ciManagement" type="{http://maven.apache.org/POM/4.0.0}CiManagement" minOccurs="0"/&amp;gt;
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
 *         &amp;lt;element name="build" type="{http://maven.apache.org/POM/4.0.0}Build" minOccurs="0"/&amp;gt;
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
 *         &amp;lt;element name="profiles" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="profile" type="{http://maven.apache.org/POM/4.0.0}Profile" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
@XmlType(name = "Model", namespace = "http://maven.apache.org/POM/4.0.0", propOrder = {

})
@XmlRootElement(name = "project", namespace = "http://maven.apache.org/POM/4.0.0")
@XsdInfo(name = "The <code>&lt;project&gt;</code> element is the root of the descriptor.\n        The following table lists all of the possible child elements.", xsdElementPart = "<complexType name=\"Model\">\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <all>\n        <element name=\"modelVersion\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"parent\" type=\"{http://maven.apache.org/POM/4.0.0}Parent\" minOccurs=\"0\"/>\n        <element name=\"groupId\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"artifactId\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"version\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"packaging\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"name\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"description\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"url\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"inceptionYear\" type=\"{http://www.w3.org/2001/XMLSchema}string\" minOccurs=\"0\"/>\n        <element name=\"organization\" type=\"{http://maven.apache.org/POM/4.0.0}Organization\" minOccurs=\"0\"/>\n        <element name=\"licenses\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <element name=\"license\" type=\"{http://maven.apache.org/POM/4.0.0}License\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n        <element name=\"developers\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <element name=\"developer\" type=\"{http://maven.apache.org/POM/4.0.0}Developer\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n        <element name=\"contributors\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <element name=\"contributor\" type=\"{http://maven.apache.org/POM/4.0.0}Contributor\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n        <element name=\"mailingLists\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <element name=\"mailingList\" type=\"{http://maven.apache.org/POM/4.0.0}MailingList\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n        <element name=\"prerequisites\" type=\"{http://maven.apache.org/POM/4.0.0}Prerequisites\" minOccurs=\"0\"/>\n        <element name=\"modules\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <element name=\"module\" type=\"{http://www.w3.org/2001/XMLSchema}string\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n        <element name=\"scm\" type=\"{http://maven.apache.org/POM/4.0.0}Scm\" minOccurs=\"0\"/>\n        <element name=\"issueManagement\" type=\"{http://maven.apache.org/POM/4.0.0}IssueManagement\" minOccurs=\"0\"/>\n        <element name=\"ciManagement\" type=\"{http://maven.apache.org/POM/4.0.0}CiManagement\" minOccurs=\"0\"/>\n        <element name=\"distributionManagement\" type=\"{http://maven.apache.org/POM/4.0.0}DistributionManagement\" minOccurs=\"0\"/>\n        <element name=\"properties\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <any processContents='skip' maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n        <element name=\"dependencyManagement\" type=\"{http://maven.apache.org/POM/4.0.0}DependencyManagement\" minOccurs=\"0\"/>\n        <element name=\"dependencies\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <element name=\"dependency\" type=\"{http://maven.apache.org/POM/4.0.0}Dependency\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n        <element name=\"repositories\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <element name=\"repository\" type=\"{http://maven.apache.org/POM/4.0.0}Repository\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n        <element name=\"pluginRepositories\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <element name=\"pluginRepository\" type=\"{http://maven.apache.org/POM/4.0.0}Repository\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n        <element name=\"build\" type=\"{http://maven.apache.org/POM/4.0.0}Build\" minOccurs=\"0\"/>\n        <element name=\"reports\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <any processContents='skip' maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n        <element name=\"reporting\" type=\"{http://maven.apache.org/POM/4.0.0}Reporting\" minOccurs=\"0\"/>\n        <element name=\"profiles\" minOccurs=\"0\">\n          <complexType>\n            <complexContent>\n              <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n                <sequence>\n                  <element name=\"profile\" type=\"{http://maven.apache.org/POM/4.0.0}Profile\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n                </sequence>\n              </restriction>\n            </complexContent>\n          </complexType>\n        </element>\n      </all>\n    </restriction>\n  </complexContent>\n</complexType>")
public class Project {

    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Declares to which version of project descriptor this POM conforms.")
    protected String modelVersion;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The location of the parent project, if one exists. Values from the parent\n            project will be the default for this project if they are left unspecified. The location\n            is given as a group ID, artifact ID and version.")
    protected Parent parent;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "A universally unique identifier for a project. It is normal to\n            use a fully-qualified package name to distinguish it from other\n            projects with a similar name (eg. <code>org.apache.maven</code>).")
    protected String groupId;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The identifier for this artifact that is unique within the group given by the\n            group ID. An artifact is something that is either produced or used by a project.\n            Examples of artifacts produced by Maven for a project include: JARs, source and binary\n            distributions, and WARs.")
    protected String artifactId;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The current version of the artifact produced by this project.")
    protected String version;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0", defaultValue = "jar")
    @XsdInfo(name = "The type of artifact this project produces, for example <code>jar</code>\n              <code>war</code>\n              <code>ear</code>\n              <code>pom</code>.\n            Plugins can create their own packaging, and\n            therefore their own packaging types,\n            so this list does not contain all possible types.")
    protected String packaging;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The full name of the project.")
    protected String name;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "A detailed description of the project, used by Maven whenever it needs to\n            describe the project, such as on the web site. While this element can be specified as\n            CDATA to enable the use of HTML tags within the description, it is discouraged to allow\n            plain text representation. If you need to modify the index page of the generated web\n            site, you are able to specify your own instead of adjusting this text.")
    protected String description;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The URL to the project's homepage.\n            <br /><b>Default value is</b>: parent value [+ path adjustment] + artifactId")
    protected String url;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The year of the project's inception, specified with 4 digits. This value is\n            used when generating copyright notices as well as being informational.")
    protected String inceptionYear;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "This element describes various attributes of the organization to which the\n            project belongs. These attributes are utilized when documentation is created (for\n            copyright notices and links).")
    protected Organization organization;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "This element describes all of the licenses for this project.\n            Each license is described by a <code>license</code> element, which\n            is then described by additional elements.\n            Projects should only list the license(s) that applies to the project\n            and not the licenses that apply to dependencies.\n            If multiple licenses are listed, it is assumed that the user can select\n            any of them, not that they must accept all.")
    protected Project.Licenses licenses;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Describes the committers of a project.")
    protected Project.Developers developers;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Describes the contributors to a project that are not yet committers.")
    protected Project.Contributors contributors;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Contains information about a project's mailing lists.")
    protected Project.MailingLists mailingLists;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Describes the prerequisites in the build environment for this project.")
    protected Prerequisites prerequisites;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The modules (sometimes called subprojects) to build as a part of this\n            project. Each module listed is a relative path to the directory containing the module.\n            To be consistent with the way default urls are calculated from parent, it is recommended\n            to have module names match artifact ids.")
    protected Project.Modules modules;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Specification for the SCM used by the project, such as CVS, Subversion, etc.")
    protected Scm scm;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The project's issue management system information.")
    protected IssueManagement issueManagement;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The project's continuous integration information.")
    protected CiManagement ciManagement;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Distribution information for a project that enables deployment of the site\n            and artifacts to remote web servers and repositories respectively.")
    protected DistributionManagement distributionManagement;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Properties that can be used throughout the POM as a substitution, and\n            are used as filters in resources if enabled.\n            The format is <code>&lt;name&gt;value&lt;/name&gt;</code>.")
    protected Project.Properties properties;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Default dependency information for projects that inherit from this one. The\n            dependencies in this section are not immediately resolved. Instead, when a POM derived\n            from this one declares a dependency described by a matching groupId and artifactId, the\n            version and other values from this section are used for that dependency if they were not\n            already specified.")
    protected DependencyManagement dependencyManagement;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "This element describes all of the dependencies associated with a\n            project.\n            These dependencies are used to construct a classpath for your\n            project during the build process. They are automatically downloaded from the\n            repositories defined in this project.\n            See <a href=\"http://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html\">the\n            dependency mechanism</a> for more information.")
    protected Project.Dependencies dependencies;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The lists of the remote repositories for discovering dependencies and\n            extensions.")
    protected Project.Repositories repositories;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "The lists of the remote repositories for discovering plugins for builds and\n            reports.")
    protected Project.PluginRepositories pluginRepositories;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "Information required to build the project.")
    protected Build build;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "<b>Deprecated</b>. Now ignored by Maven.")
    protected Project.Reports reports;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "This element includes the specification of report plugins to use\n            to generate the reports on the Maven-generated site.\n            These reports will be run when a user executes <code>mvn site</code>.\n            All of the reports will be included in the navigation bar for browsing.")
    protected Reporting reporting;
    @XmlElement(namespace = "http://maven.apache.org/POM/4.0.0")
    @XsdInfo(name = "A listing of project-local build profiles which will modify the build process\n            when activated.")
    protected Project.Profiles profiles;

    /**
     * Gets the value of the modelVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * Sets the value of the modelVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelVersion(String value) {
        this.modelVersion = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link Parent }
     *     
     */
    public Parent getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parent }
     *     
     */
    public void setParent(Parent value) {
        this.parent = value;
    }

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
     * Gets the value of the packaging property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackaging() {
        return packaging;
    }

    /**
     * Sets the value of the packaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackaging(String value) {
        this.packaging = value;
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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the inceptionYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInceptionYear() {
        return inceptionYear;
    }

    /**
     * Sets the value of the inceptionYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInceptionYear(String value) {
        this.inceptionYear = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link Organization }
     *     
     */
    public Organization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organization }
     *     
     */
    public void setOrganization(Organization value) {
        this.organization = value;
    }

    /**
     * Gets the value of the licenses property.
     * 
     * @return
     *     possible object is
     *     {@link Project.Licenses }
     *     
     */
    public Project.Licenses getLicenses() {
        return licenses;
    }

    /**
     * Sets the value of the licenses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project.Licenses }
     *     
     */
    public void setLicenses(Project.Licenses value) {
        this.licenses = value;
    }

    /**
     * Gets the value of the developers property.
     * 
     * @return
     *     possible object is
     *     {@link Project.Developers }
     *     
     */
    public Project.Developers getDevelopers() {
        return developers;
    }

    /**
     * Sets the value of the developers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project.Developers }
     *     
     */
    public void setDevelopers(Project.Developers value) {
        this.developers = value;
    }

    /**
     * Gets the value of the contributors property.
     * 
     * @return
     *     possible object is
     *     {@link Project.Contributors }
     *     
     */
    public Project.Contributors getContributors() {
        return contributors;
    }

    /**
     * Sets the value of the contributors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project.Contributors }
     *     
     */
    public void setContributors(Project.Contributors value) {
        this.contributors = value;
    }

    /**
     * Gets the value of the mailingLists property.
     * 
     * @return
     *     possible object is
     *     {@link Project.MailingLists }
     *     
     */
    public Project.MailingLists getMailingLists() {
        return mailingLists;
    }

    /**
     * Sets the value of the mailingLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project.MailingLists }
     *     
     */
    public void setMailingLists(Project.MailingLists value) {
        this.mailingLists = value;
    }

    /**
     * Gets the value of the prerequisites property.
     * 
     * @return
     *     possible object is
     *     {@link Prerequisites }
     *     
     */
    public Prerequisites getPrerequisites() {
        return prerequisites;
    }

    /**
     * Sets the value of the prerequisites property.
     * 
     * @param value
     *     allowed object is
     *     {@link Prerequisites }
     *     
     */
    public void setPrerequisites(Prerequisites value) {
        this.prerequisites = value;
    }

    /**
     * Gets the value of the modules property.
     * 
     * @return
     *     possible object is
     *     {@link Project.Modules }
     *     
     */
    public Project.Modules getModules() {
        return modules;
    }

    /**
     * Sets the value of the modules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project.Modules }
     *     
     */
    public void setModules(Project.Modules value) {
        this.modules = value;
    }

    /**
     * Gets the value of the scm property.
     * 
     * @return
     *     possible object is
     *     {@link Scm }
     *     
     */
    public Scm getScm() {
        return scm;
    }

    /**
     * Sets the value of the scm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Scm }
     *     
     */
    public void setScm(Scm value) {
        this.scm = value;
    }

    /**
     * Gets the value of the issueManagement property.
     * 
     * @return
     *     possible object is
     *     {@link IssueManagement }
     *     
     */
    public IssueManagement getIssueManagement() {
        return issueManagement;
    }

    /**
     * Sets the value of the issueManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueManagement }
     *     
     */
    public void setIssueManagement(IssueManagement value) {
        this.issueManagement = value;
    }

    /**
     * Gets the value of the ciManagement property.
     * 
     * @return
     *     possible object is
     *     {@link CiManagement }
     *     
     */
    public CiManagement getCiManagement() {
        return ciManagement;
    }

    /**
     * Sets the value of the ciManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link CiManagement }
     *     
     */
    public void setCiManagement(CiManagement value) {
        this.ciManagement = value;
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
     *     {@link Project.Properties }
     *     
     */
    public Project.Properties getProperties() {
        return properties;
    }

    /**
     * Sets the value of the properties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project.Properties }
     *     
     */
    public void setProperties(Project.Properties value) {
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
     *     {@link Project.Dependencies }
     *     
     */
    public Project.Dependencies getDependencies() {
        return dependencies;
    }

    /**
     * Sets the value of the dependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project.Dependencies }
     *     
     */
    public void setDependencies(Project.Dependencies value) {
        this.dependencies = value;
    }

    /**
     * Gets the value of the repositories property.
     * 
     * @return
     *     possible object is
     *     {@link Project.Repositories }
     *     
     */
    public Project.Repositories getRepositories() {
        return repositories;
    }

    /**
     * Sets the value of the repositories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project.Repositories }
     *     
     */
    public void setRepositories(Project.Repositories value) {
        this.repositories = value;
    }

    /**
     * Gets the value of the pluginRepositories property.
     * 
     * @return
     *     possible object is
     *     {@link Project.PluginRepositories }
     *     
     */
    public Project.PluginRepositories getPluginRepositories() {
        return pluginRepositories;
    }

    /**
     * Sets the value of the pluginRepositories property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project.PluginRepositories }
     *     
     */
    public void setPluginRepositories(Project.PluginRepositories value) {
        this.pluginRepositories = value;
    }

    /**
     * Gets the value of the build property.
     * 
     * @return
     *     possible object is
     *     {@link Build }
     *     
     */
    public Build getBuild() {
        return build;
    }

    /**
     * Sets the value of the build property.
     * 
     * @param value
     *     allowed object is
     *     {@link Build }
     *     
     */
    public void setBuild(Build value) {
        this.build = value;
    }

    /**
     * Gets the value of the reports property.
     * 
     * @return
     *     possible object is
     *     {@link Project.Reports }
     *     
     */
    public Project.Reports getReports() {
        return reports;
    }

    /**
     * Sets the value of the reports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project.Reports }
     *     
     */
    public void setReports(Project.Reports value) {
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
     * Gets the value of the profiles property.
     * 
     * @return
     *     possible object is
     *     {@link Project.Profiles }
     *     
     */
    public Project.Profiles getProfiles() {
        return profiles;
    }

    /**
     * Sets the value of the profiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Project.Profiles }
     *     
     */
    public void setProfiles(Project.Profiles value) {
        this.profiles = value;
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
     *         &amp;lt;element name="contributor" type="{http://maven.apache.org/POM/4.0.0}Contributor" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
        "contributors"
    })
    @XsdInfo(name = "", xsdElementPart = "<complexType>\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <sequence>\n        <element name=\"contributor\" type=\"{http://maven.apache.org/POM/4.0.0}Contributor\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n      </sequence>\n    </restriction>\n  </complexContent>\n</complexType>")
    public static class Contributors {

        @XmlElement(name = "contributor", namespace = "http://maven.apache.org/POM/4.0.0")
        @XsdInfo(name = "")
        protected List<Contributor> contributors;

        /**
         * Gets the value of the contributors property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the contributors property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getContributors().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link Contributor }
         * 
         * 
         */
        public List<Contributor> getContributors() {
            if (contributors == null) {
                contributors = new ArrayList<Contributor>();
            }
            return this.contributors;
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
     *         &amp;lt;element name="developer" type="{http://maven.apache.org/POM/4.0.0}Developer" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
        "developers"
    })
    @XsdInfo(name = "", xsdElementPart = "<complexType>\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <sequence>\n        <element name=\"developer\" type=\"{http://maven.apache.org/POM/4.0.0}Developer\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n      </sequence>\n    </restriction>\n  </complexContent>\n</complexType>")
    public static class Developers {

        @XmlElement(name = "developer", namespace = "http://maven.apache.org/POM/4.0.0")
        @XsdInfo(name = "")
        protected List<Developer> developers;

        /**
         * Gets the value of the developers property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the developers property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getDevelopers().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link Developer }
         * 
         * 
         */
        public List<Developer> getDevelopers() {
            if (developers == null) {
                developers = new ArrayList<Developer>();
            }
            return this.developers;
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
     *         &amp;lt;element name="license" type="{http://maven.apache.org/POM/4.0.0}License" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
        "licenses"
    })
    @XsdInfo(name = "", xsdElementPart = "<complexType>\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <sequence>\n        <element name=\"license\" type=\"{http://maven.apache.org/POM/4.0.0}License\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n      </sequence>\n    </restriction>\n  </complexContent>\n</complexType>")
    public static class Licenses {

        @XmlElement(name = "license", namespace = "http://maven.apache.org/POM/4.0.0")
        @XsdInfo(name = "")
        protected List<License> licenses;

        /**
         * Gets the value of the licenses property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the licenses property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getLicenses().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link License }
         * 
         * 
         */
        public List<License> getLicenses() {
            if (licenses == null) {
                licenses = new ArrayList<License>();
            }
            return this.licenses;
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
     *         &amp;lt;element name="mailingList" type="{http://maven.apache.org/POM/4.0.0}MailingList" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
        "mailingLists"
    })
    @XsdInfo(name = "", xsdElementPart = "<complexType>\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <sequence>\n        <element name=\"mailingList\" type=\"{http://maven.apache.org/POM/4.0.0}MailingList\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n      </sequence>\n    </restriction>\n  </complexContent>\n</complexType>")
    public static class MailingLists {

        @XmlElement(name = "mailingList", namespace = "http://maven.apache.org/POM/4.0.0")
        @XsdInfo(name = "")
        protected List<MailingList> mailingLists;

        /**
         * Gets the value of the mailingLists property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the mailingLists property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getMailingLists().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link MailingList }
         * 
         * 
         */
        public List<MailingList> getMailingLists() {
            if (mailingLists == null) {
                mailingLists = new ArrayList<MailingList>();
            }
            return this.mailingLists;
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
     *         &amp;lt;element name="profile" type="{http://maven.apache.org/POM/4.0.0}Profile" maxOccurs="unbounded" minOccurs="0"/&amp;gt;
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
        "profiles"
    })
    @XsdInfo(name = "", xsdElementPart = "<complexType>\n  <complexContent>\n    <restriction base=\"{http://www.w3.org/2001/XMLSchema}anyType\">\n      <sequence>\n        <element name=\"profile\" type=\"{http://maven.apache.org/POM/4.0.0}Profile\" maxOccurs=\"unbounded\" minOccurs=\"0\"/>\n      </sequence>\n    </restriction>\n  </complexContent>\n</complexType>")
    public static class Profiles {

        @XmlElement(name = "profile", namespace = "http://maven.apache.org/POM/4.0.0")
        @XsdInfo(name = "")
        protected List<Profile> profiles;

        /**
         * Gets the value of the profiles property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the profiles property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getProfiles().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link Profile }
         * 
         * 
         */
        public List<Profile> getProfiles() {
            if (profiles == null) {
                profiles = new ArrayList<Profile>();
            }
            return this.profiles;
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
