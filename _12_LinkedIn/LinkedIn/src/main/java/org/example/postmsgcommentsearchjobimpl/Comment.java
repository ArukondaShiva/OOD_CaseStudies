package org.example.postmsgcommentsearchjobimpl;

import org.example.personaccountprofilerequestimpl.Member;

public class Comment {

    private String commentId;
    private String text;
    private int totalLikes;
    private Member owner;


    public Comment(String commentId, String text, Member member) {
        this.commentId = commentId;
        this.text = text;
        this.totalLikes = 0;
        this.owner = member;
    }

    public void addLike(){
        totalLikes++;
    }

}
