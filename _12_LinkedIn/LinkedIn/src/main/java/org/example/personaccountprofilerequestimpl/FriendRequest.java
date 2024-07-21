package org.example.personaccountprofilerequestimpl;

import org.example.enumerationimpl.RequestStatus;

import java.time.LocalDateTime;

public class FriendRequest {

    private Member requestFrom;
    private Member requestTo;
    private LocalDateTime created;
    private LocalDateTime updated;
    private RequestStatus status;


    public FriendRequest(Member requestFrom, Member requestTo) {
        this.requestFrom = requestFrom;
        this.requestTo = requestTo;
        this.created = LocalDateTime.now();
        this.status = RequestStatus.PENDING;
    }

    public void accept(){

    }

    public void reject(){

    }

}
