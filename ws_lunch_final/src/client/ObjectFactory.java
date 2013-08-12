
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
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

    private final static QName _OrderMeal_QNAME = new QName("http://localhost/lunch", "orderMeal");
    private final static QName _GetMenuResponse_QNAME = new QName("http://localhost/lunch", "getMenuResponse");
    private final static QName _OrderMealResponse_QNAME = new QName("http://localhost/lunch", "orderMealResponse");
    private final static QName _GetMenu_QNAME = new QName("http://localhost/lunch", "getMenu");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderMealResponse }
     * 
     */
    public OrderMealResponse createOrderMealResponse() {
        return new OrderMealResponse();
    }

    /**
     * Create an instance of {@link GetMenuResponse }
     * 
     */
    public GetMenuResponse createGetMenuResponse() {
        return new GetMenuResponse();
    }

    /**
     * Create an instance of {@link OrderMeal }
     * 
     */
    public OrderMeal createOrderMeal() {
        return new OrderMeal();
    }

    /**
     * Create an instance of {@link GetMenu }
     * 
     */
    public GetMenu createGetMenu() {
        return new GetMenu();
    }

    /**
     * Create an instance of {@link Service }
     * 
     */
    public Service createService() {
        return new Service();
    }

    /**
     * Create an instance of {@link Restaurant }
     * 
     */
    public Restaurant createRestaurant() {
        return new Restaurant();
    }

    /**
     * Create an instance of {@link Meal }
     * 
     */
    public Meal createMeal() {
        return new Meal();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderMeal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost/lunch", name = "orderMeal")
    public JAXBElement<OrderMeal> createOrderMeal(OrderMeal value) {
        return new JAXBElement<OrderMeal>(_OrderMeal_QNAME, OrderMeal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMenuResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost/lunch", name = "getMenuResponse")
    public JAXBElement<GetMenuResponse> createGetMenuResponse(GetMenuResponse value) {
        return new JAXBElement<GetMenuResponse>(_GetMenuResponse_QNAME, GetMenuResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderMealResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost/lunch", name = "orderMealResponse")
    public JAXBElement<OrderMealResponse> createOrderMealResponse(OrderMealResponse value) {
        return new JAXBElement<OrderMealResponse>(_OrderMealResponse_QNAME, OrderMealResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMenu }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost/lunch", name = "getMenu")
    public JAXBElement<GetMenu> createGetMenu(GetMenu value) {
        return new JAXBElement<GetMenu>(_GetMenu_QNAME, GetMenu.class, null, value);
    }

}
