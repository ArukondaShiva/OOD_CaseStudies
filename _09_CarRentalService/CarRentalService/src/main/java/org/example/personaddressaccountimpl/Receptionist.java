package org.example.personaddressaccountimpl;

import org.example.enumerationimpl.AccountStatus;

import java.time.LocalDateTime;

public class Receptionist extends Account{

    private LocalDateTime joiningDate;

    public Receptionist(String id, String password, Person person, AccountStatus status,LocalDateTime joiningDate) {
        super(id, password, person, status);
        this.joiningDate = joiningDate;
    }
}
