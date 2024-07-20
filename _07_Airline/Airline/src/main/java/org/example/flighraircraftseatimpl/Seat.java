package org.example.flighraircraftseatimpl;

import org.example.enumerationimpl.ClassType;
import org.example.enumerationimpl.SeatCategory;

public class Seat {

    public int seatNumber;
    public ClassType type;
    public SeatCategory category;

    Seat(int no,ClassType type, SeatCategory category){
        this.type = type;
        this.seatNumber = no;
        this.category = category;
    }

    public int getSeatNumber(){
        return seatNumber;
    }

    public ClassType getType(){
        return type;
    }

    public SeatCategory getCategory(){
        return category;
    }

}
