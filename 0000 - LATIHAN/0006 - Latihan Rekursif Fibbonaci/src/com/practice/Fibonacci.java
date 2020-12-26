package com.practice;
import java.util.Scanner;
import java.lang.String;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner inputAngga = new Scanner(System.in);
        int nilai;

        System.out.print("Masukan Suku ke-n = ");
        nilai = inputAngga.nextInt();
        System.out.println("Nilai Fibonacci suku ke-" + nilai + " = " + Fibo(nilai, "atas"));


    }

    private static int Fibo(int parameter, String daun) {

        System.out.println("daun " + daun);
        System.out.println("FIbonacci ke-" + parameter + "\n");

        return (parameter != 1 && parameter != 0) ? Fibo(parameter - 1, "kiri") + Fibo(parameter - 2, "kanan") : parameter;

        //         PENJELASAN
        //        System.out.println("daun " + daun);
        //        System.out.println("FIbonacci ke-" + parameter + "\n");
        //        if (parameter == 1 || parameter == 0){
        //            return parameter;
        //        } else {
        //            return Fibo(parameter - 1,"kiri") + Fibo(parameter - 2, "kanan");
        //        }


    }
}