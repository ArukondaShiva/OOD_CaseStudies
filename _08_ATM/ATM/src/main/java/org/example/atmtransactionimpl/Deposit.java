package org.example.atmtransactionimpl;

import org.example.enumerationImpl.TransactionStatus;
import org.example.enumerationImpl.TransactionType;

import java.time.LocalDateTime;

public class Deposit extends Transaction{

    private int amount;

    public Deposit(String id, String status, TransactionType type, LocalDateTime date) {
        super(id, status, date);
    }

    public void getTotalBalance(){

    }

}
