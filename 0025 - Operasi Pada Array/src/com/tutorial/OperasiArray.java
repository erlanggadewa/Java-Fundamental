package com.tutorial;
import java.util.*;

public class OperasiArray {

    public static void main(String[] args) {

        Scanner inputAngga = new Scanner(System.in);

        System.out.println("\n------------------------------------\nMENGUBAH ARRAY MENJADI STRING\n------------------------------------");
        int[] arrayAngka1 = {11, 12, 13, 14, 15, 16};
        printArray(arrayAngka1,1);

        System.out.println("\n------------------------------------\nMENG-COPY ARRAY DENGAN LOOPING\n------------------------------------");
        int[] arrayAngka2 = {21, 22, 23, 24, 25, 26};
        int[] arrayAngka3 = new int[arrayAngka2.length]; //memerlukan dimensi karena kita tidak meggunakan fungsi pada java.util.Arrays untuk melakukan operasi
        for (int index = 0; index < arrayAngka2.length; index++){
            arrayAngka3[index] = arrayAngka2[index];
        }
        printArray(arrayAngka2,2);
        printArray(arrayAngka3,3);
        //alamat array tidak sama, karena hanya mencopy isi saja, tidak alamatnya
        System.out.println("Alamat array ke-2 = " + arrayAngka2);
        System.out.println("Alamat array ke-3 = " + arrayAngka3);

        System.out.println("\n------------------------------------\nMENG-COPY ARRAY DENGAN copyOf\n------------------------------------");
        int[] arrayAngka4 = {41, 42, 43, 44, 45, 46};
        int[] arrayAngka5; //tidak perlu mengisi dimensi karena menggunakan Arrays.copyOf yang akan menyesuaikan dimensi
        arrayAngka5 = Arrays.copyOf(arrayAngka4, arrayAngka4.length);
        printArray(arrayAngka4,4);
        printArray(arrayAngka5,5);
        //alamat array tidak sama, karena hanya mencopy isi saja, tidak alamatnya
        System.out.println("Alamat array ke-4 = " + arrayAngka4);
        System.out.println("Alamat array ke-5 = " + arrayAngka5);


        System.out.println("\n------------------------------------\nMENG-COPY ARRAY DENGAN copyOfRange\n------------------------------------");
        //operator untuk mengcopy nilai array pada rentang yg kita inginkan
        int[] arrayAngka6 = {61, 62, 63, 64, 65, 66};
        int[] arrayAngka7;
        arrayAngka7 = Arrays.copyOfRange(arrayAngka6,2,6); //yang diambil antara (2 <= index < 6)
        printArray(arrayAngka6,6);
        printArray(arrayAngka7,7);
        //alamat array tidak sama, karena hanya mencopy isi saja, tidak alamatnya
        System.out.println("Alamat array ke-6 = " + arrayAngka6);
        System.out.println("Alamat array ke-7 = " + arrayAngka7);

        System.out.println("\n------------------------------------\nMENGISI ARRAY DENGAN  NILAI YANG KITA INGINKAN\n------------------------------------");
        //operator untuk mengisi nilai array yang kosong dengan nilai yang kita inginkan
        int[] arrayAngka8 = new int[5];
        printArray(arrayAngka8,8);
        Arrays.fill(arrayAngka8,12);
        printArray(arrayAngka8,8);

        int[] arrayAngka9 = new int [7];
        System.out.print("\n"); //enter line
        printArray(arrayAngka9,9);
        Arrays.fill(arrayAngka9,4,7,69); //mengisi (4 <= index < 7) dengan angka 69
        printArray(arrayAngka9,9);

        //mengecek array yang sama
        System.out.println("\n------------------------------------\nMENGECEK ARRYA YANG LEBIH BESAR\n------------------------------------");
        int[] arrayAngka10 = {100, 101, 102, 103};
        printArray(arrayAngka10,10);
        int[] arrayAngka11 = {100, 101, 102, 103};
        printArray(arrayAngka11,11);
        System.out.println("Komparasi array ke-10 terhadap array ke-11 = " + Arrays.compare(arrayAngka10,arrayAngka11) + "\n" );
        //mengecek array yang berbeda
        int[] arrayAngka12 = {120, 121, 122, 123};
        printArray(arrayAngka12,12);
        int[] arrayAngka13 = {10, 01, 12, 03};
        printArray(arrayAngka13,13);
        System.out.println("Komparasi array ke-12 terhadap array ke-13 = " + Arrays.compare(arrayAngka12,arrayAngka13) + "\n");
        //mengecek array yang berbeda
        int[] arrayAngka14 = {120, 121, 122, 123};
        printArray(arrayAngka14,14);
        int[] arrayAngka15 = {120, 121, 122, 1000};
        printArray(arrayAngka15,15);
        System.out.println("Komparasi array ke-14 terhadap array ke-15 = " + Arrays.compare(arrayAngka14,arrayAngka15));
        //keterangan
        System.out.println("\nJika a[] komparasi b[] dan hasil = \n 0 maka isi semua index sama \n 1 maka isi index b[] memiliki perbedaan dengan isi index a[] \n-1 maka isi salah satu index b[] memiliki perbedaan lebih besar daripada isi index a[]" );
        //NB : Arrays.compare bernilai integer (0 / 1 / -1)

        System.out.println("\n------------------------------------\nMEMBANDINGKAN ANTARA DUA BUAH ARRAY\n------------------------------------");
        //memngecek array yang sama
        int[] arrayAngka16 = {1, 2, 3, 4, 5};
        int[] arrayAngka17 = {1, 2, 3, 4, 5};
        printArray(arrayAngka16,16);
        printArray(arrayAngka17,17);
        if (Arrays.equals(arrayAngka16,arrayAngka17) == true){
            System.out.println("arrayAngka16 == arrayAngka17\n");
        } else {
            System.out.println("arrayAngka16 != arrayAngka17\n");
        }
        //mengecek array yang berbeda
        int[] arrayAngka18 = {23, 22, 21, 20, 19};
        int[] arrayAngka19 = {11, 22, 32, 43, 52};
        printArray(arrayAngka18,18);
        printArray(arrayAngka19,19);
        if (Arrays.equals(arrayAngka18,arrayAngka19) == true){
            System.out.println("arrayAngka18 == arrayAngka19");
        } else {
            System.out.println("arrayAngka18 != arrayAngka19");
        }
        //NB : Arrays.equals bernilai boolean true / false

        System.out.println("\n------------------------------------\nMENGECEK MANA INDEX YANG BERBEDA\n------------------------------------");
        int[] arrayAngka22 = {1, 2, 3, 4, 5};
        int[] arrayAngka23 = {1, 2, 3, 4, 5};
        printArray(arrayAngka22,22);
        printArray(arrayAngka23,23);
        System.out.println("berbeda pada index ke = " + Arrays.mismatch(arrayAngka22,arrayAngka23) + "\n");

        int[] arrayAngka24 = {11, 12, 13, 4, 5};
        int[] arrayAngka25 = {11, 12, 30, 44, 5};
        printArray(arrayAngka24,24);
        printArray(arrayAngka25,25);
        System.out.println("berbeda pada index ke = " + Arrays.mismatch(arrayAngka24,arrayAngka25));
        //NB : Walaupun pada arrayAngka24 dan arrayAngka25 memiliki perbedaan pada index 2 dan 3 , tetapi hasilnya berbeda pada index 2 karena yg dicari merupakan yg berbeda pertama

        System.out.println("\n------------------------------------\nSORTING DAN SEARCH ARRAY\n------------------------------------");
        int[] arrayAngka26 = {12, 422, 52, 21, 42, 22, 7, 76, 6};
        System.out.println("Sebelum di sort ");
        printArray(arrayAngka26,26);
        Arrays.sort(arrayAngka26); //sorting array
        System.out.println("Sesudah di sort ");
        printArray(arrayAngka26,26);
        System.out.print("Masukan angka yang akan di cari pada array di atas = ");
        int inputArray = inputAngga.nextInt(); //input user
        if ((Arrays.binarySearch(arrayAngka26,inputArray) < arrayAngka26.length) && (Arrays.binarySearch(arrayAngka26,inputArray) >= 1)) {
            System.out.println("Angka " + inputArray + " pada array di atas berada pada index = " + Arrays.binarySearch(arrayAngka26,inputArray));
        } else {
            System.out.println("Angka " + inputArray + " pada array di atas tidak ditemukan");
        }























    }

    private static void printArray(int[] parameter, int n){
        System.out.println("Array ke-" + n + " = " + Arrays.toString(parameter));
    }
}
