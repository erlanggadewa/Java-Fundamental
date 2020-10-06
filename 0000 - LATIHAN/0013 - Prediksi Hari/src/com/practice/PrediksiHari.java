package com.practice;
import java.util.*;

public class PrediksiHari {

    private static void oneYearNormal(long tanggalKeN, long tahun) {
        int     topRange1 = 31, topRange2 = topRange1 + 28, topRange3 = topRange2 + 31,
        topRange4 = topRange3 + 30, topRange5 = topRange4 + 31, topRange6 = topRange5 + 30,
        topRange7 = topRange6 + 31, topRange8 = topRange7 + 31, topRange9 = topRange8 + 30,
        topRange10 = topRange9 + 31, topRange11 = topRange10 + 30, topRange12 = topRange11 + 31;

        if (tanggalKeN >= 1 && tanggalKeN <= topRange1) {
            System.out.println("Hari ke N adalah " + (tanggalKeN)  + " Januari " + tahun);
        } else if (tanggalKeN > topRange1 && tanggalKeN <= topRange2) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange1) + " Februari " + tahun);
        } else if (tanggalKeN > topRange2 && tanggalKeN <= topRange3) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange2) + " Maret " + tahun);
        } else if (tanggalKeN > topRange3 && tanggalKeN <= topRange4) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange3) + " April " + tahun);
        } else if (tanggalKeN > topRange4 && tanggalKeN <= topRange5) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange4) + " Mei " + tahun);
        } else if (tanggalKeN > topRange5 && tanggalKeN <= topRange6) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange5) + " Juni " + tahun);
        } else if (tanggalKeN > topRange6 && tanggalKeN <= topRange7) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange6) + " Juli " + tahun);
        } else if (tanggalKeN > topRange7 && tanggalKeN <= topRange8) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange7) + " Agustus " + tahun);
        } else if (tanggalKeN > topRange8 && tanggalKeN <= topRange9) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange8) + " September " + tahun);
        } else if (tanggalKeN > topRange9 && tanggalKeN <= topRange10) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange9) + " Oktober " + tahun);
        } else if (tanggalKeN > topRange10 && tanggalKeN <= topRange11) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange10) + " November " + tahun);
        } else if (tanggalKeN > topRange11 && tanggalKeN <= topRange12) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange11) + " Desember " + tahun);
        } else if ((tanggalKeN > topRange12) && ((tahun + 1) % 400 == 0)) {
            tanggalKeN -= topRange12;
            tahun += 1;
            // System.out.println("CP 1 " + tahun);
            oneYearKabisat(tanggalKeN, tahun);
        } else if ((tanggalKeN > topRange12) && (((tahun + 1) % 400 != 0) && ((tahun + 1) % 100 == 0))) {
            tanggalKeN -= topRange12;
            tahun += 1;
            // System.out.println("CP 2 " + tahun);
            oneYearNormal(tanggalKeN, tahun);
        } else if ((tanggalKeN > topRange12) && (((tahun + 1) % 400 != 0) && ((tahun + 1) % 100 != 0) && ((tahun + 1) % 4 == 0))){
            tanggalKeN -= topRange12;
            tahun+= 1;
            // System.out.println("CP 3 " + tahun);
            oneYearKabisat(tanggalKeN,tahun);
        } else if ((tanggalKeN > topRange12) && (((tahun + 1) % 400 != 0) && ((tahun + 1) % 100 != 0) && ((tahun + 1) % 4 != 0))) {
            tanggalKeN -= topRange12;
            tahun += 1;
            // System.out.println("CP 4 " + tahun);
            oneYearNormal(tanggalKeN, tahun);
        } else {
            System.out.println(tahun);
            System.out.println("ERROR 1");
        }
    }

    private static void oneYearKabisat(long tanggalKeN, long tahun) {
        int     topRange1 = 31, topRange2 = topRange1 + 29, topRange3 = topRange2 + 31,
        topRange4 = topRange3 + 30, topRange5 = topRange4 + 31, topRange6 = topRange5 + 30,
        topRange7 = topRange6 + 31, topRange8 = topRange7 + 31, topRange9 = topRange8 + 30,
        topRange10 = topRange9 + 31, topRange11 = topRange10 + 30, topRange12 = topRange11 + 31;

        if (tanggalKeN >= 1 && tanggalKeN <= topRange1) {
            System.out.println("Hari ke N adalah " + (tanggalKeN)  + " Januari " + tahun);
        } else if (tanggalKeN > topRange1 && tanggalKeN <= topRange2) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange1) + " Februari " + tahun);
        } else if (tanggalKeN > topRange2 && tanggalKeN <= topRange3) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange2) + " Maret " + tahun);
        } else if (tanggalKeN > topRange3 && tanggalKeN <= topRange4) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange3) + " April " + tahun);
        } else if (tanggalKeN > topRange4 && tanggalKeN <= topRange5) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange4) + " Mei " + tahun);
        } else if (tanggalKeN > topRange5 && tanggalKeN <= topRange6) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange5) + " Juni " + tahun);
        } else if (tanggalKeN > topRange6 && tanggalKeN <= topRange7) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange6) + " Juli " + tahun);
        } else if (tanggalKeN > topRange7 && tanggalKeN <= topRange8) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange7) + " Agustus " + tahun);
        } else if (tanggalKeN > topRange8 && tanggalKeN <= topRange9) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange8) + " September " + tahun);
        } else if (tanggalKeN > topRange9 && tanggalKeN <= topRange10) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange9) + " Oktober " + tahun);
        } else if (tanggalKeN > topRange10 && tanggalKeN <= topRange11) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange10) + " November " + tahun);
        } else if (tanggalKeN > topRange11 && tanggalKeN <= topRange12) {
            System.out.println("Hari ke N adalah " + (tanggalKeN - topRange11) + " Desember " + tahun);
        } else if ((tanggalKeN > topRange12) && ((tahun + 1) % 400 == 0)) {
            tanggalKeN -= topRange12;
            tahun += 1;
            // System.out.println("CP 5 " + tahun);
            oneYearKabisat(tanggalKeN, tahun);
        } else if ((tanggalKeN > topRange12) && (((tahun + 1) % 400 != 0) && ((tahun + 1) % 100 == 0))) {
            tanggalKeN -= topRange12;
            tahun += 1;
            // System.out.println("CP 6 " + tahun);
            oneYearNormal(tanggalKeN, tahun);
        } else if ((tanggalKeN > topRange12) && (((tahun + 1) % 400 != 0) && ((tahun + 1) % 100 != 0) && ((tahun + 1) % 4 == 0))){
            tanggalKeN -= topRange12;
            tahun+= 1;
            // System.out.println("CP 7 " + tahun);
            oneYearKabisat(tanggalKeN,tahun);
        } else if ((tanggalKeN > topRange12) && (((tahun + 1) % 400 != 0) && ((tahun + 1) % 100 != 0) && ((tahun + 1) % 4 != 0))) {
            tanggalKeN -= topRange12;
            tahun += 1;
            // System.out.println("CP 8 " + tahun);
            oneYearNormal(tanggalKeN, tahun);
        } else {
            System.out.println(tahun);
            System.out.println("ERROR 2");
        }
    }

    private static void presentYear(byte inputTanggal, byte inputBulan, long inputTahun, long hariKeN) {
        long tanggalKeN = inputTanggal + hariKeN;

//      TAHUN KABISAT
        if ((inputTahun % 400 == 0) && ((inputTahun % 400 != 0) && (inputTahun % 100 != 0) || (inputTahun % 4 == 0) )) {

            int topRange1 = 31, topRange2 = topRange1 + 29, topRange3 = topRange2 + 31,
            topRange4 = topRange3 + 30, topRange5 = topRange4 + 31, topRange6 = topRange5 + 30,
            topRange7 = topRange6 + 31, topRange8 = topRange7 + 31, topRange9 = topRange8 + 30,
            topRange10 = topRange9 + 31, topRange11 = topRange10 + 30;

            if (inputBulan == 1) {
                oneYearKabisat(tanggalKeN, inputTahun);
            } else if (inputBulan == 2) {
                oneYearKabisat(tanggalKeN + topRange1, inputTahun);
            } else if (inputBulan == 3) {
                oneYearKabisat(tanggalKeN + topRange2, inputTahun);
            } else if (inputBulan == 4) {
                oneYearKabisat(tanggalKeN + topRange3, inputTahun);
            } else if (inputBulan == 5) {
                oneYearKabisat(tanggalKeN + topRange4, inputTahun);
            } else if (inputBulan == 6) {
                oneYearKabisat(tanggalKeN + topRange5, inputTahun);
            } else if (inputBulan == 7) {
                oneYearKabisat(tanggalKeN + topRange6, inputTahun);
            } else if (inputBulan == 8) {
                oneYearKabisat(tanggalKeN + topRange7, inputTahun);
            } else if (inputBulan == 9) {
                oneYearKabisat(tanggalKeN + topRange8, inputTahun);
            } else if (inputBulan == 10) {
                oneYearKabisat(tanggalKeN + topRange9, inputTahun);
            } else if (inputBulan == 11) {
                oneYearKabisat(tanggalKeN + topRange10, inputTahun);
            } else if (inputBulan == 12) {
                oneYearKabisat(tanggalKeN + topRange11, inputTahun);
            }

//      TAHUN NORMAL
        } else {

            int     topRange1 = 31, topRange2 = topRange1 + 28, topRange3 = topRange2 + 31,
            topRange4 = topRange3 + 30, topRange5 = topRange4 + 31, topRange6 = topRange5 + 30,
            topRange7 = topRange6 + 31, topRange8 = topRange7 + 31, topRange9 = topRange8 + 30,
            topRange10 = topRange9 + 31, topRange11 = topRange10 + 30;

            if (inputBulan == 1) {
                oneYearNormal(tanggalKeN,inputTahun);
            } else if (inputBulan == 2) {
                oneYearNormal(tanggalKeN + topRange1,inputTahun);
            } else if (inputBulan == 3) {
                oneYearNormal(tanggalKeN + topRange2,inputTahun);
            } else if (inputBulan == 4) {
                oneYearNormal(tanggalKeN + topRange3,inputTahun);
            } else if (inputBulan == 5) {
                oneYearNormal(tanggalKeN + topRange4,inputTahun);
            } else if (inputBulan == 6) {
                oneYearNormal(tanggalKeN + topRange5,inputTahun);
            } else if (inputBulan == 7) {
                oneYearNormal(tanggalKeN + topRange6,inputTahun);
            } else if (inputBulan == 8) {
                oneYearNormal(tanggalKeN + topRange7,inputTahun);
            } else if (inputBulan == 9) {
                oneYearNormal(tanggalKeN + topRange8,inputTahun);
            } else if (inputBulan == 10) {
                oneYearNormal(tanggalKeN + topRange9,inputTahun);
            } else if (inputBulan == 11) {
                oneYearNormal(tanggalKeN + topRange10,inputTahun);
            } else if (inputBulan == 12) {
                oneYearNormal(tanggalKeN + topRange11,inputTahun);
            }
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