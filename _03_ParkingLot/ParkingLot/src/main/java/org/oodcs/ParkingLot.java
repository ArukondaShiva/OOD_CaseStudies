package org.oodcs;


import automatedcustomeraddisplayimpl.Admin;
import automatedcustomeraddisplayimpl.AutomatedSystem;
import automatedcustomeraddisplayimpl.Customer;
import automatedcustomeraddisplayimpl.DisplayBoard;
import vehicleticketspotimpl.ParkingSpot;
import vehicleticketspotimpl.Ticket;

import java.util.ArrayList;

public class ParkingLot {

    private String name;
    private int capacity;
    private String Location;

    private double parkingCharges;

    private Admin admin;


    private AutomatedSystem automatedSystem;
    private ArrayList<ParkingSpot> parkingSpots;
    private ArrayList<ParkingSpot> availableSpots;
    private DisplayBoard displayBoard;


    public ParkingLot(String name,int capacity,String location,double parkingCharges,AutomatedSystem automatedSystem,DisplayBoard displayBoard){
        this.name = name;
        this.capacity = capacity;
        location = location;
        this.parkingCharges = parkingCharges;
        this.automatedSystem = automatedSystem;
        this.automatedSystem.setParkingLot(this);
        this.displayBoard = displayBoard;
        this.parkingSpots = createParkingSpots(capacity);
        availableSpots = (ArrayList<ParkingSpot>) parkingSpots.clone();
    }


    private ArrayList<ParkingSpot> createParkingSpots(int capacity){
        ArrayList<ParkingSpot> parkingSpotList = new ArrayList<>();
        for(int i=0;i<capacity;i++){
            parkingSpotList.add(new ParkingSpot("MPL "+i));
        }
        return parkingSpotList;
    }

    public DisplayBoard getDisplayBoard(){
        return displayBoard;
    }

    public ParkingSpot getAvailableSpot(){
        return availableSpots.remove(0);
    }

    public int getAvailability(){
        return availableSpots.size();
    }

    public void updateParkingCharges(double newCharges){
        this.parkingCharges = newCharges;
    }

    public double getParkingCharges(){
        return parkingCharges;
    }

    public void setAdmin(Admin admin){
        this.admin = admin;
    }


    public static void main(String[] args) {

        DisplayBoard displayBoard = new DisplayBoard();
        AutomatedSystem automatedSystem = new AutomatedSystem(1);
        ParkingLot myParkingLot = new ParkingLot("MyParkingLot",100,"Sector-100 Hyd",50, automatedSystem, displayBoard);


        // checking the availability of this parking Lot
        int availability = myParkingLot.getAvailability();
        System.out.println(availability);

        // Creating Customer
        Customer pavan = new Customer("Pavan","TS85 AX 5454");

        // Automated System Generating Ticket
        Ticket pavanTicket = myParkingLot.automatedSystem.generateTicket(pavan);

        // Printing Ticket Info
        System.out.println(pavanTicket);


    }

}