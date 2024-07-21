package org.example.librarybooklendingfinecatalogimpl;

import java.util.Date;

public class Fine {

    private Date creationDate;
    private String bookId;
    private String memberId;
    private int finePerDay = 5;


    public int calculateFine(int days){
        return days*finePerDay;
    }


}
