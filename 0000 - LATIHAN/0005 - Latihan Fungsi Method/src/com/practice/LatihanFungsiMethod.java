package com.practice;
import java.util.Scanner;

public class LatihanFungsiMethod {

    public static void main (String[] args){

        Scanner inputAngga = new Scanner(System.in);
        int inputPanjang, inputLebar;

        System.out.print("Masukan alas = ");
        inputPanjang = inputAngga.nextInt();
        System.out.print("Masukan tinggi = ");
        inputLebar = inputAngga.nextInt();

        gambar(inputPanjang, inputLebar);

        KelilingDanLuas(inputPanjang, inputLebar);


    }

    private static void gambar (int panjang, int lebar) {

        for (int koor_y = 1; koor_y <= lebar; koor_y++) {
            for (int koor_x = 1; koor_x <= panjang; koor_x++) {
                System.out.print("*  ");
            }
            System.out.print("\n");
        }

    }

    public static void KelilingDanLuas (int panjang, int lebar){

        int luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        int keliling = 2 * (panjang + lebar);
        System.out.println("Keliling = " + keliling );


    }



}

