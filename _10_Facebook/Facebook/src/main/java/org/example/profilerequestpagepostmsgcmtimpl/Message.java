package org.example.profilerequestpagepostmsgcmtimpl;

import org.example.personaddressaccountimpl.Member;

public class Message {

    private String messageId;
    private String text;
    private String media;
    private Member sentTo;
    private Member sentFrom;


    public Message(String messageId, String text, String media, Member sentTo, Member sentFrom) {
        this.messageId = messageId;
        this.text = text;
        this.media = media;
        this.sentTo = sentTo;
        this.sentFrom = sentFrom;
    }

    public String getText(){
        return text;
    }

    public String getMedia(){
        return media;
    }

}
