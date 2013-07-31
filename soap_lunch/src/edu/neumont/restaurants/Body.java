
package edu.neumont.restaurants;

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
 *         &lt;element ref="{http://neumont.edu/jgreeley/service/response}getRestaurants"/>
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
    "getRestaurants"
})
@XmlRootElement(name = "Body", namespace = "http://www.w3.org/2001/12/soap-envelope")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
public class Body {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    protected GetRestaurants getRestaurants;

    /**
     * Gets the value of the getRestaurants property.
     * 
     * @return
     *     possible object is
     *     {@link GetRestaurants }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    public GetRestaurants getGetRestaurants() {
        return getRestaurants;
    }

    /**
     * Sets the value of the getRestaurants property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetRestaurants }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    public void setGetRestaurants(GetRestaurants value) {
        this.getRestaurants = value;
    }

}
