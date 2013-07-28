package edu.neumont;

import edu.neumont.jaxb.Service;

import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA. User: Berwyn Codeweaver Date: 28/07/13 Time:
 * 13:57 To change this template use File | Settings | File Templates.
 */
public class ServiceManager {

    private static Service service;

    static {
        service = new Service();

        final Service.Restaurant r1 = new Service.Restaurant();
        r1.setName("Burrito Stand");
        r1.setDescription("A burrito stand");
        r1.setType("Mexican");

        Service.Restaurant.Meal burrito = new Service.Restaurant.Meal();
        burrito.setName("Burrito");
        burrito.setDescription("A burrito");
        burrito.setCost("$2.00");
        List mexicanFood = new ArrayList<Service.Restaurant.Meal>();
        mexicanFood.add(0, burrito);
        r1.meal = mexicanFood;

        final Service.Restaurant r2 = new Service.Restaurant();
        r2.setName("Italian");
        r2.setDescription("An Italian restaurant");
        r2.setType("Italian");

        Service.Restaurant.Meal alfredo = new Service.Restaurant.Meal();
        alfredo.setName("alfredo");
        alfredo.setDescription("A plate of fettuccine alfredo");
        alfredo.setCost("$4.50");
        Service.Restaurant.Meal spaghetti = new Service.Restaurant.Meal();
        spaghetti.setName("spaghetti");
        spaghetti.setDescription("A plate of spaghetti");
        spaghetti.setCost("$5.00");

        List italianFood = new ArrayList<Service.Restaurant.Meal>();
        italianFood.add(alfredo);
        italianFood.add(spaghetti);
        r2.meal = italianFood;

        List restaurants = new ArrayList<Service.Restaurant>() {
            {
                add(r1);
                add(r2);
            }
        };
        service.restaurant = restaurants;
    }

    public static Service getService() {
        return service;
    }

    public static void marshallService(HttpServletResponse res) throws JAXBException, IOException {
        JAXBContext jc = JAXBContext.newInstance(Service.class);
        Marshaller marshall = jc.createMarshaller();
        marshall.marshal(service, res.getWriter());
    }
}
