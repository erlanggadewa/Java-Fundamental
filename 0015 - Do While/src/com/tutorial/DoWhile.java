package com.tutorial;
import java.util.Scanner;


public class DoWhile {
    public static void main (String[] angga){

//        do {
//            aksi
//        } while (kondisi);

        Scanner inputAngga;
        int a;
        boolean kondisi = true;
        inputAngga = new Scanner(System.in);

        System.out.print("Masukan Nilai = ");
        a = inputAngga.nextInt();

        do {
            a++;
            System.out.println("Print nilai a++ = " + a);
            if (a == 10){
                kondisi = false;
            }
        } while (kondisi);

    }
}
