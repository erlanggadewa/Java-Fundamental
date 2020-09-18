package com.tutorial;
import java.util.*; //import semua java.util package

public class PengenalanArray {

    public static void main (String[] args){

        Scanner inputAngga = new Scanner(System.in);

//        ARRAY ASSIGNMENT
//        tipe data [] nama = {          }


        int a = 10;
        System.out.println(a); //berbeda dengan memori pada data premitif yang sudah jelas alamatnya, dan menggunakan memori stack

        System.out.println("\nASSIGNMENT ARRAY");

        int[] arrayInteger = {1, 4, 51, 12};

        System.out.println("alamat array = " + arrayInteger); //jika diprint akan menampilkan alamat arraynya, karena array menggunakan memori heap
        System.out.println("index 0 = " + arrayInteger[0]);
        System.out.println("index 1 = " + arrayInteger[1]);
        System.out.println("index 2 = " + arrayInteger[2]);
        System.out.println("index 3 = " + arrayInteger[3]);

        System.out.print("Masukan nilai baru pada index ke-2 = ");
        arrayInteger[2] = inputAngga.nextInt();
        System.out.println("index 2 yang baru = " + arrayInteger[2]);

//        ARRAY DEKLARASI
//        tipe data[] nama = new tipedata[jumlah index yg diinginkan]

        System.out.println("\nDEKLARASI ARRAY");

        float arrayFloat[] = new float[5];
        System.out.print("Masukan nilai pada indek ke-0 = ");
        arrayFloat[0] = inputAngga.nextFloat();
        System.out.print("Masukan nilai pada indek ke-1 = ");
        arrayFloat[1] = inputAngga.nextFloat();
        System.out.print("Masukan nilai pada indek ke-2 = ");
        arrayFloat[2] = inputAngga.nextFloat();
        System.out.print("Masukan nilai pada indek ke-3 = ");
        arrayFloat[3] = inputAngga.nextFloat();
        System.out.print("Masukan nilai pada indek ke-4 = ");
        arrayFloat[4] = inputAngga.nextFloat();

        System.out.println(Arrays.toString(arrayFloat)); //Array.toString() berguna untuk mengubah array ke string






    }



}






















