import java.util.*;

public class SpiralUpgrade {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukan suku ke-N = ");
        int sukuKeN = userInput.nextInt();
        System.out.print("Masukan angka pertama = ");
        int nilaiAwal = userInput.nextInt();
        int[][] arrayAngka = new int[sukuKeN][sukuKeN];
        int checkPoint = nilaiAwal;

        // ! UNTUK BARIS
        int startRow = 0;
        int endRow = sukuKeN - 1;

        // ! UNTUK KOLOM
        int startColumn = 0;
        int endColumn = sukuKeN - 1;
        while (nilaiAwal - checkPoint < sukuKeN * sukuKeN) {
            // ! KE KANAN
            for (int i = startColumn; i <= endColumn; i++) {
                arrayAngka[startColumn][i] = nilaiAwal;
                nilaiAwal++;
            }
            // ! KE BAWAH
            for (int j = startRow + 1; j <= endRow; j++) {
                arrayAngka[j][endRow] = nilaiAwal;
                nilaiAwal++;
            }
            // ! KE KIRI
            for (int k = endColumn - 1; k >= startColumn; k--) {
                arrayAngka[endColumn][k] = nilaiAwal;
                nilaiAwal++;
            }

            // ! KE ATAS
            for (int l = endRow - 1; l > startRow; l--) {
                arrayAngka[l][startRow] = nilaiAwal;
                nilaiAwal++;
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
