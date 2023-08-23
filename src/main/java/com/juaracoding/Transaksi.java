package com.juaracoding;

public class Transaksi {
    BankData bank = new BankData();

    double amount;
    String name;
    int account_no;

    public double deposit(double amount) {
        this.amount = this.amount + amount;
        System.out.println(amount + " deposited");
        return amount;
    }

    public double withdraw(double amount) {
        if (this.amount < amount) {
            System.out.println("Insufficient Balance");
        } else {
            this.amount = this.amount - amount;
            System.out.println(amount + " withdrawn");
        }
        return amount;
    }

    public void checkBalance() {
        System.out.println();
        System.out.println("TOTAL   : " + amount);
    }

    public void display(int account_no, String name) {
        System.out.println("NO AKUN : " + account_no);
        System.out.println("NAMA    : " + name);
    }

    /// ====== Transaksi Berjalan ====== ///

    public void depositAmount(int account_no, String name, double amount){
        display(account_no, name);
        deposit(amount);
        checkBalance();
    }
    public void withdrawAmount(int account_no, String name, double amount){
        display(account_no, name);
        withdraw(amount);
        checkBalance();
    }
}
