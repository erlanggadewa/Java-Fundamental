package com.tutorial;

import java.util.Scanner;

public class OperatorTernary {
    public static void main (String[] args){

        //TERNARY OPERATION ITU SAMA SEPERTI IF ELSE, CUMA LEBIH SINGKAT

        Scanner inputAngga = new Scanner(System.in);
        int a;
        String x;

        System.out.print("Masukan angka = ");
        a = inputAngga.nextInt();

            //menguunakan If else
            if(a == 5){
                System.out.println("5");
            } else{
                System.out.println("bukan 5");
            }

            //menggunakan tenary
            x = (a == 5) ? ("lima") : ("bukan 5");
            System.out.println(x);

    }
}
