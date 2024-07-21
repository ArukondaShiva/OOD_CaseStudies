package org.example;

import org.example.movieImpl.Show;
import org.example.movieImpl.Ticket;
import org.example.userImpl.RegisteredUser;

public class TicketBookingThread extends Thread{

    private Show show;
    private RegisteredUser user;
    private int numberOfSeats;
    private Ticket ticket;

    public TicketBookingThread(Show show, RegisteredUser user,int numberOfSeats){
        this.show = show;
        this.user = user;
        this.numberOfSeats = numberOfSeats;
    }

    public void run(){
        this.ticket = show.bookticket(user,numberOfSeats);
    }

    public Ticket getTicket(){
        return ticket;
    }

}
