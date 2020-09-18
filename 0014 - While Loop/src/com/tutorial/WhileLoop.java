package com.tutorial;
import java.util.Scanner;

public class WhileLoop {
    public static void main (String[] angga){

//        while (kondisi) {
//            aksi
//        }

        Scanner inputAngga;
        int a;
        inputAngga = new Scanner(System.in);

        System.out.print("Masukan Nilai : ");
        a = inputAngga.nextInt();

        while(a <= 10){
            System.out.println("Nilai a = " + a);
            a++;
        }
        System.out.println("Program Selesai");
    }
}
