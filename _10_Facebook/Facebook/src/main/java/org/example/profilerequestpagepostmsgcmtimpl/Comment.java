package org.example.profilerequestpagepostmsgcmtimpl;

import org.example.personaddressaccountimpl.Member;

public class Comment {

    private String commentId;
    private String text;
    private int totalLikes;
    private Member owner;


    public Comment(String commentId, String text, Member owner) {
        this.commentId = commentId;
        this.text = text;
        this.owner = owner;
    }

    public void addLike(){
        totalLikes++;
    }

}
