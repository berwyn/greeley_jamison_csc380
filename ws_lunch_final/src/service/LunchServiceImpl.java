package service;

import model.Meal;
import model.Restaurant;
import model.Service;

import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Berwyn Codeweaver
 * Date: 10/08/13
 * Time: 19:41
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "service.LunchService", serviceName = "LunchService")
public class LunchServiceImpl implements LunchService {

    private static final Service serv;

    static {
        serv = new Service();
        final List<Meal> mxMeals = new ArrayList() {{
            add(new Meal("Burrito", "A burrito", 2.99));
            add(new Meal("Taco", "A taco", 0.99));
        }};
        final List<Meal> itMeals = new ArrayList() {{
            add(new Meal("Spaghetti", "A plate of spaghetti", 4.99));
            add(new Meal("Fettuccine", "A plate of fettuccine alfredo", 5.99));
        }};
        final Restaurant mx = new Restaurant("Mexican", "A taco truck", mxMeals);
        final Restaurant it = new Restaurant("Italian", "A spaghetti factory", itMeals);
        serv.setRestaurants(new ArrayList() {{
            add(mx);
            add(it);
        }});
    }

    @Override
    public Service getMenu() {
        return serv;
    }

    @Override
    public void orderMeal(@WebParam(name = "name") String name, @WebParam(name = "mealId") Integer mealId, @WebParam(name = "restaurantId") Integer restaurantId) {
        // Normally, we'd want to place an order here
        // But we'll just stupid it out instead
        System.out.println(String.format("Received order for %s asking for %d from %d", name, mealId, restaurantId));
    }
}
