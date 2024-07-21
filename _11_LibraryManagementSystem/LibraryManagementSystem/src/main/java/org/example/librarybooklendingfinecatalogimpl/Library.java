package org.example.librarybooklendingfinecatalogimpl;

public class Library {

    private String name;
    private String address;

    public Library(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

}
