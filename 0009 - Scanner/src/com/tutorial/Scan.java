package com.tutorial;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {

        Scanner inputAngga = new Scanner(System.in);
        int panjang, lebar, hasil, jarijari;
        double hasil2;
        String blabla;

        // LUAS LINGKARAN
        System.out.println("==== PENGHITUNG LUAS LINGKARAN =====");
        System.out.print("Masukan Lingkaran = ");
        jarijari = inputAngga.nextInt();
        hasil2 = (jarijari * jarijari * 3.14);
        System.out.println("-----------------------");
        System.out.println("Luas Lingkaran = " + hasil2);
        System.out.println(); // new line

        // INPUT NAMA
        System.out.println("===== APLIKASI PENYAPA=====");
        System.out.print("Masukan Nama = ");
        blabla = inputAngga.next();
        System.out.println("Haiiii  " + blabla + " tersayang");
        System.out.println(); // new line

    }
}
