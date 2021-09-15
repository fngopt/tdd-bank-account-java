package org.xpdojo.bank;
import java.util.Vector;
import java.lang.Integer;

import org.xpdojo.bank.Money;

public class Account {
    Vector<Money> deposits;

    Account()
    {
        this.deposits = new Vector<>();
    }

    void deposit(int amount)
    {
        this.deposits.add(new Money(amount));
    }

    int getBalance()
    {
        if (this.deposits.size() == 0)
        {
            return 0;
        }
        int balance = 0;
        for (Money val : this.deposits)
        {
            balance += val.amount;
        }
        return balance;
    }
}
