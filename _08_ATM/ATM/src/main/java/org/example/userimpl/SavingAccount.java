package org.example.userimpl;

import org.example.atmtransactionimpl.DebitCard;
import org.example.bankatmtransactionimpl.Bank;

public class SavingAccount extends Account{

    private DebitCard card;
    private int withdrawLimit;

    public SavingAccount(String accountNumber, Bank bank, int availableBalance,int withdrawLimit,DebitCard card) {
        super(accountNumber, bank, availableBalance);
        this.withdrawLimit = withdrawLimit;
        this.card = card;
    }

}
