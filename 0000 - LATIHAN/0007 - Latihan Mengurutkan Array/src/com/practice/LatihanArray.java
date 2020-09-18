package com.practice;
import java.util.*;

public class LatihanArray {

    public static void main(String[] args) {


        int[] arrayAngka1 = new int[]{123, 324, 532, 23, 776, 100};
        int[] arrayAngkaHasil = new int[arrayAngka1.length];
        int[] arrayAngkaHasil2 = new int[arrayAngka1.length];
        int simpanan;

        System.out.print("\nArray yang kalian input = ");
        System.out.println(Arrays.toString(arrayAngka1));

        Arrays.sort(arrayAngka1); //sorting arrayAngka1

        System.out.print("Array yang sudah diurutkan cara 1 = ");
        System.out.println(Arrays.toString(arrayAngka1));




        // CARA PERTAMA
        for (int index = 0; index < arrayAngka1.length; index++){
            arrayAngkaHasil[index] = arrayAngka1[arrayAngka1.length - (index + 1)]; //mengcopy arrayAngka terkahir ke arrayHasil pertama
        }

        //CARA KEDUA
        for (int index = 0; index <= arrayAngka1.length/2; index++){
            simpanan = arrayAngka1[index];
            arrayAngkaHasil2[index] = arrayAngka1[arrayAngka1.length - (index + 1)];
            arrayAngkaHasil2[arrayAngka1.length - (index+1)] = simpanan;

        }

        System.out.print("Array yang diurutkan dan dibalik (1) = ");
        System.out.println(Arrays.toString(arrayAngkaHasil));
        System.out.print("Array yang diurutkan dan dibalik (2) = ");
        System.out.println(Arrays.toString(arrayAngkaHasil2));


    }



}
