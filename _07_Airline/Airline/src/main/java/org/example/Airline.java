package org.example;

import org.example.accountstaffresimpl.Customer;
import org.example.accountstaffresimpl.Passport;
import org.example.flighraircraftseatimpl.Address;

public class Airline {

    public static void main(String[] args) {

        System.out.println("Welcome to OOD of Airline Management System...");

        Address address = new Address("apartments","area","Htech","TS","India","Hyd");

        Passport passport = new Passport("1234567890","01/01/1999",address,"31/12/2035");

        Customer passenger = new Customer("id01","password01","name01","email01@gmail.com","9876543210",passport);

        System.out.println("Done...");

    }

}