package org.example.personaccountprofilerequestimpl;

public class Account {

    private String id;
    private String password;
    private Person person;
    private Account status;

    public Account(String id, String password, Person person, Account status) {
        this.id = id;
        this.password = password;
        this.person = person;
        this.status = status;
    }


    public void resetPassword(String password){
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Account getStatus() {
        return status;
    }

    public void setStatus(Account status) {
        this.status = status;
    }
}
