import java.util.*;

public class PerkalianMatrix {
    public static final Scanner USERINPUT = new Scanner(System.in);

    public static void main(String[] args) {
        //      ? INPUT ARRAY PERTAMA
        System.out.print("Input Dimensi Array Pertama (Baris x Kolom) = ");
        int dimensiArray1Baris = USERINPUT.nextInt();
        USERINPUT.next().charAt(0);
        int dimensiArray1Kolom = USERINPUT.nextInt();
        int[][] arrayAngka1 = inputArray(dimensiArray1Baris, dimensiArray1Kolom, "ARRAY 1");
        //      ? END OF INPUT ARRAY PERTAMA

        //      ? INPUT ARRAY KEDUA
        System.out.print("\nInput Dimensi Array Kedua (Baris x Kolom) = ");
        int dimensiArray2Baris = USERINPUT.nextInt();
        USERINPUT.next().charAt(0);
        int dimensiArray2Kolom = USERINPUT.nextInt();
        int[][] arrayAngka2 = inputArray(dimensiArray2Baris, dimensiArray2Kolom, "ARRAY 2");
        //      ? END OF INPUT ARRAY KEDUA

        if (arrayAngka1[0].length == arrayAngka2.length) {
            System.out.println("\nHASIL PERKALIAN MATRIX");
            printArray(arrayPerkalian(arrayAngka1, arrayAngka2));
        } else {
            System.out.println("\nError : Matrix tidak dapat dikalikan");
        }
    }

    private static int[][] arrayPerkalian(int[][] arrayAngka1, int[][] arrayAngka2) {
        int[][] arrayHasil = new int[arrayAngka1.length][arrayAngka2[0].length];
        for (int baris = 0; baris < arrayAngka1.length; baris++) {
            for (int kolom = 0; kolom < arrayAngka2[0].length; kolom++) {
                int hasil = 0;
                for (int i = 0; i < arrayAngka1[0].length; i++) {
                    hasil = hasil + arrayAngka1[baris][i] * arrayAngka2[i][kolom];
                }
                arrayHasil[baris][kolom] = hasil;
            }
        }
        return arrayHasil;
    }

    private static void printArray(int[][] arrayAngka) {
        for (int[] baris : arrayAngka) {
            System.out.println(Arrays.toString(baris).replace("," , "\t"));
        }
    }

    private static int[][] inputArray(int baris, int kolom, String comment) {
        int[][] arrayAngka = new int[baris][kolom];
        System.out.println("-------------------------------------------");
        System.out.println(comment);
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.printf("input matrix index ke [%d][%d] = ", i, j);
                arrayAngka[i][j] = USERINPUT.nextInt();
            }
        }
        return arrayAngka;
    }

}