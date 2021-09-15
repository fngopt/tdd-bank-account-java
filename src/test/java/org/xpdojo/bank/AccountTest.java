package org.xpdojo.bank;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import org.xpdojo.bank.Account;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        assertThat(account.getBalance()).isEqualTo(0);
    }

    @Test
    public void testDepositBalance() {
        Account account = new Account();
        account.deposit(10);
        assertThat(account.getBalance()).isEqualTo(10);
    }

    @Test
    public void testMultiDepositBalance() {
        Account account = new Account();
        account.deposit(10);
        account.deposit(20);
        account.deposit(30);
        assertThat(account.getBalance()).isEqualTo(60);
    }

}
