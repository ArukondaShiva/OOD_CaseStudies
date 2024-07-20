package org.example.accountstaffresimpl;

import org.example.flighraircraftseatimpl.Airport;
import org.example.flighraircraftseatimpl.Flight;
import org.example.flighraircraftseatimpl.Seat;

import java.time.LocalDateTime;

public class Reservation {

    public LocalDateTime creationDate;
    public String reservationNumber;
    public Flight flight;
    public Seat seats;
    public Airport destionationAirport;
    public Airport sourceAirport;


    public Reservation(LocalDateTime creationDate, String reservationNumber, Flight flight, Seat seat, Airport destionationAirport, Airport sourceAirport){
        this.destionationAirport = destionationAirport;
        this.sourceAirport = sourceAirport;
        this.flight = flight;
        this.creationDate = creationDate;
        this.seats = seat;
        this.reservationNumber = reservationNumber;
    }

    public String getReservationNumber(){
        return reservationNumber;
    }

    public Flight getFlight(){
        return flight;
    }

    public Seat getSeats(){
        return seats;
    }

}
