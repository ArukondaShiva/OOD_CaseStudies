package org.example;


import org.example.carrentalvehiclereserveimpl.Vehicle;
import org.example.carrentalvehiclereserveimpl.VehicleInventory;
import org.example.enumerationimpl.AccountStatus;
import org.example.enumerationimpl.VehicleCategory;
import org.example.personaddressaccountimpl.Address;
import org.example.personaddressaccountimpl.Member;
import org.example.personaddressaccountimpl.Person;

import java.time.LocalDateTime;

public class Rental {

    public static void main(String[] args) {

        Address address = new Address("HiTech City","Hyderabad","TS","12345","india");
        Person pavan = new Person("Pavan","pavan@gmail.com","1234567890",address);
        Member sai = new Member("id","password",pavan, AccountStatus.ACTIVE,5);

        Vehicle car = new Vehicle(10001,4,"BMW","Sportz", LocalDateTime.now(),"none", VehicleCategory.CAR);
        car.addLogs("Accident");

        Vehicle mahindra = new Vehicle(1121, 6, "MAHINDRA", "XUV", LocalDateTime.now(), "none", VehicleCategory.SUV);


        for(Vehicle x : VehicleInventory.getAllVehicles()){
            System.out.println(x.toString());
        }

    }

}