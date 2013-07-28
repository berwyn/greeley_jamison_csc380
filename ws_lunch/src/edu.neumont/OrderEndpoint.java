package edu.neumont;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.neumont.jaxb.Service;

/**
 * Created with IntelliJ IDEA. User: Berwyn Codeweaver Date: 28/07/13 Time:
 * 16:02 To change this template use File | Settings | File Templates.
 */
public class OrderEndpoint extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter("name");
        try {
            int restaurantOrdinal = Integer.parseInt(req
                    .getParameter("restaurant"));
            int mealOrdinal = Integer.parseInt(req.getParameter("meal"));

            Service.Restaurant restaurant = ServiceManager.getService()
                    .getRestaurant().get(restaurantOrdinal);
            Service.Restaurant.Meal meal = restaurant.getMeal()
                    .get(mealOrdinal);

            resp.setContentType("text/plain");
            resp.getWriter().println(
                    String.format("Ordering %s from %s for %s", meal.getName(),
                            restaurant.getName(), name));
        } catch (Exception e) {
            resp.setStatus(500);
            resp.getWriter().println("There was an error with your request");
        }
    }
}
