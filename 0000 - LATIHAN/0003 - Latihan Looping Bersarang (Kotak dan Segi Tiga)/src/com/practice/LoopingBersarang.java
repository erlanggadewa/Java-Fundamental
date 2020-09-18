package com.practice;

public class LoopingBersarang {
    public static void main(String[] args) {

        //KOTAK
        for (int a = 1; a <= 7; a++) {
            System.out.print("loop ke " + a + "      ");
            for (int b = 1; b <= 7; b++) {
                System.out.print("*  ");
            }
            System.out.print("\n");
        }
        System.out.println(); //new line

        //SEGI TIGA SIKU (1)
        int a = 1;

        while (a <= 7) { //menggunakan while atau for tidak berpengaruh karena tidak ada break yg bisa skip perubahan data
            System.out.print("loop ke " + a + "      ");
            for (int b = 1; b <= 7; ) {   //Menggunakan for karena for mereset nilai kembali ke 1 tidak meneruskan perubahan
                System.out.print("*  ");
                if (a == b) {
                    break;
                }
                ++b;
            }
            ++a;
            System.out.print("\n");
        }
        System.out.println(); // new line

        //SEGI TIGA SIKU (2)
        for (int c = 1; c <= 7; c++) {
            System.out.print("loop ke " + c + "      ");
            for (int d = 7; d >= 1; d--){
                System.out.print("*  ");
                if (c == d){
                    break;
                }
            }
            System.out.println(); // new line
        }
        System.out.println(); //new line

        //SEGI TIGA SAMA KAKI
        for (int e = 1; e <= 13; e++) {
            if (e <= 9){
                System.out.print("loop ke " + e + "      ");
            }  else {
                System.out.print("loop ke " + e + "     ");
            }
            if (e <= 7) {
                for (int f = 1; f <= 7; f++) {
                    System.out.print("*  ");
                    if (e == f) {
                        break;
                    }
                }
            } else {
                for (int g = 13; g >= 8; g--) {
                    System.out.print("*  ");
                    if (g == e) {
                        break;
                    }
                }
            }
            System.out.println();
        }
        System.out.println();//new line


        // WAJIK
        for (int loop1 = 1; loop1 <= 7; loop1++ ) { //loop ke 1 - 7
            if (loop1 <= 9) {
                System.out.print("loop ke " + loop1 + "      ");
            } else {
                System.out.print("loop ke " + loop1 + "     ");
            }
            for (int angka = 1; angka <= 7; angka++) { //ruang kosong kiri atas
                if (loop1 + angka == 8 || loop1 == 7) {
                    break;
                }
                System.out.print("1  ");
            }
            for (int bintang = 1; bintang <= loop1; bintang++) { //kiri atas
                System.out.print("*  ");
            }
            for (int angka = 8; angka <= 13; angka++) { //kanan atas
                if (loop1 + 7 == angka || loop1 == 1) {
                    break;
                }
                System.out.print("*  ");
            }
            for (int angka = 13; angka >= 8; angka--){ //ruang kosong kanan atas
                if (loop1 + 6 == angka){
                    break;
                }
                System.out.print("2  ");
            }
            System.out.print("\n"); //enter loop
        }
        for (int loop2 = 8; loop2 <= 13; loop2++ ) { //loop ke 8 - 13
            if (loop2 <= 9) {
                System.out.print("loop ke " + loop2 + "      ");
            } else {
                System.out.print("loop ke " + loop2 + "     ");
            }
            for (int angka = 1; angka <= 6; angka++){
                System.out.print("3  ");
                if (angka + 7 == loop2){
                    break;
                }
            }
            for (int bintang = 6; bintang >=1; bintang--){
                System.out.print("*  ");
                if (bintang + 7 == loop2){
                    break;
                }
            }
            for (int bintang = 1; bintang <= 6; bintang++){
                if (bintang + loop2 == 14){
                    break;
                }
                System.out.print("*  ");
            }
            for (int angka = 6; angka >= 1; angka--){
                System.out.print("4  ");
                if (loop2 + angka == 14){
                    break;
                }
            }
            System.out.print("\n"); //enter loop
        }




    }
}
