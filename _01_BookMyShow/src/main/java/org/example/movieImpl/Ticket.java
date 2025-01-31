package org.example.movieImpl;

import java.util.*;

public class Ticket {

    private static int idCounter = 0;
    private int id;
    private String owner;
    private Date bookingTime;
    private int numberOfSeats;
    private Show bookedShow;

    public Ticket(){
        idCounter++;
        this.id = idCounter;
    }

    public String getTicketInfo(){
        return null;
    }

    public int cancelTicket(){
        return 0;
    }

    public String getOwner(){
        return owner;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public Date getBookingTime(){
        return bookingTime;
    }

    public void setBookingTime(Date bookingTime){
        this.bookingTime = bookingTime;
    }

    public int getNumberOfSeats(){
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats){
        this.numberOfSeats = numberOfSeats;
    }

    public Show getBookedShow(){
        return bookedShow;
    }

    public void setBookedShow(Show bookedShow){
        this.bookedShow = bookedShow;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", owner='" + owner + '\'' +
                ", bookingTime=" + bookingTime +
                ", numberOfSeats=" + numberOfSeats +
                ", bookedShow=" + bookedShow +
                '}';
    }
}
