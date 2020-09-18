package com.tutorial;
import  java.util.Scanner;

public class SwitchCase {
    public static void main (String[] args) {
        // bisa untuk string

        double nilai1, nilai2, hasil ;
        String operasi;
        Scanner inputAngga;

            inputAngga = new Scanner(System.in);
            System.out.println("===== KALKULATOR SEDERHANA =====");
            System.out.print("masukan nilai = ");
            nilai1 = inputAngga.nextDouble();
            System.out.print("masukan operasi ( + , - , / , x ) = ");
            operasi = inputAngga.next();
            System.out.print("masukan nilai = ");
            nilai2 = inputAngga.nextDouble();

            switch (operasi){
                case "+" :
                    hasil = nilai1 + nilai2;
                    System.out.println("Hasil penjumlahan = " + hasil);
                    break;
                case "-" :
                    hasil = nilai1 - nilai2;
                    System.out.println("Hasil pengurangan = " + hasil);
                    break;
                case "x" :
                    hasil = nilai1 * nilai2;
                    System.out.println("Hasil perkalian = " + hasil);
                    break;
                case "/" :
                    if (nilai2 == 0){
                        System.out.println("Operasi menghasilkan hasil 'Tak Hingga' ");
                    } else {
                        hasil = nilai1 / nilai2;
                        System.out.println("Hasil pembagian = " + hasil);
                    }
                    break;
                default :
                    System.out.println("Operasi Tidak Berjalan");


            }



    }
}
