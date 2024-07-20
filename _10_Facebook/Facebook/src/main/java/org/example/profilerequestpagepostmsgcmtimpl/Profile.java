package org.example.profilerequestpagepostmsgcmtimpl;

import java.util.ArrayList;

public class Profile {

    private String profilePic;
    private String coverPic;
    private String gender;
    private ArrayList<String> experiences;
    private String place;


    public Profile(String profilePic, String coverPic, String gender, ArrayList<String> experiences, String place) {
        this.profilePic = profilePic;
        this.coverPic = coverPic;
        this.gender = gender;
        this.experiences = experiences;
        this.place = place;
    }

}
