package com.juaracoding.Ver_1;

public class BankAccount {

    int account_no;
    String name;
    double amount;

    public BankAccount(int akun, String nama, double amount) {
        this.account_no = akun;
        this.name = nama;
        this.amount = amount;
    }

    public String display() {
        String display = account_no + " " + name + " " + amount;
        return display;
    }
    public String checkBalance() {
        String balance = "Balance is: " + amount;
        return balance;
    }

    public double deposit(double amt) {
        amount = amount + amt;
        System.out.println(amt + " deposited");
        return amount;
    }

    public double withdraw(double amt) {
        if (amount < amt) { // 100k < 10k
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + " withdrawn");
        }
        return amount;
    }

    public static void main(String[] args) {
        BankAccount bank = new BankAccount(12345, "Tyas", 200_000);
        bank.display();
        bank.deposit(500_000);
        bank.withdraw(100_000);
        bank.checkBalance();
    }
}
