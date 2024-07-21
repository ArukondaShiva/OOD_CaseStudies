package org.example.restaurantmenuitemorderimpl;

import org.example.enumerationsimpl.PaymentMethod;
import org.example.personaddressimpl.Customer;
import org.example.personaddressimpl.DeliveryGuy;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Order {

    private String orderId;
    private Customer customer;
    private DeliveryGuy deliveryGuy;
    private LocalDateTime creationOrder;
    private PaymentMethod billingMode;
    private ArrayList<FoodItem> meal;


    public Order(String orderId, Customer customer, DeliveryGuy deliveryGuy, LocalDateTime creationOrder, PaymentMethod billingMode) {
        this.orderId = orderId;
        this.customer = customer;
        this.deliveryGuy = deliveryGuy;
        this.creationOrder = creationOrder;
        this.billingMode = billingMode;
        this.meal = new ArrayList<FoodItem>();
    }

    public void addMeal(FoodItem dish){
        meal.add(dish);
    }

}
