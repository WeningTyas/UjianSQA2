package com.juaracoding.Ver_2;

public class Main {
    public static void main(String[] args) {
                /*Langsung panggil class lain*/
        TransaksiBank transaksi = new TransaksiBank();
        transaksi.depositAmount(1234, "Almira", 2_000_000);
        System.out.println("__________________________");
        transaksi.withdrawAmount(1234, "Almira", 100_000);
    }
}
