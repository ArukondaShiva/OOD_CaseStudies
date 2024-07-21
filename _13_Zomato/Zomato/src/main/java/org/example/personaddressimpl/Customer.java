package org.example.personaddressimpl;

import org.example.restaurantmenuitemorderimpl.Order;

import java.util.ArrayList;

public class Customer extends Person{

    private ArrayList<Order> orders;

    public Customer(String name, String email, String phone, Address address) {
        super(name, email, phone, address);
    }

    public void addOrders(Order order){
        this.orders.add(order);
    }

    public Boolean receiveOrder(Order order){
        if(!orders.contains(order)){
            return false;
        }else{
            return true;
        }
    }

}
