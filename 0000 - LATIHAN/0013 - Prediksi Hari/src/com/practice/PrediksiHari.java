package com.practice;
import java.util.*;

public class PrediksiHari {

    private static void oneYearNormal(long tanggalKeN, byte inputBulan, long tahun) {
        int     topRange1 = 31, topRange2 = topRange1 + 28, topRange3 = topRange2 + 31,
                topRange4 = topRange3 + 30, topRange5 = topRange4 + 31, topRange6 = topRange5 + 30,
                topRange7 = topRange6 + 31, topRange8 = topRange7 + 31, topRange9 = topRange8 + 30,
                topRange10 = topRange9 + 31, topRange11 = topRange10 + 30, topRange12 = topRange11 + 31;

        if (tanggalKeN >= 1 && tanggalKeN <= topRange1) {
            System.out.println("Hari ke N adalah " + (tanggalKeN)  + " Januari " + tahun);
        } else if (tanggalKeN >= topRange1 && tanggalKeN <= topRange2) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange1) + " Februari " + tahun);
        } else if (tanggalKeN >= topRange2 && tanggalKeN <= topRange3) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange2) + " Maret " + tahun);
        } else if (tanggalKeN >= topRange3 && tanggalKeN <= topRange4) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange3) + " April " + tahun);
        } else if (tanggalKeN >= topRange4 && tanggalKeN <= topRange5) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange4) + " Mei " + tahun);
        } else if (tanggalKeN >= topRange5 && tanggalKeN <= topRange6) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange5) + " Juni " + tahun);
        } else if (tanggalKeN >= topRange6 && tanggalKeN <= topRange7) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange6) + " Juli " + tahun);
        } else if (tanggalKeN >= topRange7 && tanggalKeN <= topRange8) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange7) + " Agustus " + tahun);
        } else if (tanggalKeN >= topRange8 && tanggalKeN <= topRange9) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange8) + " September " + tahun);
        } else if (tanggalKeN >= topRange9 && tanggalKeN <= topRange10) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange9) + " Oktober " + tahun);
        } else if (tanggalKeN >= topRange10 && tanggalKeN <= topRange11) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange10) + " November " + tahun);
        } else if (tanggalKeN >= topRange11 && tanggalKeN <= topRange12) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange11) + " Desember " + tahun);
        }
    }

    private static void presentYear(byte inputTanggal, byte inputBulan, long inputTahun, long hariKeN) {
        long tanggalKeN = inputTanggal + hariKeN;
        int     topRange1 = 31, topRange2 = topRange1 + 28, topRange3 = topRange2 + 31,
                topRange4 = topRange3 + 30, topRange5 = topRange4 + 31, topRange6 = topRange5 + 30,
                topRange7 = topRange6 + 31, topRange8 = topRange7 + 31, topRange9 = topRange8 + 30,
                topRange10 = topRange9 + 31, topRange11 = topRange10 + 30;

        if (inputBulan == 1) {
            oneYearNormal(tanggalKeN,inputBulan,inputTahun);
        } else if (inputBulan == 2) {
            oneYearNormal(tanggalKeN + topRange1,inputBulan,inputTahun);
        } else if (inputBulan == 3) {
            oneYearNormal(tanggalKeN + topRange2,inputBulan,inputTahun);
        } else if (inputBulan == 4) {
            oneYearNormal(tanggalKeN + topRange3,inputBulan,inputTahun);
        } else if (inputBulan == 5) {
            oneYearNormal(tanggalKeN + topRange4,inputBulan,inputTahun);
        } else if (inputBulan == 6) {
            oneYearNormal(tanggalKeN + topRange5,inputBulan,inputTahun);
        } else if (inputBulan == 7) {
            oneYearNormal(tanggalKeN + topRange6,inputBulan,inputTahun);
        } else if (inputBulan == 8) {
            oneYearNormal(tanggalKeN + topRange7,inputBulan,inputTahun);
        } else if (inputBulan == 9) {
            oneYearNormal(tanggalKeN + topRange8,inputBulan,inputTahun);
        } else if (inputBulan == 10) {
            oneYearNormal(tanggalKeN + topRange9,inputBulan,inputTahun);
        } else if (inputBulan == 11) {
            oneYearNormal(tanggalKeN + topRange10,inputBulan,inputTahun);
        } else if (inputBulan == 12) {
            oneYearNormal(tanggalKeN + topRange11,inputBulan,inputTahun);
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        byte tanggal, bulan;
        long hariKeN, tahun;

        System.out.print("Masukan tanggal = ");
        tanggal = userInput.nextByte();
        System.out.print("Masukan bulan = ");
        bulan = userInput.nextByte();
        System.out.print("Masukan tahun = ");
        tahun = userInput.nextLong();
        System.out.print("Masukan hari ke N = ");
        hariKeN = userInput.nextLong();
        presentYear(tanggal, bulan, tahun, hariKeN);






    }
}

//package com.practice;
//import java.util.*;
//
//public class PrediksiHari {
//
//    private static void oneYearNormal(long tanggalKeN, byte inputBulan, long tahun) {
//        int     topRange1 = 31, topRange2 = topRange1 + 28, topRange3 = topRange2 + 31,
//                topRange4 = topRange3 + 30, topRange5 = topRange4 + 31, topRange6 = topRange5 + 30,
//                topRange7 = topRange6 + 31, topRange8 = topRange7 + 31, topRange9 = topRange8 + 30,
//                topRange10 = topRange9 + 31, topRange11 = topRange10 + 30, topRange12 = topRange11 + 31;
//
//        if (tanggalKeN >= 1 && tanggalKeN <= topRange1) {
//            System.out.println("Hari ke N adalah " + (tanggalKeN)  + " Januari " + tahun);
//        } else if (tanggalKeN >= topRange1 && tanggalKeN <= topRange2) {
//            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange1) + " Februari " + tahun);
//        } else if (tanggalKeN >= topRange2 && tanggalKeN <= topRange3) {
//            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange2) + " Maret " + tahun);
//        } else if (tanggalKeN >= topRange3 && tanggalKeN <= topRange4) {
//            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange3) + " April " + tahun);
//        } else if (tanggalKeN >= topRange4 && tanggalKeN <= topRange5) {
//            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange4) + " Mei " + tahun);
//        } else if (tanggalKeN >= topRange5 && tanggalKeN <= topRange6) {
//            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange5) + " Juni " + tahun);
//        } else if (tanggalKeN >= topRange6 && tanggalKeN <= topRange7) {
//            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange6) + " Juli " + tahun);
//        } else if (tanggalKeN >= topRange7 && tanggalKeN <= topRange8) {
//            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange7) + " Agustus " + tahun);
//        } else if (tanggalKeN >= topRange8 && tanggalKeN <= topRange9) {
//            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange8) + " September " + tahun);
//        } else if (tanggalKeN >= topRange9 && tanggalKeN <= topRange10) {
//            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange9) + " Oktober " + tahun);
//        } else if (tanggalKeN >= topRange10 && tanggalKeN <= topRange11) {
//            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange10) + " November " + tahun);
//        } else if (tanggalKeN >= topRange11 && tanggalKeN <= topRange12) {
//            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange11) + " Desember " + tahun);
//        }
//    }
//
//    private static void presentYear(byte inputTanggal, byte inputBulan, long inputTahun, long hariKeN) {
//        long tanggalKeN = inputTanggal + hariKeN;
//        int     topRange1 = 31, topRange2 = topRange1 + 28, topRange3 = topRange2 + 31,
//                topRange4 = topRange3 + 30, topRange5 = topRange4 + 31, topRange6 = topRange5 + 30,
//                topRange7 = topRange6 + 31, topRange8 = topRange7 + 31, topRange9 = topRange8 + 30,
//                topRange10 = topRange9 + 31, topRange11 = topRange10 + 30;
//
//        if (inputBulan == 1) {
//            oneYearNormal(tanggalKeN,inputBulan,inputTahun);
//        } else if (inputBulan == 2) {
//            oneYearNormal(tanggalKeN + topRange1,inputBulan,inputTahun);
//        } else if (inputBulan == 3) {
//            oneYearNormal(tanggalKeN + topRange2,inputBulan,inputTahun);
//        } else if (inputBulan == 4) {
//            oneYearNormal(tanggalKeN + topRange3,inputBulan,inputTahun);
//        } else if (inputBulan == 5) {
//            oneYearNormal(tanggalKeN + topRange4,inputBulan,inputTahun);
//        } else if (inputBulan == 6) {
//            oneYearNormal(tanggalKeN + topRange5,inputBulan,inputTahun);
//        } else if (inputBulan == 7) {
//            oneYearNormal(tanggalKeN + topRange6,inputBulan,inputTahun);
//        } else if (inputBulan == 8) {
//            oneYearNormal(tanggalKeN + topRange7,inputBulan,inputTahun);
//        } else if (inputBulan == 9) {
//            oneYearNormal(tanggalKeN + topRange8,inputBulan,inputTahun);
//        } else if (inputBulan == 10) {
//            oneYearNormal(tanggalKeN + topRange9,inputBulan,inputTahun);
//        } else if (inputBulan == 11) {
//            oneYearNormal(tanggalKeN + topRange10,inputBulan,inputTahun);
//        } else if (inputBulan == 12) {
//            oneYearNormal(tanggalKeN + topRange11,inputBulan,inputTahun);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner userInput = new Scanner(System.in);
//        byte tanggal, bulan;
//        long hariKeN, tahun;
//
//        System.out.print("Masukan tanggal = ");
//        tanggal = userInput.nextByte();
//        System.out.print("Masukan bulan = ");
//        bulan = userInput.nextByte();
//        System.out.print("Masukan tahun = ");
//        tahun = userInput.nextLong();
//        System.out.print("Masukan hari ke N = ");
//        hariKeN = userInput.nextLong();
//        presentYear(tanggal, bulan, tahun, hariKeN);
//
//
//
//
//
//
//    }
//}