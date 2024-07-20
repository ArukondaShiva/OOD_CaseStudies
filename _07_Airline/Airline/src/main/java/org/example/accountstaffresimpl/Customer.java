package org.example.accountstaffresimpl;

public class Customer extends Account{

    public Boolean frequentFlyer;

    public Customer(String id, String password, String name, String email, String phone, Passport passport) {
        super(id, password, name, email, phone, passport);
    }

    Customer(String id, String password, String name, String email, String phone, Passport passport, Boolean frequentFlyer){
        super(id, password, name, email, phone, passport);
        this.frequentFlyer = frequentFlyer;
    }

}
