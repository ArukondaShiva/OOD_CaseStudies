package org.example.restaurantmenuitemorderimpl;

import org.example.personaddressimpl.Customer;
import org.example.personaddressimpl.DeliveryGuy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class System {

    private HashMap<Customer, ArrayList<Order>> customerDB;
    private HashMap<DeliveryGuy, ArrayList<Order>> deliveryDB;


    public void addCustomerDetails(Customer user,Order order){
        customerDB.get(user).add(order);
    }


    public ArrayList<Order> getCustomerDetails(Customer customer){
        return customerDB.get(customer);
    }

    public ArrayList<Order> addDeliveryDetails(Customer customer){
        return customerDB.get(customer);
    }

    public ArrayList<Order> getDeliveryDetails(DeliveryGuy delivery){
        return deliveryDB.get(delivery);
    }

}
