package org.example.personaddressaccountimpl;

import org.example.enumerationimpl.AccountStatus;

public class Account {

    private String id;
    private String password;
    private Person person;
    private AccountStatus status;


    public Account(String id, String password, Person person, AccountStatus status) {
        this.id = id;
        this.password = password;
        this.person = person;
        this.status = status;
    }

    public void resetPassword(){

    }

}
