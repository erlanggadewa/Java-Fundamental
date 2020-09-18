package com.tutorial;


public class TipeData {

    public static void main (String[] Anjay){

        //tipe tipe data di Java
        //Integer, Byte, Short, Long, Double, Float, Char, Boolean


        //Byte (satuan)
        byte b = 11;
            System.out.println("");
            System.out .println("=====BYTE=====");
            System.out.println("Nilai b = " + b);
            System.out.println("Nilai max = " + Byte.MAX_VALUE);
            System.out.println("Nilai min = " + Byte.MIN_VALUE);
            System.out.println("Nilai byte = " + Byte.BYTES + " Bytes");
            System.out.println("Besar byte = " + Byte.SIZE + " Bit");
            System.out.println("");

        //Short (satuan)
        short s = 21;
            System.out.println("=====SHORT=====");
            System.out.println("Nilai s = " + s);
            System.out.println("Nilai max = " + Short.MAX_VALUE);
            System.out.println("Nilai min = " + Short.MIN_VALUE);
            System.out.println("Nilai short = " + Short.BYTES + " Bytes");
            System.out.println("Besar short = " + Short.SIZE + " Bit");
            System.out.println("");

        //Integer (satuan)
        int i = 10;
            System.out.println("=====INTEGER=====");
            System.out.println("Nilai i = " + i);
            System.out.println("Nilai max = " + Integer.MAX_VALUE);
            System.out.println("Nilai min = " + Integer.MIN_VALUE);
            System.out.println("Nilai Integer = " + Integer.BYTES + " Bytes");
            System.out.println("Besar Integer = " + Integer.SIZE + " Bit");
            System.out.println("");

        //Long (Satuan)
        long l = 21L; //long dapat ditandai dengan menambahkan huruf "L" di akhir
            System.out.println("=====LONG=====");
            System.out.println("Nilai l = " + l);
            System.out.println("Nilai max = " + Long.MAX_VALUE);
            System.out.println("Nilai min = " + Long.MIN_VALUE);
            System.out.println("Nilai short = " + Long.BYTES + " Bytes");
            System.out.println("Besar short = " + Long.SIZE + " Bit");
            System.out.println("");


        //Float (koma, bilangan real)
        float f = 43F; //float dapat ditandai dengan menambahkan huruf "F" di akhir
            System.out.println("=====FLOAT=====");
            System.out.println("Nilai f = " + f);
            System.out.println("Nilai max = " + Float.MAX_VALUE);
            System.out.println("Nilai min = " + Float.MIN_VALUE);
            System.out.println("Nilai float = " + Float.BYTES + " bytes");
            System.out.println("besar float = " + Float.SIZE + " bit");
            System.out.println("");

        //Double (koma, bilangan real)
        double d = 90D; //double dapat ditandai dengan menambahkan huruf "D" di akhir
            System.out.println("=====DOUBLE======");
            System.out.println("Nilai d = " + d);
            System.out.println("Nilai max = " + Double.MAX_VALUE);
            System.out.println("Nilai min = " + Double.MIN_VALUE);
            System.out.println("Nilai double = " + Double.BYTES +" bytes");
            System.out.println("Besar double = " + Double.SIZE + " bit");
            System.out.println("");

        //Char (character) berdasarkan ASCII
        char c = 'o';
            System.out.println("=====CHAR=====");
            System.out.println("Nilai c = " + c);
            System.out.println("Nilai max = " + Character.MAX_VALUE);
            System.out.println("Nilai min = " + Character.MIN_VALUE);
            System.out.println("Nilai char = " + Character.BYTES + " bytes");
            System.out.println("Besar char = " + Character.SIZE + " bit" );
            System.out.println("");

        //Boolean (hanya nilai true '1' atau false '0')
        boolean value = false;
            System.out.println("=====BOOLEAN=====");
            System.out.println("value = " + value);
            System.out.println("Nilai max = " + Boolean.TRUE);
            System.out.println("Nilai min = " + Boolean.FALSE);
            


    }
}
