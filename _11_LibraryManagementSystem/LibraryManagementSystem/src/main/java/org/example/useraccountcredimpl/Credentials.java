package org.example.useraccountcredimpl;

import java.util.HashMap;

public class Credentials {

    private HashMap<String,String> loginPass = new HashMap<>();

    Credentials(String userName, String password){
        if(loginPass.containsKey(userName)){
            System.out.println("Invalid Username - Already Exist");
        }
        else{
            loginPass.put(userName, password);
        }
    }


    public boolean login(String userName, String password){
        if(loginPass.get(userName)==password){
            System.out.println("LoggedIn Successfully...");
            return true;
        }
        return false;
    }

}
