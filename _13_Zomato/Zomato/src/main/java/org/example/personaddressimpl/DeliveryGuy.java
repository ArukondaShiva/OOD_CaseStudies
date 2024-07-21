package org.example.personaddressimpl;

import org.example.restaurantmenuitemorderimpl.Order;

import java.util.ArrayList;

public class DeliveryGuy extends Person{

    private ArrayList<Order> deliveries;

    public DeliveryGuy(String name, String email, String phone, Address address) {
        super(name, email, phone, address);
    }

    public void addDeliveries(Order order){
        this.deliveries.add(order);
    }

    public boolean deliverItem(Order order){
        if(!deliveries.contains(order)){
            return false;
        }
        this.deliveries.remove(order);
        return true;
    }

}
