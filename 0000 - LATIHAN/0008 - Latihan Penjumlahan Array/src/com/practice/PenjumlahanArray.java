package com.practice;

import java.util.*;

public class PenjumlahanArray {

    public static void main(String[] args) {

        int[] arrayInput1 = new int[] { 1, 2, 3, 4 };
        int[] arrayInput2 = new int[] { 11, 12, 13, 14, 15, 16 };

        System.out.println("Array pertama     = " + Arrays.toString(arrayInput1));
        System.out.println("Array kedua       = " + Arrays.toString(arrayInput2));
        System.out.println("Hasil Penjumlahan = " + Arrays.toString(penjumlahanArray(arrayInput1, arrayInput2)));

    }

    private static int[] penjumlahanArray(int[] arrayAngka1, int[] arrayAngka2) {

        int[] arrayHasil;
        int[] arrayTumbal;

        if (arrayAngka1.length >= arrayAngka2.length) { // ketika arrayinput1 lebih panjang daripada arrayinput2
            arrayHasil = new int[arrayAngka1.length]; // mengcisi panjang arrayhasil dengan panjang arrayangka2
            arrayTumbal = Arrays.copyOf(arrayAngka2, arrayAngka1.length); // mengisi arraytumbal dengan arrayangka2 dan
            // menggunakan panjang arrayangka1

            for (int index = 0; index < arrayAngka1.length; index++) {
                arrayHasil[index] = arrayAngka1[index] + arrayTumbal[index]; // penjumlahan array
            }
        } else { // ketika arrayinput2 lebih panjang dari arrayinput1
            arrayHasil = new int[arrayAngka2.length]; // mengisi panjang arrayhasil dengan panjang arrayangka2
            arrayTumbal = Arrays.copyOf(arrayAngka1, arrayAngka2.length); // mengcopy arrayangka1 ke tumbal dengan
            // panjang arrayangka2

            for (int index = 0; index < arrayAngka2.length; index++) {
                arrayHasil[index] = arrayTumbal[index] + arrayAngka2[index]; // penjumlahan array
            }
        }
        return arrayHasil;

    }

}
