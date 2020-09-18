package com.tutorial;

import java.util.Scanner;

public class ForLoop {
    public static  void main (String[] angga){

//        for (inisialisasi; kondisi; step nilai (increment/dicrement)){
//            aksi;
//        }

        int a;
        Scanner inputAngga = new Scanner(System.in);

        //aslinya
        System.out.println("===== Loop 1 =====");
        for (a = 0; a <= 10; a++) {
            System.out.println("Nilai a = " + a);
        }

        //bisa diubah begini nilai inisialisasi dan step nilai dikeluarkan
        System.out.println("\n===== Loop 2 =====");
        System.out.print("Masukan Nilai = ");
        a = inputAngga.nextInt();
        for (; a <= 10; ){
            System.out.println("Nilai a = " + a);
            a++; // step nilai yg dikeluarkan
        }

        //bisa diubah begini nilai inisialisasi dikeluarkan
        System.out.println("\n===== Loop 3 =====");
        System.out.print("Masukan Nilai = ");
        a = inputAngga.nextInt(); //inisialisasi yang dikeluarkan
        for (; a >= -10; a--){
            System.out.println("Nilai a = " + a);
        }


    }
}
