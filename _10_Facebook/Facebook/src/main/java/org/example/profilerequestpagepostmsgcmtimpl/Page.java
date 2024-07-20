package org.example.profilerequestpagepostmsgcmtimpl;

import org.example.personaddressaccountimpl.Member;
import java.util.ArrayList;

public class Page {

    private String name;
    private String description;
    private String id;
    private ArrayList<Member> members;

    Page(String name, String description, String id){
        this.name = name;
        this.description = description;
        this.id = id;
        members = new ArrayList<Member>();
    }

    public int getTotalMember(){
        return members.size();
    }


}