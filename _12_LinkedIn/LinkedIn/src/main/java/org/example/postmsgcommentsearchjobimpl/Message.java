package org.example.postmsgcommentsearchjobimpl;

import org.example.personaccountprofilerequestimpl.Member;

public class Message {

    private String messageId;
    private String text;
    private String media;
    private Member sentTo;


    public Message(String messageId, String text, String media, Member sentTo) {
        this.messageId = messageId;
        this.text = text;
        this.media = media;
        this.sentTo = sentTo;
    }

    public String getText(){
        return text;
    }

    public String getMedia(){
        return media;
    }


}
