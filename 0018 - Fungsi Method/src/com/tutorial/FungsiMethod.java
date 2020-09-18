package com.tutorial;

public class FungsiMethod {

    public static void main (String[] args){

        int y, x , a;

        // y = f(x) = (x * x)+ 10

        a = 10;
        y = f(a);
        System.out.println("Hasil = " + y);

        x = 20;
        y = f(x);
        System.out.println("Hasil = " + y);

        x = 30;
        y = f(x);
        System.out.println("Hasil = " + y);

    }

    static int f(int input){

        int y;

        y = (input * input) + 10;
        return y;
    }


}
