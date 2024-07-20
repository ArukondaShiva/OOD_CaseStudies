package org.example.atmtransactionimpl;

import org.example.bankatmtransactionimpl.Address;
import org.example.bankatmtransactionimpl.Bank;
import org.example.userimpl.Account;

public class ATM {

    private String atmId;
    private Bank bank;
    private Address address;


    public ATM(String atmId, Bank bank, Address address){
        this.atmId = atmId;
        this.bank = bank;
        this.address = address;
    }


    public Boolean authenticateUser(String id,String password){
        if(id == "id" && password =="password"){
            return true;
        }else{
            return false;
        }
    }

    public Boolean makeTransaction(Account user,int amount){
        if(user.getAvailableBalance() < amount){
            return false;
        }else{
            return true;
        }
    }


}
