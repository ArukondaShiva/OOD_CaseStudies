package org.example.personaccountprofilerequestimpl;

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

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getCoverPic() {
        return coverPic;
    }

    public void setCoverPic(String coverPic) {
        this.coverPic = coverPic;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArrayList<String> getExperiences() {
        return experiences;
    }

    public void setExperiences(ArrayList<String> experiences) {
        this.experiences = experiences;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
