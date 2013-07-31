
package edu.neumont.restaurants;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{http://neumont.edu/jgreeley/service/response}id"/>
 *         &lt;element ref="{http://neumont.edu/jgreeley/service/response}name"/>
 *         &lt;element ref="{http://neumont.edu/jgreeley/service/response}description"/>
 *         &lt;element ref="{http://neumont.edu/jgreeley/service/response}cost"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "name",
    "description",
    "cost"
})
@XmlRootElement(name = "meal")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
public class Meal {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    protected BigInteger id;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    protected String name;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    protected String description;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    protected String cost;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    public String getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    public void setCost(String value) {
        this.cost = value;
    }

}
