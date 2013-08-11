package model;

/**
 * Created with IntelliJ IDEA.
 * User: Berwyn Codeweaver
 * Date: 10/08/13
 * Time: 19:40
 * To change this template use File | Settings | File Templates.
 */
public class Meal {

    private String name;
    private String description;
    private Double price;

    public Meal() {
    }

    public Meal(String name, String description, Double price) {
        this.name = name;
        this.description = description;
        this.price = price;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
