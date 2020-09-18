package com.tutorial;

public class OperatorUnary {

    public static void main(String[] args) {

        /*
        OPERATOR UNARY
        --> Yaitu operator yang digunakan pada operasi satu variabel
        */

        // Unary + dan - (tidak mengubah nilai asal dan seperti dikali dengan negatif 1)
        int angka1 = -4;
        System.out.println("Nilai = " + angka1);
        System.out.printf("Unary (+) dari %d adalah %d \n", angka1, +angka1);
        System.out.printf("Unary (-) dari %d adalah %d \n", angka1, -angka1);
        System.out.println(); //enter barisan

        //Unary decrement (--) dan increment (++) (mengubah nilai asal)
        int angka2 = 7;
        System.out.println("Nilai = " + angka2);
        System.out.printf("Nilai dengan (++) = %d \n", ++angka2);
        System.out.printf("Nilai dengan (--) = %d \n", --angka2);
        System.out.println(); //enter baris

        int angka3 = 70;
        System.out.println("Nilai = " + angka3);
        System.out.printf("Nilai dengan (--) prefix = %d \n", ++angka3); //prefix dieksekusi dahulu sebelum diprint
        System.out.println(); //enter baris


        int angka4 = 98;
        System.out.println("Nilai = " + angka4);
        System.out.printf("Nilai dengan (--) postfix = %d \n", angka4--);//postfix diprint dahulu sebelum dieksekusi
        System.out.printf("Nilai hasil dari postfix = %d \n", angka4);
        System.out.println(); //enter baris

        //Unary Boolean (!) untuk negasi (seperti dikali negatif 1 juga)
        boolean x = true;
        System.out.println("Nilai boolean = " + x);
        System.out.printf("Nilai !boolean = %b \n", !x);
        System.out.printf("Nilai !!boolean = %b \n", !!x);
        System.out.printf("Nilai !!!boolean = %b \n", !!!x);




    }
}
