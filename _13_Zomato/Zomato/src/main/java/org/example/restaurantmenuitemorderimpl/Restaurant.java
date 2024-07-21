package org.example.restaurantmenuitemorderimpl;

import java.util.ArrayList;

public class Restaurant {

    private String name;
    private ArrayList<Branch> branches;

    public Restaurant(String name,Branch initialBranch){
        this.name = name;
        this.branches = new ArrayList<Branch>();
        this.branches.add(initialBranch);
    }

    public void addBranch(Branch branch){
        this.branches.add(branch);
    }

}
