import java.util.*;

public class Spiral {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int sukuKeN = userInput.nextInt();
        int[][] arrayAngka = new int[sukuKeN][sukuKeN];
        int nilai = 1;
        // ! UNTUK BARIS
        int startRow = 0;
        int endRow = sukuKeN - 1;
        // ! UNTUK KOLOM
        int startColumn = 0;
        int endColumn = sukuKeN - 1;
        while (nilai <= sukuKeN * sukuKeN) {
            // ! KE KANAN
            // ?            1                1
            for (int i = startColumn; i <= endColumn; i++) {
                arrayAngka[startColumn][i] = nilai;
                nilai++;
            }
            // ! BYPASS BUG KETIKA N GANJIL
            if (nilai != (sukuKeN*sukuKeN) + 1) {
                // ! KE BAWAH
                for (int j = startRow + 1; j < endRow; j++) {
                    arrayAngka[j][endRow] = nilai;
                    nilai++;
                }
                // ! KE KIRI
                for (int k = endColumn; k >= startColumn; k--) {
                    arrayAngka[endColumn][k] = nilai;
                    nilai++;
                }

                // ! KE ATAS
                // ?         1                 0
                for (int l = endRow - 1; l > startRow; l--) {
                    arrayAngka[l][startRow] = nilai;
                    nilai++;
                }
            }

            startRow++;
            startColumn++;
            endColumn--;
            endRow--;
        }
        for (int[] baris : arrayAngka) {
            for (int kolom = 0; kolom < arrayAngka.length; kolom++) {
                System.out.print(baris[kolom] + "\t");
            }
            System.out.print("\n");
        }
    }
}
