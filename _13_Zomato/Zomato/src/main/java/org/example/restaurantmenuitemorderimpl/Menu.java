package org.example.restaurantmenuitemorderimpl;

import java.util.ArrayList;

public class Menu {

    private String menuId;
    private ArrayList<FoodItem> menu = new ArrayList<FoodItem>();

    public Menu(String id){
        this.menuId = id;
    }

    public void addFood(FoodItem dish){
        this.menu.add(dish);
    }

}
