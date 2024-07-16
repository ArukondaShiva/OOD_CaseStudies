package org.example.logImpl;

import org.example.enumImpl.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Shipment {

    private static int numberCounter = 0;
    private int shipmentNumber;
    private LocalDateTime date;
    private LocalDateTime estimatedArrival;
    private Order orderDetails;


    public Shipment(Order orderDetails){
        numberCounter++;
        this.shipmentNumber = numberCounter;
        this.date = LocalDateTime.now();
        this.estimatedArrival = this.date.plusDays(3);
        this.orderDetails = orderDetails;
        orderDetails.setOrderStatus(OrderStatus.SHIPPED);
    }


    public String toString(){

        return  "Shipment { "+
                "shipmentNumber = "+shipmentNumber+
                ", date="+date+
                ", estimatedArrival="+estimatedArrival+
                ", orderDetails = "+orderDetails+"}";

    }


}
