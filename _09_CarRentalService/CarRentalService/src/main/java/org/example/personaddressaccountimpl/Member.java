package org.example.personaddressaccountimpl;

import org.example.enumerationimpl.AccountStatus;

public class Member extends Account{

    private int totalVehicles = 0;

    public Member(String id, String password, Person person, AccountStatus status,int totalVehicles) {
        super(id, password, person, status);
        this.totalVehicles = totalVehicles;
    }

}
