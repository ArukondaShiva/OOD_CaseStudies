package org.example.userImpl;

import org.example.movieImpl.Ticket;

import java.util.ArrayList;

public class RegisteredUser extends User{

    public ArrayList<Ticket> bookingHistory;

    public RegisteredUser(String name) {
        super(name);
        bookingHistory = new ArrayList<>();
    }

    public void cancelTicket(){

    }

}
