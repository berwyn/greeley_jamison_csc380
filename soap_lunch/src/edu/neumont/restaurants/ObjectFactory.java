
package edu.neumont.restaurants;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the edu.neumont.restaurants package.
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

    private final static QName _Id_QNAME = new QName("http://neumont.edu/jgreeley/service/response", "id");
    private final static QName _Description_QNAME = new QName("http://neumont.edu/jgreeley/service/response", "description");
    private final static QName _Name_QNAME = new QName("http://neumont.edu/jgreeley/service/response", "name");
    private final static QName _Type_QNAME = new QName("http://neumont.edu/jgreeley/service/response", "type");
    private final static QName _Cost_QNAME = new QName("http://neumont.edu/jgreeley/service/response", "cost");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: edu.neumont.restaurants
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Meals }
     * 
     */
    public Meals createMeals() {
        return new Meals();
    }

    /**
     * Create an instance of {@link Meals.Serviceresmeal }
     * 
     */
    public Meals.Serviceresmeal createMealsServiceresmeal() {
        return new Meals.Serviceresmeal();
    }

    /**
     * Create an instance of {@link Meal }
     * 
     */
    public Meal createMeal() {
        return new Meal();
    }

    /**
     * Create an instance of {@link GetRestaurants }
     * 
     */
    public GetRestaurants createGetRestaurants() {
        return new GetRestaurants();
    }

    /**
     * Create an instance of {@link Restaurant }
     * 
     */
    public Restaurant createRestaurant() {
        return new Restaurant();
    }

    /**
     * Create an instance of {@link Body }
     * 
     */
    public Body createBody() {
        return new Body();
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
    @XmlElementDecl(namespace = "http://neumont.edu/jgreeley/service/response", name = "id")
    public JAXBElement<BigInteger> createId(BigInteger value) {
        return new JAXBElement<BigInteger>(_Id_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://neumont.edu/jgreeley/service/response", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://neumont.edu/jgreeley/service/response", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://neumont.edu/jgreeley/service/response", name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://neumont.edu/jgreeley/service/response", name = "cost")
    public JAXBElement<String> createCost(String value) {
        return new JAXBElement<String>(_Cost_QNAME, String.class, null, value);
    }

}
