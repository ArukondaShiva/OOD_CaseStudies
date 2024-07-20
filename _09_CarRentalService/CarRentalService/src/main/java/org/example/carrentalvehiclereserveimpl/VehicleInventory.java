package org.example.carrentalvehiclereserveimpl;

import org.example.enumerationimpl.VehicleCategory;

import java.util.ArrayList;
import java.util.HashMap;

public class VehicleInventory {

    private static HashMap<VehicleCategory, ArrayList<Vehicle>> inventory = new HashMap<>();
    private static ArrayList<Vehicle> database = new ArrayList<Vehicle>();


    public static void addVehicle(VehicleCategory category, Vehicle vehicle){
        inventory.putIfAbsent(category,new ArrayList<Vehicle>());

        inventory.get(category).add(vehicle);
        database.add(vehicle);
    }

    public static ArrayList<Vehicle> getVehicleByCategory(VehicleCategory  category){
        return inventory.get(category);
    }

    public static ArrayList<Vehicle> getAllVehicles(){
        return database;
    }


}
