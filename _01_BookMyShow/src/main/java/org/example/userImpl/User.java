package org.example.userImpl;


public abstract class User {

    private static int idCounter = 0;
    private int id;
    private String name;

    public User(String name) {
        idCounter++;
        this.id = idCounter;
        this.name = name;
    }

    public String getName(){
        return name;
    }

}