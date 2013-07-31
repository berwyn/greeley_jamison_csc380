
package edu.neumont.order;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.neumont.order package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Meal_QNAME = new QName("http://neumont.edu/jgreeley/order", "meal");
    private final static QName _Restaurant_QNAME = new QName("http://neumont.edu/jgreeley/order", "restaurant");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.neumont.order
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Body }
     * 
     */
    public Body createBody() {
        return new Body();
    }

    /**
     * Create an instance of {@link PostOrder }
     * 
     */
    public PostOrder createPostOrder() {
        return new PostOrder();
    }

    /**
     * Create an instance of {@link Envelope }
     * 
     */
    public Envelope createEnvelope() {
        return new Envelope();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://neumont.edu/jgreeley/order", name = "meal")
    public JAXBElement<BigInteger> createMeal(BigInteger value) {
        return new JAXBElement<BigInteger>(_Meal_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://neumont.edu/jgreeley/order", name = "restaurant")
    public JAXBElement<BigInteger> createRestaurant(BigInteger value) {
        return new JAXBElement<BigInteger>(_Restaurant_QNAME, BigInteger.class, null, value);
    }

}
