package com.practice;

import java.util.Scanner;

public class PrediksiHari {
    public static String menentukanBulan(byte bulanKe){
        if (bulanKe == 1){
            String bulan;
            bulan = "Januari";
            return bulan;
        } else if (bulanKe == 2) {
            String bulan;
            bulan = "Februari";
            return bulan;
        } else if (bulanKe == 3) {
            String bulan;
            bulan = "Maret";
            return bulan;
        } else if (bulanKe == 4) {
            String bulan;
            bulan = "April";
            return bulan;
        } else if (bulanKe == 5) {
            String bulan;
            bulan = "Mei";
            return bulan;
        } else if (bulanKe == 6) {
            String bulan;
            bulan = "Juni";
            return bulan;
        } else if (bulanKe == 7) {
            String bulan;
            bulan = "Juli";
            return bulan;
        } else if (bulanKe == 8) {
            String bulan;
            bulan = "Agustus";
            return bulan;
        } else if (bulanKe == 9) {
            String bulan;
            bulan = "September";
            return bulan;
        } else if (bulanKe == 10) {
            String bulan;
            bulan = "Oktober";
            return bulan;
        } else if (bulanKe == 11) {
            String bulan;
            bulan = "November";
            return bulan;
        } else if (bulanKe == 12) {
            String bulan;
            bulan = "Desember";
            return bulan;
        }
        return "Maaf input bulan anda salah";

    }

    // DENGAN ASUSMSI DIMULAI DARI TANGGAL 00 JANUARI
    public static void oneYearNormal (int tanggalKeN, int tahun) {
        if ((tanggalKeN > 0) && (tanggalKeN <= 31) && (tahun % 4 != 0)) {
            System.out.println("Hari ke N adalah " + tanggalKeN + " Januari " + tahun);
        } else if ((tanggalKeN > 31) && (tanggalKeN <= 59) && (tahun % 4 != 0)) {
            tanggalKeN = tanggalKeN % 31;
            System.out.println("Hari ke N adalah " + tanggalKeN + " Februari " + tahun);
        } else if ((tanggalKeN > 59) && (tanggalKeN <= 90) && (tahun % 4 != 0)) {
            tanggalKeN = tanggalKeN % 59;
            System.out.println("Hari ke N adalah " + tanggalKeN + " Maret " + tahun);
        } else if ((tanggalKeN > 90) && (tanggalKeN <= 120) && (tahun % 4 != 0)) {
            tanggalKeN = tanggalKeN % 90;
            System.out.println("Hari ke N adalah " + tanggalKeN + " April " + tahun);
        } else if ((tanggalKeN > 120) && (tanggalKeN <= 151) && (tahun % 4 != 0)) {
            tanggalKeN = tanggalKeN % 120;
            System.out.println("Hari ke N adalah " + tanggalKeN + " Mei " + tahun);
        } else if ((tanggalKeN > 151) && (tanggalKeN <= 181) && (tahun % 4 != 0)) {
            tanggalKeN = tanggalKeN % 151;
            System.out.println("Hari ke N adalah " + tanggalKeN + " Juni " + tahun);
        } else if ((tanggalKeN > 181) && (tanggalKeN <= 212) && (tahun % 4 != 0)) {
            tanggalKeN = tanggalKeN % 181;
            System.out.println("Hari ke N adalah " + tanggalKeN + " Juli " + tahun);
        } else if ((tanggalKeN > 212) && (tanggalKeN <= 243) && (tahun % 4 != 0)) {
            tanggalKeN = tanggalKeN % 212;
            System.out.println("Hari ke N adalah " + tanggalKeN + " Agustus " + tahun);
        } else if ((tanggalKeN > 243) && (tanggalKeN <= 273) && (tahun % 4 != 0)) {
            tanggalKeN = tanggalKeN % 243;
            System.out.println("Hari ke N adalah " + tanggalKeN + " September " + tahun);
        } else if ((tanggalKeN > 273) && (tanggalKeN <= 304) && (tahun % 4 != 0)) {
            tanggalKeN = tanggalKeN % 273;
            System.out.println("Hari ke N adalah " + tanggalKeN + " Oktober " + tahun);
        } else if ((tanggalKeN > 304) && (tanggalKeN <= 334) && (tahun % 4 != 0)) {
            tanggalKeN = tanggalKeN % 304;
            System.out.println("Hari ke N adalah " + tanggalKeN + " November " + tahun);
        } else if ((tanggalKeN > 334) && (tanggalKeN <= 365) && (tahun % 4 != 0)) {
            tanggalKeN = tanggalKeN % 334;
            System.out.println("Hari ke N adalah " + tanggalKeN + " Desember " + tahun);
        } else if ((tanggalKeN > 365) && (tahun % 4 != 0) && (tahun + 1 % 4 != 0)){
            tanggalKeN = tanggalKeN - 365;
            System.out.println("CP NORMAL 1 " + (tahun));
            oneYearNormal(tanggalKeN, ++tahun);
        } else if (tanggalKeN > 366){
            tanggalKeN = tanggalKeN - 366;
            System.out.println("CP KABISAT 1 " + (tahun));
            oneYearKabisat(tanggalKeN, ++tahun);
        } else if (tahun % 4 == 0){
            System.out.println(tanggalKeN);
            System.out.println("CP NORMAL 2 " + (tahun));
            oneYearKabisat(tanggalKeN, ++tahun);
        } else {
            System.out.println("ERROR NORMAL");
        }
    }

    // DENGAN ASUSMSI DIMULAI DARI TANGGAL 00 JANUARI
    public static void oneYearKabisat (int tanggalKeN, int tahun){
        if ((tanggalKeN > 0) && (tanggalKeN <= 31)) {
            System.out.println("Hari ke N adalah " + tanggalKeN + " Januari " + tahun);
        } else if ((tanggalKeN > 31) && (tanggalKeN <= 60)) {
            tanggalKeN = tanggalKeN % 31;
            System.out.println("Hari ke N adalah " + tanggalKeN + " Februari " + tahun);
        } else if ((tanggalKeN > 60) && (tanggalKeN <= 91)) {
            tanggalKeN = tanggalKeN % 60;
            System.out.println("Hari ke N adalah " + tanggalKeN + " Maret " + tahun);
        } else if ((tanggalKeN > 91) && (tanggalKeN <= 121)) {
            tanggalKeN = tanggalKeN % 91;
            System.out.println("Hari ke N adalah " + tanggalKeN + " April " + tahun);
        } else if ((tanggalKeN > 121) && (tanggalKeN <= 152)) {
            tanggalKeN = tanggalKeN % 121;
            System.out.println("Hari ke N adalah " + tanggalKeN + " Mei " + tahun);
        } else if ((tanggalKeN > 152) && (tanggalKeN <= 182)) {
            tanggalKeN = tanggalKeN % 152;
            System.out.println("Hari ke N adalah " + tanggalKeN + " Juni " + tahun);
        } else if ((tanggalKeN > 182) && (tanggalKeN <= 213)) {
            tanggalKeN = tanggalKeN % 182;
            System.out.println("Hari ke N adalah " + tanggalKeN + " Juli " + tahun);
        } else if ((tanggalKeN > 213) && (tanggalKeN <= 244)) {
            tanggalKeN = tanggalKeN % 213;
            System.out.println("Hari ke N adalah " + tanggalKeN + " Agustus " + tahun);
        } else if ((tanggalKeN > 244) && (tanggalKeN <= 274)) {
            tanggalKeN = tanggalKeN % 244;
            System.out.println("Hari ke N adalah " + tanggalKeN + " September " + tahun);
        } else if ((tanggalKeN > 274) && (tanggalKeN <= 305)) {
            tanggalKeN = tanggalKeN % 274;
            System.out.println("Hari ke N adalah " + tanggalKeN + " Oktober " + tahun);
        } else if ((tanggalKeN > 305) && (tanggalKeN <= 335)) {
            tanggalKeN = tanggalKeN % 305;
            System.out.println("Hari ke N adalah " + tanggalKeN + " November " + tahun);
        } else if ((tanggalKeN > 335) && (tanggalKeN <= 366)) {
            tanggalKeN = tanggalKeN % 335;
            System.out.println("Hari ke N adalah " + tanggalKeN + " Desember " + tahun);
        } else if ((tanggalKeN > 366)){
            tanggalKeN = tanggalKeN - 366;
            System.out.println("CP NORMAL 3 " + (tahun));
            oneYearNormal (tanggalKeN, ++tahun);
        } else {
            System.out.println("ERROR KABISAT");
        }
    }

    //UNTUK TAHUN SEKARANG
    public static void presentYear(int tanggalKeN, int tahun, int bulanKeN, int tanggal ) {
        // ditambah 31, 60, 91 dst. berguna agar bisa menyesuaikan dengan fungsi oneYearKabisat
        if (tahun % 4 == 0) {
            if (bulanKeN == 1) {
                int tanggalFinal = tanggalKeN + tanggal;
                oneYearKabisat(tanggalFinal, tahun);
            } else if (bulanKeN == 2) {
                int tanggalFinal = (tanggalKeN + tanggal) + 31;
                oneYearKabisat(tanggalFinal, tahun);
            } else if (bulanKeN == 3) {
                int tanggalFinal = (tanggalKeN + tanggal) + 60;
                oneYearKabisat(tanggalFinal, tahun);
            } else if (bulanKeN == 4) {
                int tanggalFinal = (tanggalKeN + tanggal) + 91;
                oneYearKabisat(tanggalFinal, tahun);
            } else if (bulanKeN == 5) {
                int tanggalFinal = (tanggalKeN + tanggal) + 121;
                oneYearKabisat(tanggalFinal, tahun);
            } else if (bulanKeN == 6) {
                int tanggalFinal = (tanggalKeN + tanggal) + 152;
                oneYearKabisat(tanggalFinal, tahun);
            } else if (bulanKeN == 7) {
                int tanggalFinal = (tanggalKeN + tanggal) + 182;
                oneYearKabisat(tanggalFinal, tahun);
            } else if (bulanKeN == 8) {
                int tanggalFinal = (tanggalKeN + tanggal) + 213;
                oneYearKabisat(tanggalFinal, tahun);
            } else if (bulanKeN == 9) {
                int tanggalFinal = (tanggalKeN + tanggal) + 244;
                oneYearKabisat(tanggalFinal, tahun);
            } else if (bulanKeN == 10) {
                int tanggalFinal = (tanggalKeN + tanggal) + 274;
                oneYearKabisat(tanggalFinal, tahun);
            } else if (bulanKeN == 11) {
                int tanggalFinal = (tanggalKeN + tanggal) + 305;
                oneYearKabisat(tanggalFinal, tahun);
            } else if (bulanKeN == 12) {
                int tanggalFinal = (tanggalKeN + tanggal) + 335;
                oneYearKabisat(tanggalFinal, tahun);
            }
        } else {
            if (bulanKeN == 1) {
                int tanggalFinal = tanggalKeN + tanggal;
                oneYearNormal(tanggalFinal, tahun);
            } else if (bulanKeN == 2) {
                int tanggalFinal = (tanggalKeN + tanggal) + 31;
                oneYearNormal(tanggalFinal, tahun);
            } else if (bulanKeN == 3) {
                int tanggalFinal = (tanggalKeN + tanggal) + 59;
                oneYearNormal(tanggalFinal, tahun);
            } else if (bulanKeN == 4) {
                int tanggalFinal = (tanggalKeN + tanggal) + 90;
                oneYearNormal(tanggalFinal, tahun);
            } else if (bulanKeN == 5) {
                int tanggalFinal = (tanggalKeN + tanggal) + 120;
                oneYearNormal(tanggalFinal, tahun);
            } else if (bulanKeN == 6) {
                int tanggalFinal = (tanggalKeN + tanggal) + 151;
                oneYearNormal(tanggalFinal, tahun);
            } else if (bulanKeN == 7) {
                int tanggalFinal = (tanggalKeN + tanggal) + 181;
                oneYearNormal(tanggalFinal, tahun);
            } else if (bulanKeN == 8) {
                int tanggalFinal = (tanggalKeN + tanggal) + 212;
                oneYearNormal(tanggalFinal, tahun);
            } else if (bulanKeN == 9) {
                int tanggalFinal = (tanggalKeN + tanggal) + 243;
                oneYearNormal(tanggalFinal, tahun);
            } else if (bulanKeN == 10) {
                int tanggalFinal = (tanggalKeN + tanggal) + 273;
                oneYearNormal(tanggalFinal, tahun);
            } else if (bulanKeN == 11) {
                int tanggalFinal = (tanggalKeN + tanggal) + 304;
                oneYearNormal(tanggalFinal, tahun);
            } else if (bulanKeN == 12) {
                int tanggalFinal = (tanggalKeN + tanggal) + 334;
                oneYearNormal(tanggalFinal, tahun);
            }
        }
    }
    public static void main(String[] args) {
        byte tanggal, bulanKeN, tanggalSisa;
        int tahun, hariKeN;
        String bulan;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukan tanggal = ");
        tanggal = userInput.nextByte();
        System.out.print("Masukan bulan-Ke = ");
        bulanKeN = userInput.nextByte();
        System.out.print("Masukan tahun = ");
        tahun = userInput.nextInt();
        System.out.print("Masukan jumlah hari kedepan = ");
        hariKeN = userInput.nextInt();
        
        bulan = menentukanBulan(bulanKeN);

        // SOAL 4 A B C TANGGAL 28 BULAN FEBRUARI
        if ((bulanKeN == 2) && (tanggal >= 1 && tanggal <= 28) && (tahun % 4 != 0)){
            // JAWABAN 4A
            byte jumlahHari = 28;
            System.out.println("Jumlah hari pada bulan " + bulan + " sebanyak " + jumlahHari + " hari");
            // -----------------------------------

            // JAWABAN 4B
            System.out.println("Hari ini tanggal " + tanggal + " " + bulan + " tahun " + tahun);
            // -----------------------------------------

            // JAWABAN 4C
            if ((tanggal == 28)){
                bulanKeN = (byte)(bulanKeN + 1);
                bulan = menentukanBulan(bulanKeN);
                tanggalSisa = 1;
            } else {
                tanggalSisa = (byte) (tanggal + 1);
            }
            System.out.println("Besok tanggal " + tanggalSisa + " " + bulan + " tahun " + tahun);
            // ---------------------------

        // SOAL 4 A B C TANGGAL 29 BULAN FEBRUARI
        } else if ((bulanKeN == 2) && (tanggal >= 1 && tanggal <= 29) && (tahun % 4 == 0)){
            // JAWABAN 4A
            byte jumlahHari = 29;
            System.out.println("Jumlah hari pada bulan " + bulan + " sebanyak " + jumlahHari + " hari");
            // -----------------------------------

            // JAWABAN 4B
            System.out.println("Hari ini tanggal " + tanggal + " " + bulan + " tahun " + tahun);
            // -----------------------------------------

            // JAWABAN 4C
            bulanKeN = (byte)(bulanKeN + 1);
            bulan = menentukanBulan(bulanKeN);
            tanggalSisa = 1;
            System.out.println("Besok tanggal " + tanggalSisa + " " + bulan + " tahun " + tahun);
            // ---------------------------

        // SOAL 4 A B C TANGGAL 30 BULAN FEBRUARI
        } else if ((bulanKeN == 4 || bulanKeN == 6 || bulanKeN == 9 || bulanKeN == 11) && (tanggal >= 1 && tanggal <= 30)){
            // JAWABAN 4A
            byte jumlahHari = 30;
            System.out.println("Jumlah hari pada bulan " + bulan + " sebanyak " + jumlahHari + " hari");
            // -----------------------------------

            // JAWABAN 4B
            System.out.println("Hari ini tanggal " + tanggal + " " + bulan + " tahun " + tahun);
            // -----------------------------------------

            // JAWABAN 4C
            if (tanggal == 30){
                bulanKeN = (byte)(bulanKeN + 1);
                bulan = menentukanBulan(bulanKeN);
                tanggalSisa = 1;
            } else {
                tanggalSisa = (byte) (tanggal + 1);
            }
            System.out.println("Besok tanggal " + tanggalSisa + " " + bulan + " tahun " + tahun);
            // ---------------------------

        // JAWABAN 4 A B C UNTUK TANGGAL 31
        } else if ((bulanKeN == 1 || bulanKeN == 3 || bulanKeN == 5 || bulanKeN == 7 || bulanKeN == 8 || bulanKeN == 10 || bulanKeN == 12) && (tanggal >= 1 && tanggal <= 31)){
            // JAWABAN 4A
            byte jumlahHari = 31;
            System.out.println("Jumlah hari pada bulan " + bulan + " sebanyak " + jumlahHari + " hari");
            // --------------------------------------------------------

            // JAWABAN 4B
            System.out.println("Hari ini tanggal " + tanggal + " " + bulan + " tahun " + tahun);
            // --------------------------------------------------------

            // JAWABAN 4C
            if (tanggal == 31){
                bulanKeN = (byte)(bulanKeN + 1);
                bulan = menentukanBulan(bulanKeN);
                tanggalSisa = 1;
                System.out.println("Besok tanggal " + tanggalSisa + " " + bulan + " tahun " + tahun);
            }   else {
                System.out.println("Besok tanggal " + (tanggal + 1) + " " + bulan + " tahun " + tahun);
            }
            // -------------------------------
        } else {
            System.out.println("Input tahun / hari / bulan anda salah");
        }
        presentYear(hariKeN,tahun,bulanKeN,tanggal);


    }
}

