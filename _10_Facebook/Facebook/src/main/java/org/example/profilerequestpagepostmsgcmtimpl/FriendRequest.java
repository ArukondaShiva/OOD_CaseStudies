package org.example.profilerequestpagepostmsgcmtimpl;

import org.example.enumerationimpl.RequestStatus;
import org.example.personaddressaccountimpl.Member;

import java.time.LocalDateTime;

public class FriendRequest {

    private Member requestFrom;
    private Member requestTo;
    private RequestStatus status;
    private LocalDateTime created;
    private LocalDateTime updated;


    public FriendRequest(Member requestFrom, Member requestTo) {
        this.requestFrom = requestFrom;
        this.requestTo = requestTo;
        this.created = LocalDateTime.now();
        this.status = RequestStatus.PENDING;
    }


    public void accept(){
        this.status = RequestStatus.ACCEPTED;
        this.updated = LocalDateTime.now();
        requestFrom.addFollow(requestTo);
        requestTo.addFollower(requestFrom);
    }

    public void reject(){
        this.status = RequestStatus.REJECTED;
        this.updated = LocalDateTime.now();
    }


}
