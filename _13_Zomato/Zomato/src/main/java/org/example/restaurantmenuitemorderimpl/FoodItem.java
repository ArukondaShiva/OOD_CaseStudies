package org.example.restaurantmenuitemorderimpl;

public class FoodItem {

    private String name;
    private String id;
    private String description;
    private int cost;


    public FoodItem(String name, String id, String description, int cost) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.cost = cost;
    }

    public void updatePrice(int cost){
        this.cost = cost;
    }

}
