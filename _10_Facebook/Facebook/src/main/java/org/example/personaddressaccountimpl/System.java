package org.example.personaddressaccountimpl;

import org.example.enumerationimpl.AccountStatus;

public class System extends Account{

    public System(String id, String password, Person person, AccountStatus status) {
        super(id, password, person, status);
    }

    public void blockMember(Member name){

    }

    public void unblockMember(Member name){

    }

}
