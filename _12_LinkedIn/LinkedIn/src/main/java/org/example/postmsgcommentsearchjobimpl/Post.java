package org.example.postmsgcommentsearchjobimpl;

import org.example.personaccountprofilerequestimpl.Member;

public class Post {

    private Member owner;
    private String postId;
    private String text;
    private int totalLikes;
    private int totalShares;


    public Post(Member owner, String postId, String text) {
        this.owner = owner;
        this.postId = postId;
        this.text = text;
        this.totalLikes = 0;
        this.totalShares = 0;
    }

    public void addLike(){
        totalLikes++;
    }

}
