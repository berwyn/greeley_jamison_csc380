
package edu.neumont.restaurants;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2001/12/soap-envelope}Body"/>
 *       &lt;/sequence>
 *       &lt;attribute name="encodingStyle" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "body"
})
@XmlRootElement(name = "Envelope", namespace = "http://www.w3.org/2001/12/soap-envelope")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
public class Envelope {

    @XmlElement(name = "Body", namespace = "http://www.w3.org/2001/12/soap-envelope", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    protected Body body;
    @XmlAttribute(name = "encodingStyle", namespace = "http://www.w3.org/2001/12/soap-envelope", required = true)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    protected String encodingStyle;

    /**
     * Gets the value of the body property.
     * 
     * @return
     *     possible object is
     *     {@link Body }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    public Body getBody() {
        return body;
    }

    /**
     * Sets the value of the body property.
     * 
     * @param value
     *     allowed object is
     *     {@link Body }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    public void setBody(Body value) {
        this.body = value;
    }

    /**
     * Gets the value of the encodingStyle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    public String getEncodingStyle() {
        return encodingStyle;
    }

    /**
     * Sets the value of the encodingStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    public void setEncodingStyle(String value) {
        this.encodingStyle = value;
    }

}
