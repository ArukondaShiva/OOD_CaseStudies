package org.example.userimpl;

import org.example.atmtransactionimpl.DebitCard;
import org.example.bankatmtransactionimpl.Bank;

public class CurrentAccount extends Account{

    private int withdrawLimit;
    private DebitCard card;

    public CurrentAccount(String accountNumber, Bank bank, int availableBalance,int withdrawLimit, DebitCard card) {
        super(accountNumber, bank, availableBalance);
        this.withdrawLimit = withdrawLimit;
        this.card = card;
    }
}
