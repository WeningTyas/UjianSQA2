package com.juaracoding;


public class Main {
    public static void main(String[] args) {
                    /*Pakai Getter() & Setter()*/
        BankData bank = new BankData();
        Transaksi transaksi = new Transaksi();

        bank.setAccount_no(5678);
        bank.setName("Danur");
        bank.setAmount(6_000_000);
        transaksi.depositAmount(bank.getAccount_no(), bank.getName(), bank.getAmount());

        System.out.println("__________________________");

        bank.setAmount(10_000);
        transaksi.withdrawAmount(bank.getAccount_no(), bank.getName(), bank.getAmount());
    }
}