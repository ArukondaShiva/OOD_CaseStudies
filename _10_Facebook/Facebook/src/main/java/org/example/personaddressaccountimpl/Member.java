package org.example.personaddressaccountimpl;

import org.example.enumerationimpl.AccountStatus;
import org.example.profilerequestpagepostmsgcmtimpl.Message;
import org.example.profilerequestpagepostmsgcmtimpl.Page;
import org.example.profilerequestpagepostmsgcmtimpl.Post;

import java.util.ArrayList;

public class Member extends Account{

    private int id;
    private ArrayList<Member> following;
    private ArrayList<Member> followers;
    private ArrayList<Page> pagesFollow;


    public Member(String id, String password, Person person, AccountStatus status,int id2) {
        super(id, password, person, status);
        this.id = id2;
        this.following = new ArrayList<Member>();
        this.followers = new ArrayList<Member>();
        this.pagesFollow = new ArrayList<Page>();
    }

    public void sendMessage(String msg){

    }

    public void createPost(Post post){

    }

    public void sendRequest(Member name){

    }

    public void addFollower(Member member){
        this.followers.add(member);
    }

    public void addFollow(Member member){
        this.following.add(member);
    }


    public void addPage(Page page){
        this.pagesFollow.add(page);
    }

    public void removeFollow(Member member){
        this.following.remove(member);
    }

    public void removeFollower(Member member){
        this.followers.remove(member);
    }

}
