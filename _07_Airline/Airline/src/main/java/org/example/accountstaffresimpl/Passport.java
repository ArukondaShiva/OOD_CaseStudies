package org.example.accountstaffresimpl;

import org.example.flighraircraftseatimpl.Address;

public class Passport {

    private String passportNumber;
    private String dob;
    private Address address;
    private String expiryDate;

    public Passport(String passportNumber, String dob, Address address, String expiryDate){
        this.passportNumber = passportNumber;
        this.dob = dob;
        this.address = address;
        this.expiryDate = expiryDate;
    }

}
