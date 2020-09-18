package com.practice;
import java.util.Scanner;


public class DeretFibonacci {
    public static void main (String[] args){

        long Fn1 = 0, Fn2 = 1, Fn3 = 0, n, step = 0;
        Scanner inputAngga ;
        inputAngga = new Scanner(System.in);


        System.out.print("Masukan Nilai Fibonacci N ke = ");
        n = inputAngga.nextInt();

        System.out.println("Hasil Nilai Fibonacci ke-" + step + " = " + Fn3);

        while (step < n){
            ++step;
            Fn3 = Fn2 + Fn1;
            System.out.println("Hasil Nilai Fibonacci ke-" + step + " = " + Fn3);
            Fn1 = Fn2;
            Fn2 = Fn3;
            if (step == 1){
                Fn1 = 0;
            }

        }

    }
}
