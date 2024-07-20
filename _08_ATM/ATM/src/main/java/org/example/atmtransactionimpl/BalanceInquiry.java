package org.example.atmtransactionimpl;

import java.time.LocalDateTime;

public class BalanceInquiry extends Transaction{

    private String accountNumber;

    public BalanceInquiry(String id, String status, LocalDateTime date, String accountId) {
        super(id, status, date);
        this.accountNumber = accountId;
    }

    public void getDetails() {

    }

}
