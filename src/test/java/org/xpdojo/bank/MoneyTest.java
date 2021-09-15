package org.xpdojo.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.xpdojo.bank.Money;
class MoneyTest {

    @Test
    public void getAmount() {
        Money money = new Money(5);
        assertThat(money.amount).isEqualTo(5);
    }
}