package com.tutorial;

public class Bitwise {
    public static void main (String[] args)  {

    //OPERATOR BITWISE --> Operator yang digunakan pada nilai bit

    byte a = 2;
    byte b, hasil;
    String a_bits, b_bits, hasil_bits;

        //Example
        a_bits = String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);

    System.out.println();//enter baris

        //Operator SHIFT LEFT (<<)
        System.out.println("===== SHIFT LEFT (<<)");
        b = (byte)(a<<1);
        b_bits = String.format("%8s",Integer.toBinaryString(b)).replace(' ', '0');
        System.out.printf("%s = %d \n", b_bits, b);

    System.out.println();//enter baris

        //Operator SHIFT RIGHT (>>)
        System.out.println("===== SHIFT RIGHT (>>)");
        hasil = (byte)(a>>1);
        hasil_bits = String.format("%8s", Integer.toBinaryString(hasil)).replace(' ', '0');
        System.out.printf("%s = %d \n", hasil_bits, hasil);

    System.out.println();//enter baris

    a = 12;
    b = 6;
    a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
    b_bits = String.format("%8s", Integer.toBinaryString(b)).replace(' ','0');

        //Operator Bitwise OR (|)
        System.out.println("===== BITWISE OR (|)");
        hasil = (byte)(a|b);
        hasil_bits = String.format("%8s", Integer.toBinaryString(hasil)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println("--------------------- OR");
        System.out.printf("%s = %d \n", hasil_bits, hasil);

    System.out.println();//enter baris

        //Operator Bitwise AND (&)
        System.out.println("===== BITWISE AND (&)");
        hasil = (byte) (a&b);
        hasil_bits = String.format("%8s", Integer.toBinaryString(hasil)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println("--------------------- AND");
        System.out.printf("%s = %d \n", hasil_bits, hasil);

    System.out.println();//enter baris

        //Operator Bitwise XOR (^)
        System.out.println("===== BITWISE XOR (^)");
        hasil = (byte) (a^b);
        hasil_bits = String.format("%8s", Integer.toBinaryString(hasil)).replace(' ', '0');
        System.out.printf("%s = %d \n", a_bits, a);
        System.out.printf("%s = %d \n", b_bits, b);
        System.out.println("--------------------- XOR");
        System.out.printf("%s = %d \n", hasil_bits, hasil);

    System.out.println();//enter baris

        //Operator Negasi atau NOT (~)
        System.out.println("===== BITWISE NOT (~)");
        a = 24;
        hasil = (byte)(~a);
        a_bits = String.format("%8s", Integer.toBinaryString(a)).replace(' ','0');
        hasil_bits = String.format("%8s", Integer.toBinaryString(hasil)).substring(24); // substring berguna untuk menghapus bagian depan
        System.out.printf("%s = %d \n", a_bits, a);
        System.out.println("--------------------- NOT");
        System.out.printf("%s = %d \n", hasil_bits, hasil);





    }
}
