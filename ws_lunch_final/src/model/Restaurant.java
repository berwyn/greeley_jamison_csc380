package model;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Berwyn Codeweaver
 * Date: 10/08/13
 * Time: 19:39
 * To change this template use File | Settings | File Templates.
 */
public class Restaurant {

    private String name;
    private String description;
    private List<Meal> meals;

    public Restaurant() {
    }

    public Restaurant(String name, String description, List<Meal> meals) {
        this.name = name;
        this.description = description;
        this.meals = meals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void setMeals(List<Meal> meals) {
        this.meals = meals;
    }
}
