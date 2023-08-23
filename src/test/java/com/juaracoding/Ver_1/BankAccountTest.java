package com.juaracoding.Ver_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BankAccountTest {
    BankAccount bank = new BankAccount(12345, "Tyas", 100_000.0);

    @Test
    public void testDeposit(){
        double actual = bank.deposit(20_000);
        double expect = 120_000;
        Assert.assertEquals(actual, expect);
    }
    @Test
    public void testWithdraw(){
        double actual = bank.withdraw(10_000);
        double expect = 110_000;
        Assert.assertEquals(actual, expect);
    }

}
