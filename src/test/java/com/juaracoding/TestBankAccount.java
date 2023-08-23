package com.juaracoding;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBankAccount {
    BankData bank = new BankData();
    Transaksi transaksi = new Transaksi();

    @Test (priority = 1)
    public void testAmountValue(){
        bank.setAmount(2_000_000);
        double actual = bank.getAmount();
        double expect = 2_000_000;
        Assert.assertEquals(actual,expect);
    }
    @Test (priority = 2)
    public void testAccuntValue(){
        bank.setAccount_no(2345);
        int actual = bank.getAccount_no();
        int expect = 2345;
        Assert.assertEquals(actual,expect);
    }
    @Test (priority = 3)
    public void testNameValue(){
        bank.setName("Amelia");
        String actual = bank.getName();
        String expect = "Amelia";
        Assert.assertEquals(actual,expect);
    }

    //========== Transaksi ==========//
    @Test (priority = 4)
    public void testDeposit(){
        bank.setAmount(3_000_000);
        double actual = bank.getAmount();

        transaksi.deposit(actual);
        double expect = 3_000_000;
        Assert.assertEquals(actual,expect);
    }
    @Test (priority = 5)
    public void testWithdraw(){
        bank.setAmount(1_000_000);
        double actual = bank.getAmount();

        transaksi.withdraw(actual);
        double expect = 1_000_000;
        Assert.assertEquals(actual,expect);
    }
}
