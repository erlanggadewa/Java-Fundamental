package com.tutorial;

public class OverloadMethod {
    public static void main(String[] args) {

        //Overload = menggunakan nama method yang sama tetapi untuk argumen yang berbeda
        //Contoh overload dalam IDE IntelliJ adalah System.out.println(); yang akan otomatis mendetect int, float, char, dll.

        printAngka(10);
        printAngka(0.2f);
        printAngka(13d);

        System.out.println("Jumlah = " + jumlahAngka(10,12,13));
        System.out.println("Jumlah = " + jumlahAngka(10,2.4f,2.6));

    }

    private static void printAngka(int angka) {
        System.out.println("Angka ini bertipe integer dan bernilai = " + angka);
    }

    private static void printAngka(float angka) { // terpakai jika kita input angka+f (10f atau 0.2f)
        System.out.println("Angka ini bertipe float dan bernilai = " + angka);
    }

    private static void printAngka(double angka) { // terpakai jika kita hanya input angka koma (0.2) atau kita input angka+d (12d)
        System.out.println("Angka ini bertipe double dan bernilai = " + angka);
    }

    private static void printAngka(short angka) { //tidak akan terpakai karena ada integer dengan memori lebih besar
        System.out.println("Angka ini bertipe short dan bernilai = " + angka);
    }

    private static int jumlahAngka(int angka1, int angka2, int angka3) {
        return angka1 + angka2 + angka3;
    }

    private static double jumlahAngka(int angka1, float angka2, double angka3) {
        return angka1 + angka2 + angka3;
    }

}















































