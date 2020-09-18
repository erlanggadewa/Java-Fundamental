package com.practice;
import java.util.Scanner;

public class LoopingSederhana {
    public static void main (String[] args){

        //Variabel
        int Un = 0, nilai1, nilai2;
        boolean kondisi = true;
        Scanner inputAngga = new Scanner(System.in);

        //Program
        System.out.print("Masukan Nilai Pertama = ");
        nilai1 = inputAngga.nextInt();
        System.out.print("Masukan Nilai Kedua = ");
        nilai2 = inputAngga.nextInt();

        while(kondisi){
            Un = Un + nilai1;
            ++nilai1;
            if (nilai1 > nilai2){
                kondisi = false;
                System.out.println("Total Un = " + Un);
            }
        }

//            bisa seperti ini juga
//            Un = (nilai1 + nilai2)*nilai2/2;
//            System.out.println(Un);

        System.out.println("===== SELESAI =====");

    }
}
