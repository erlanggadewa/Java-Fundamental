
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        * CONTOH ARRAY 2 DIMENSI
        int[][] array2D = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printArray2D_1(array2D);
        System.out.print("\n");
        printArray2D_2(array2D);
        System.out.print("\n");
        printArray2D_3(array2D);
        System.out.print("\n");
        printArray2D_4(array2D);
        System.out.print("\n");
        printArray2D_5(array2D);
        System.out.print("\n");

//        * CONTOH ARRAY 3 DIMENSI
        int[][][] array3D = {
                {
                        {1, 2},
                        {3, 4},
                        {5, 6}
                },
                {
                        {7, 8},
                        {9, 10},
                        {11, 12}
                },
        };
        System.out.println("\nPRINT ARRAY 3D");
        System.out.println(Arrays.deepToString(array3D));
    }

    private static void printArray2D_1(int[][] arrayAngka) {
        System.out.println("Print Pertama");
        System.out.println(Arrays.deepToString(arrayAngka));
    }

    private static void printArray2D_2(int[][] arrayAngka) {
        System.out.println("Print Kedua");
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.println(Arrays.toString(arrayAngka[i]));
        }
    }

    private static void printArray2D_3(int[][] arrayAngka) {
        System.out.println("Print Ketiga");
        for (int[] baris : arrayAngka) {
            System.out.println(Arrays.toString(baris));
        }
    }

    private static void printArray2D_4(int[][] arrayAngka) {
        System.out.println("Print Keempat");
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arrayAngka[i].length; j++) {
                System.out.print(arrayAngka[i][j] + ", ");
            }
            System.out.print("]\n");
        }
    }

    private static void printArray2D_5(int[][] arrayAngka) {
        System.out.println("Print Kelima");
        for (int[] baris : arrayAngka) {
            System.out.print("[");
            for (int kolom : baris) {
                System.out.print(kolom + ", ");
            }
            System.out.print("]\n");
        }
    }

}
