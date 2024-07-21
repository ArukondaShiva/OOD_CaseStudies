package org.example.movieImpl;

import org.example.userImpl.RegisteredUser;

import java.util.*;

public class Show {

    private static int idCounter = 0;
    private int id;
    private Date showTime;
    private Movie movie;
    private Theater theater;
    private int availableSeats;


    public Show(Date showTime, Movie movie, Theater theater) {
        idCounter++;
        this.id = idCounter;
        this.showTime = showTime;
        this.movie = movie;
        this.theater = theater;
        this.availableSeats = theater.getCapacity();
        theater.addShow(this);
    }

    public Movie getMovie(){
        return movie;
    }

    public void setTheater(Theater theater){
        this.theater = theater;
    }

    public void setAvailableSeats(int availableSeats){
        this.availableSeats = availableSeats;
    }

    public int getAvailableSeats(){
        return availableSeats;
    }

    public void updateShow(){
    }

    public synchronized Ticket bookticket(RegisteredUser user,int seats){

        if(availableSeats>=seats && seats>0){
            availableSeats = availableSeats-seats;
            Ticket ticket = new Ticket();
            ticket.setOwner(user.getName());
            ticket.setBookedShow(this);
            ticket.setBookingTime(new Date());
            ticket.setNumberOfSeats(seats);
            user.bookingHistory.add(ticket);
            System.out.println("Ticket Booked Successfully");
            return ticket;
        }else{
            return null;
        }
    }


    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", showTime=" + showTime +
                ", movie=" + movie +
                ", theater=" + theater +
                ", availableSeats=" + availableSeats +
                '}';
    }
}
