package com.tutorial;
import java.util.Scanner;

public class ControlFlow {
    public static void main (String[] args){

        Scanner inputAngga = new Scanner(System.in);
        String input;
        int a = 1;

        System.out.println("==== AWAL PROGRAM ====");
        System.out.println("Masukan pilihan (break / continue / return) = ");
        input = inputAngga.next();


        while (true) {
            if (input.equals("break")) {
                //BREAK
                System.out.println("Loop ke-" + a);
                a++;
                if (a == 10) {
                    System.out.println("Program break pada loop ke-" + a);
                    break; //memaksa menghentikan loop dan tidak mengeksekusi program dibawahnya
                }
            } else if (input.equals("continue")) {
                //CONTINUE
                a++;
                if (a == 10) {
                    System.out.println("Program continue dan tidak mengeksekusi loop ke-" + a);
                    continue; //memaksa mengeluarkan loop dan kembali ke awal dan tidak mengeksekusi program dibawahnya
                } else if (a == 20){
                    break;
                }
                System.out.println("Loop ke-" + a);
            } else if (input.equals("return")) {
                //RETURN
                System.out.println("Loop ke-" + a);
                a++;
                if (a == 10) {
                    System.out.println("Program 'return'");
                    return; //mengakhiri program java dan tidak mengeksekusi program apapun, bahkan program baris ke 50
                }
            } else {
                System.out.println("==== AWAL PROGRAM ====");
                System.out.println("Masukan pilihan (break / continue / return) = ");
                input = inputAngga.next();
            }
        }

        System.out.println("Program Selesai");


    }
}
