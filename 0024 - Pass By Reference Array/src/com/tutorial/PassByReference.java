package com.tutorial;
import java.util.*;

public class PassByReference {
    public static void main(String[] args) {

        int[] arrayAngka1 = new int[]{11, 12, 13, 14, 15};
        int[] arrayAngka2 = new int[arrayAngka1.length];

        System.out.println("\nARRAY LAMA"); //alamat array sebelum di (arrayAngka2 = arrayAngka1)
        System.out.println("Alamat Array1 = " + arrayAngka1);
        System.out.println("Alamat Array2 = " + arrayAngka2);
        System.out.println("Array1 = " + Arrays.toString(arrayAngka1));
        System.out.println("Array2 = " + Arrays.toString(arrayAngka2) + "\n");


        arrayAngka2 = arrayAngka1; //alamat array1 dan alamat array2 akan sama
        System.out.println("ARRAY BARU"); //alamat array sesudah di (arrayAngka2 = arrayAngka1)
        System.out.println("Alamat Array1 = " + arrayAngka1);
        System.out.println("Alamat Array2 = " + arrayAngka2);
        System.out.println("Array1 = " + Arrays.toString(arrayAngka1));
        System.out.println("Array2 = " + Arrays.toString(arrayAngka2) + "\n");

        //ketika keduanya diubah makan dua-duanya akan ikut berubah juga
        arrayAngka1[0] = 900;
        arrayAngka2[4] = 653;
        System.out.println("Array1 baru = " + Arrays.toString(arrayAngka1));
        System.out.println("Array2 baru = " + Arrays.toString(arrayAngka2) + "\n");

        ubahArray(arrayAngka1);
        System.out.println("\nArray2 baru = " +  Arrays.toString(arrayAngka2)); //nanti akan mengikuti isi dari arrayAngka1 yang telah diolah di fungsi

    }

    //method yang argumentnya adalah reference, atau pass by reference (untuk string)
    //bukan pass by value (untuk data primitif)
    private static void ubahArray(int[] parameter){

        System.out.print("Array1 dengan fungsi (1) = ");
        for (int nilaiArray : parameter){
            System.out.print(nilaiArray + ", ");
        }

        System.out.print("\nArray1 dengan fungsi (2) = ");
        parameter[2] = 6969;
        for (int nilaiArray : parameter){
            System.out.print(nilaiArray + ", ");
        }

    }
}























