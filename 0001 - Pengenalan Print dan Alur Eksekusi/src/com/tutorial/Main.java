package com.tutorial;

import java.util.Scanner;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int jumlahToples = inp.nextInt();
        int jumlahPermen = inp.nextInt();
        hitung(jumlahToples, jumlahPermen);

    }

    public static void hitung(int a, int b) {
        Scanner inp = new Scanner(System.in);
        int[] isiPermen = new int[a];

        for (int i = 0; i < a; i++) {
            isiPermen[i] = inp.nextInt();
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (isiPermen[i] + isiPermen[j] == b)
                    System.out.print((j + 1) + " " + (i + 1) + " ");
                else
                    break;
            }
        }
    }
}
