
package edu.neumont.order;

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
 *         &lt;element ref="{http://neumont.edu/jgreeley/order}postOrder"/>
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
    "postOrder"
})
@XmlRootElement(name = "Body")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:43:46-06:00", comments = "JAXB RI v2.2.4-2")
public class Body {

    @XmlElement(namespace = "http://neumont.edu/jgreeley/order", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:43:46-06:00", comments = "JAXB RI v2.2.4-2")
    protected PostOrder postOrder;

    /**
     * Gets the value of the postOrder property.
     * 
     * @return
     *     possible object is
     *     {@link PostOrder }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:43:46-06:00", comments = "JAXB RI v2.2.4-2")
    public PostOrder getPostOrder() {
        return postOrder;
    }

    /**
     * Sets the value of the postOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostOrder }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:43:46-06:00", comments = "JAXB RI v2.2.4-2")
    public void setPostOrder(PostOrder value) {
        this.postOrder = value;
    }

}
