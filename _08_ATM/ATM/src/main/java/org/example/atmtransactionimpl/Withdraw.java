package org.example.atmtransactionimpl;

import org.example.enumerationImpl.TransactionStatus;
import org.example.enumerationImpl.TransactionType;

import java.time.LocalDateTime;

public class Withdraw extends Transaction{

    public int ammount;
    public String accountNumber;

    public Withdraw(String id, String status, TransactionType type, LocalDateTime date, String accountNumber,int amount) {
        super(id, status, date);
        this.accountNumber = accountNumber;
        this.ammount = amount;
    }

    public void getAmount(){

    }


}
