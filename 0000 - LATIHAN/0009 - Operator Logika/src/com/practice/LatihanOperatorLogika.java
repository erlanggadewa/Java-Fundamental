package com.tutorial;
import java.util.Scanner;

public class LatihanOperatorLogika {
    public static void main (String[] args){

        boolean StatusTebakan;
        float NilaiTebakan;
        Scanner inputAngga = new Scanner(System.in);

        System.out.print("Masukan angka antara 4 dan 7 : ");
        NilaiTebakan = inputAngga.nextFloat();
        StatusTebakan = (NilaiTebakan > 4 && NilaiTebakan < 7);
        System.out.println("Nilai yang anda masukan adalah = " + StatusTebakan);


    }
}
