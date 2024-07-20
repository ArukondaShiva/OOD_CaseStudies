package org.example.flighraircraftseatimpl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Timer;

public class Flight {

    public LocalDateTime departure;
    public LocalDateTime arrival;
    public Timer duration;
    public String origin;
    public String destination;


    Flight(LocalDateTime departure, LocalDateTime arrival, Timer duration, String source, String destination){
        this.origin = source;
        this.destination = destination;
        this.departure = departure;
        this.arrival = arrival;
        this.duration = duration;
    }


}
