package org.example.flighraircraftseatimpl;

public class Aircraft {

    public String name;
    public String model;
    public String manufacturingYear;
    public int seats;


    public Aircraft(String name, String model, String year,int seat){
        this.name = name;
        this.model = model;
        this.seats = seat;
        this.manufacturingYear = year;
    }

}
