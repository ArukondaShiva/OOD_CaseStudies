package org.example.personaddressimpl;

public class Address {

    private String street;
    private String city;
    private String state;
    private String zipcode;
    private String country;


    public Address(String street, String city, String state, String zipcode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
    }

}