package com.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int input = userInput.nextInt() + 8;
        int output;
        do {
            input -= 8;
            if (input >= 8) {
                output = 8;
            } else {
                output = input % 8;
            }
            System.out.println("penumpang = " + output);
        } while (output == 8);
    }
}