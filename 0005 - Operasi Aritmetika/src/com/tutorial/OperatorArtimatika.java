package com.tutorial;

public class OperatorArtimatika {
    public static void main (String[] Args ){

        //OPERASI MATEMATIKA

        float A = 90000;
        float B = 7;
        float Hasilfloat;

        //Jumlah
        Hasilfloat = A + B;
        System.out.println(A + " + " + B + " = " + Hasilfloat);

        //Pengurangan
        Hasilfloat = A - B;
        System.out.printf("%.0f - %.0f = %.0f %n", A, B, Hasilfloat);

        //Pembagian
        Hasilfloat = A / B;
        System.out.printf("%.0f : %.0f = %f \n", A, B, Hasilfloat);

        //Perkalian
        Hasilfloat = A * B;
        System.out.println(A + " x " + B + " = " + Hasilfloat);

        //Modulus (Sisa Bagi)
        Hasilfloat = A % B;
        System.out.printf("%.0f %% %.0f = %.0f", A, B, Hasilfloat);

    }

}
