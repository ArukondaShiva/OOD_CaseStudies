package org.example.carrentalvehiclereserveimpl;

import org.example.enumerationimpl.VehicleCategory;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Vehicle {

    private int licenceNumber;
    private int capacity;
    private String model;
    private String brand;
    private LocalDateTime manufacturingYear;
    private ArrayList<String> logs = new ArrayList<>();
    private VehicleCategory category;


    public Vehicle(int licenceNumber, int capacity, String model, String brand, LocalDateTime manufacturingYear,String logs, VehicleCategory category) {
        this.licenceNumber = licenceNumber;
        this.capacity = capacity;
        this.model = model;
        this.brand = brand;
        this.manufacturingYear = manufacturingYear;
        this.logs.add(logs);
        this.category = category;
    }

    public ArrayList<String> getLogs() {
        return logs;
    }

    public void addLogs(String logs) {
        this.logs.add(logs);
    }
}
