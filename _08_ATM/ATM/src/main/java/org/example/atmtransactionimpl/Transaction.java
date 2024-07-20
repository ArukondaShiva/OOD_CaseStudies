package org.example.atmtransactionimpl;

import org.example.enumerationImpl.TransactionStatus;
import org.example.enumerationImpl.TransactionType;

import java.time.LocalDateTime;

public class Transaction {

    private String id;
    private LocalDateTime date;
    private TransactionStatus status;
    private TransactionType type;


    public Transaction(String id, TransactionStatus status,TransactionType type, LocalDateTime date){
        this.id = id;
        this.status = status;
        this.date = date;
        this.type = type;
    }

    public Transaction(String id2, String status2, LocalDateTime date2) {
    }

    public void makeTransaction(){

    }

    public void saveTransaction(){

    }

}
