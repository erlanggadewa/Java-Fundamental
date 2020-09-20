package com.tutorial;

import java.util.Scanner;

public class PecahanUang {
    public static void main(String[] args) {
        double nilaiUang;
        double sisaBagi;
        int jumlahPecahan;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukan Nominal Uang = ");
        nilaiUang = inputUser.nextDouble();

        sisaBagi = (nilaiUang % 100000);
        jumlahPecahan = (int) (nilaiUang / 100000);
        System.out.println(jumlahPecahan + " pecahan 100.000");

        jumlahPecahan = (int) (sisaBagi / 50000);
        sisaBagi = (sisaBagi % 50000);
        System.out.println(jumlahPecahan + " pecahan 50.000");

        jumlahPecahan = (int) (sisaBagi / 20000);
        sisaBagi = (sisaBagi % 20000);
        System.out.println(jumlahPecahan + " pecahan 20.000");

        jumlahPecahan = (int) (sisaBagi / 10000);
        sisaBagi = (sisaBagi % 10000);
        System.out.println(jumlahPecahan + " pecahan 10.000");

        jumlahPecahan = (int) (sisaBagi / 5000);
        sisaBagi = (sisaBagi % 5000);
        System.out.println(jumlahPecahan + " pecahan 5000");

        jumlahPecahan = (int) (sisaBagi / 1000);
        sisaBagi = (sisaBagi % 1000);
        System.out.println(jumlahPecahan + " pecahan 1000");

        jumlahPecahan = (int) (sisaBagi / 500);
        sisaBagi = (sisaBagi % 500);
        System.out.println(jumlahPecahan + " pecahan 500");

        jumlahPecahan = (int) (sisaBagi / 200);
        sisaBagi = (sisaBagi % 200);
        System.out.println(jumlahPecahan + " pecahan 200");

        jumlahPecahan = (int) (sisaBagi / 100);
        sisaBagi = (sisaBagi % 100);
        System.out.println(jumlahPecahan + " pecahan 100");

        jumlahPecahan = (int) (sisaBagi / 50);
        sisaBagi = (sisaBagi % 50);
        System.out.println(jumlahPecahan + " pecahan 50");

        jumlahPecahan = (int) (sisaBagi / 1);
        System.out.println(jumlahPecahan + " pecahan 1 sen");

    }
}

