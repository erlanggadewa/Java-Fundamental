package com.tutorial;
import  java.util.Scanner;

public class IfElse {
    public static void main (String[] args) {

        double nilai1, nilai2, hasil ;
        char operasi;
        Scanner inputAngga;

            inputAngga = new Scanner(System.in);
            System.out.println("===== KALKULATOR SEDERHANA =====");
            System.out.print("masukan nilai = ");
            nilai1 = inputAngga.nextDouble();
            System.out.print("masukan operasi ( + , - , / , x ) = ");
            operasi = inputAngga.next().charAt(0);
            System.out.print("masukan nilai = ");
            nilai2 = inputAngga.nextDouble();

                if (operasi == '+') {
                    hasil = nilai1 + nilai2;
                    System.out.println("Hasil adalah = " + hasil);
                } else if (operasi == '-') {
                    hasil = nilai1 - nilai2;
                    System.out.println("Hasil adalah = " + hasil);
                } else if (operasi == 'x') {
                    hasil = nilai1 * nilai2;
                    System.out.println("Hasil adalah = " + hasil);
                } else if (operasi == '/' && nilai2 == 0) {
                        System.out.println("Hasil  adalah = 'Tidak Hingga' ");
                } else if (operasi == '/' && nilai2 != 0){
                        hasil = nilai1 / nilai2;
                        System.out.println("Hasil adalah = " + hasil);
                } else {
                    System.out.println("Operasi tidak berjalan");
                }

                System.out.println("\nSELESAI");



    }
}
