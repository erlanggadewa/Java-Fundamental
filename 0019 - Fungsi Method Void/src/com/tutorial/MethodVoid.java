package com.tutorial;

public class MethodVoid {

    public static void main (String[] args){

        salam("angga");
        salam("diva");

        System.out.println(angka());

        int x = 10;
        float hasil = hitung(x);
        System.out.println("hasil = " + hasil);



    }

    //fungsi atau method tanpa kembalian
    //void = hampa
    private static void salam (String sapa){
        System.out.println("haaai " + sapa);
        return;

    }

    //fungsi atau method dengan kembalian, sehingga menggunakan return untuk mengembalikan nilai (y)
    private static float hitung (float nilai_x){
        float y;

        y = nilai_x * nilai_x;

        return y;
    }

    //fungsi atau method dengan kembalian, sehingga menggunakan return untuk mengembalikan nilai (9)
    private static int angka (){

        return 9;
    }

}
