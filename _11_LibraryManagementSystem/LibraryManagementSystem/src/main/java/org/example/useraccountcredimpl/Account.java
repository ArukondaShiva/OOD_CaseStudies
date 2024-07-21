package org.example.useraccountcredimpl;

public class Account {

    private String id;
    private String password;
    private String name;
    private boolean status = true;
    private Credentials credentials;
    User person;


    public Account(String id, String password, User person) {
        this.id = id;
        this.password = password;
        this.person  = person;
        this.credentials = new Credentials(id,password);
    }

    public void resetPassword(){
        password = "";
    }

}
