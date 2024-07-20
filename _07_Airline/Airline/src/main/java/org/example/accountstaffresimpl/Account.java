package org.example.accountstaffresimpl;

import org.example.enumerationimpl.AccountStatus;

public class Account {

    private String id;
    private String password;
    private String name;
    private String email;
    private String phone;
    private AccountStatus status;
    private Passport passport;


    public Account(String id, String password, String name, String email, String phone, Passport passport){
        this.id = id;
        this.password = password;
        this.status = AccountStatus.ACTIVE;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.passport = passport;
    }


}
