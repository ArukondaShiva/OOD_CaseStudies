package org.example.atmtransactionimpl;

import java.time.LocalDateTime;

public class Transfer extends Transaction{

    private String sourceAccountNumber;
    private String destAccountNumber;

    public Transfer(String id, String status, LocalDateTime date, String sourceAccountNumber,
                    String destAccountNumber) {
        super(id, status, date);
        this.sourceAccountNumber = sourceAccountNumber;
        this.destAccountNumber = destAccountNumber;
    }


    public void send(int amount){

    }

}
