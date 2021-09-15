package org.xpdojo.bank;
import java.util.Vector;
import java.lang.Integer;

public class Account {
    Vector<Integer> deposits;

    Account()
    {
        this.deposits = new Vector<>();
    }

    void deposit(int amount)
    {
        this.deposits.add(amount);
    }

    int getBalance()
    {
        if (this.deposits.size() == 0)
        {
            return 0;
        }
        int balance = 0;
        for (Integer val : this.deposits)
        {
            balance += val;
        }
        return balance;
    }
}
