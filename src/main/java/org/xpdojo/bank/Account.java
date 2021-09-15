package org.xpdojo.bank;

public class Account {
    int balance = 0;

    void deposit(int amount)
    {
        this.balance += amount;
    }
}
