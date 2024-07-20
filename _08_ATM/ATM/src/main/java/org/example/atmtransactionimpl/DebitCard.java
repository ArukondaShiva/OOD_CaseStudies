package org.example.atmtransactionimpl;

import java.time.LocalDateTime;

public class DebitCard {

    private String name;
    private String cardNumber;
    private int cvv;
    private LocalDateTime expiryDate;


    public DebitCard(String name, String cardNumber, int cvv, LocalDateTime expiryDate){
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }


}
