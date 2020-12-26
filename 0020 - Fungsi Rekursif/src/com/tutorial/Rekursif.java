package com.tutorial;
import java.util.Scanner;

public class Rekursif {

    public static void main(String[] args) {

        Scanner inputAngga;
        inputAngga = new Scanner(System.in);
        int nilai;

        System.out.print("Masukan Nilai = ");
        nilai = inputAngga.nextInt();

        printNilai(nilai);
        System.out.println("SUM = " + printSum(nilai));
        System.out.println("Faktorial = " + printFactorial(nilai));

    }

    private static void printNilai(int parameter) {

        System.out.println("Nilai = " + parameter);
        if (parameter == 0) {
            return;
        }
        parameter--;
        printNilai(parameter);

    }

    private static int printSum(int parameter) {
        if (parameter == 0) { //ketika parameter = 1 maka printFactorial (1) akan bernilai 0 karena return 0, kalau kita return 7 maka print factorial (0) akan bernilai 7
            return 0;
        }
        return parameter + printSum(parameter - 1);
    }

    private static int printFactorial(int parameter) {
        int y;
        if (parameter == 1) { //ketika parameter = 1 maka printFactorial (1) akan bernilai 1 karena return 1, kalau kita return 2 maka print factorial (1) akan bernilai 2
            return 1;
        }
        y = parameter * printFactorial(parameter - 1);
        return y;
    }

}