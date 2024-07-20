package org.example.userimpl;

import org.example.bankatmtransactionimpl.Bank;
import org.example.enumerationImpl.Status;

public class Account {

    private String accountNumber;
    private int availableBalance;
    private Bank bank;
    private Status status = Status.ACTIVE;


    public Account(String accountNumber, Bank bank, int availableBalance){
        this.accountNumber = accountNumber;
        this.bank = bank;
        this.availableBalance = availableBalance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public int getAvailableBalance(){
        return availableBalance;
    }


}
