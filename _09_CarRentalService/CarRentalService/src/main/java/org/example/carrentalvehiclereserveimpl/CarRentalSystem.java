package org.example.carrentalvehiclereserveimpl;

import org.example.personaddressaccountimpl.Address;

public class CarRentalSystem {

    private String name;
    private Address location;

    public CarRentalSystem(String name, Address address) {
        this.name = name;
        this.location = address;
    }

    public Address getLocation(){
        return location;
    }

}
