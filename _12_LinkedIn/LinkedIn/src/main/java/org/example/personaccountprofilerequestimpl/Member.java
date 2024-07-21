package org.example.personaccountprofilerequestimpl;

import org.example.postmsgcommentsearchjobimpl.Job;
import org.example.postmsgcommentsearchjobimpl.Post;

import java.util.ArrayList;

public class Member extends Account{

    private String id;
    private ArrayList<Member> following;
    private ArrayList<Member> followers;
    private ArrayList<Job> pagesFollow;

    public Member(String id, String password, Person person, Account status) {
        super(id, password, person, status);
        this.followers = new ArrayList<Member>();
        this.following = new ArrayList<Member>();
        this.pagesFollow = new ArrayList<Job>();
    }

    public void sendMessage(String msg){

    }

    public void createPost(Post post){

    }

    public void sendRequest(Member name){

    }

}
