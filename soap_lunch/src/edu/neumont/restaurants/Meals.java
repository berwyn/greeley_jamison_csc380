
package edu.neumont.restaurants;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
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
 *       &lt;choice>
 *         &lt;element name="serviceresmeal" form="unqualified">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://neumont.edu/jgreeley/service/response}id"/>
 *                   &lt;element ref="{http://neumont.edu/jgreeley/service/response}name"/>
 *                   &lt;element ref="{http://neumont.edu/jgreeley/service/response}description"/>
 *                   &lt;element ref="{http://neumont.edu/jgreeley/service/response}cost"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://neumont.edu/jgreeley/service/response}meal" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "serviceresmeal",
    "meal"
})
@XmlRootElement(name = "meals")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
public class Meals {

    @XmlElement(namespace = "")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    protected Meals.Serviceresmeal serviceresmeal;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    protected List<Meal> meal;

    /**
     * Gets the value of the serviceresmeal property.
     * 
     * @return
     *     possible object is
     *     {@link Meals.Serviceresmeal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    public Meals.Serviceresmeal getServiceresmeal() {
        return serviceresmeal;
    }

    /**
     * Sets the value of the serviceresmeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meals.Serviceresmeal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    public void setServiceresmeal(Meals.Serviceresmeal value) {
        this.serviceresmeal = value;
    }

    /**
     * Gets the value of the meal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meal property.
     * 
     * <p>
     * For service, to add a new item, do as follows:
     * <pre>
     *    getMeal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Meal }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    public List<Meal> getMeal() {
        if (meal == null) {
            meal = new ArrayList<Meal>();
        }
        return this.meal;
    }


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
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2013-07-30T06:42:19-06:00", comments = "JAXB RI v2.2.4-2")
    public static class Serviceresmeal {

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

}
