package com.tutorial;
import java.util.Arrays;

public class ForEach {
    public static void main (String[] args){

        int[] ArrayAngka = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        //looping standar
        System.out.println("--------------------------");
        for (int index = 0; index <= 10; index++){
            System.out.println("index ke " + index + " adalah = " + ArrayAngka[index]);
        }

        //looping dengan properti array
        System.out.println("--------------------------");
        for (int index = 0; index < ArrayAngka.length; index++){ //index array dimulai dari nol, dan panjang array dimulai dari satu
            System.out.println("index ke " + index + " adalah = " + ArrayAngka[index]);
        }

        //looping dengan for each
        System.out.println("--------------------------");
        for (int IsiArray : ArrayAngka){
            System.out.println(IsiArray);
        }

    }
}
