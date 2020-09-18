package com.tutorial;

public class KonversiTipeData {

    public static void main(String[] args) {

        //PROGRAM UNTUK KONVERSI DATA

        int NilaiInt1 = 600;
        System.out.println("Nilai int = " + NilaiInt1);

        //Memperluas konversi data, ex = integer -> long
        long NilaiLong1 = NilaiInt1;
        System.out.println("Nilai int --> long = " + NilaiLong1);

        //Memperkecil konversi, ex = integer --> byte
        byte NilaiByte1 = (byte) NilaiInt1; //dari tinggi ke rendah harus diberi casting (blabla)
        System.out.println("Nilai int --> byte = " + NilaiByte1); // nilai akan eror / berubah, karena melebihi kapasitas nilainya
        System.out.println("Nilai max byte = " + Byte.MAX_VALUE);
        System.out.println("Nilai min byte = " + Byte.MIN_VALUE);

        System.out.println(); //enter barisan baru

        //Percobaan dari konversi tipe paling rendah menuju ke paling tinggi
        //ternyata tidak usah diberi casting(blablabla)

        byte NilaiByte2 = 100;
        System.out.println("Nilai byte = " + NilaiByte2);

        long NilaiLong2 = NilaiByte2;
        System.out.println("Nilai byte --> long = " + NilaiLong2);

        System.out.println(); //enter barisan baru

        //Casting Pembagian

        int a = 13;             //jika integer dibagi integer hasilnya akan menjadi integer
        int b = 3;
        float hasil1 = (float) a/b;
        System.out.printf("Nilai a = %d dan Nilai b = %d \n", a, b);
        System.out.println("Nilai a / b = " + hasil1);

        System.out.println(); //enter barisan baru

        float c = 11;           //jika float dibagi integer hasilnya dapat berupa float
        int d = 7;
        float hasil2 = c/d;
        System.out.printf("Nilai c = %.0f dan Nilai d = %d \n", c, d);
        System.out.println("Nilai c / d = " + hasil2);



    }
}
