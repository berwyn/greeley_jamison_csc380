package model;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Berwyn Codeweaver
 * Date: 10/08/13
 * Time: 19:38
 * To change this template use File | Settings | File Templates.
 */
public class Service {

    private List<Restaurant> restaurants;

    public Service() {
    }

    public Service(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
}
