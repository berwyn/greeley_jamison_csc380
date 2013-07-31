
package edu.neumont.order;

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
 *         &lt;element ref="{http://neumont.edu/jgreeley/order}restaurant"/>
 *         &lt;element ref="{http://neumont.edu/jgreeley/order}meal"/>
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
    "restaurant",
    "meal"
})
@XmlRootElement(name = "postOrder", namespace = "http://neumont.edu/jgreeley/order")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:43:46-06:00", comments = "JAXB RI v2.2.4-2")
public class PostOrder {

    @XmlElement(namespace = "http://neumont.edu/jgreeley/order", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:43:46-06:00", comments = "JAXB RI v2.2.4-2")
    protected BigInteger restaurant;
    @XmlElement(namespace = "http://neumont.edu/jgreeley/order", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:43:46-06:00", comments = "JAXB RI v2.2.4-2")
    protected BigInteger meal;

    /**
     * Gets the value of the restaurant property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:43:46-06:00", comments = "JAXB RI v2.2.4-2")
    public BigInteger getRestaurant() {
        return restaurant;
    }

    /**
     * Sets the value of the restaurant property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:43:46-06:00", comments = "JAXB RI v2.2.4-2")
    public void setRestaurant(BigInteger value) {
        this.restaurant = value;
    }

    /**
     * Gets the value of the meal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:43:46-06:00", comments = "JAXB RI v2.2.4-2")
    public BigInteger getMeal() {
        return meal;
    }

    /**
     * Sets the value of the meal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:43:46-06:00", comments = "JAXB RI v2.2.4-2")
    public void setMeal(BigInteger value) {
        this.meal = value;
    }

}
