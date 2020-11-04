import java.util.*;

public class SegitigaPascalMin {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int sukuN = userInput.nextInt();

        for (int baris = 1; baris <= sukuN; baris++) {
            for (int spasi = 1; spasi <= sukuN - baris; spasi++) {
                System.out.print(" ");
            }

            int pascal = 1;

            for (int angkaKe = 1; angkaKe <= baris; angkaKe++) {
                System.out.print(pascal + " ");
                pascal = pascal * (baris - angkaKe) / angkaKe;
            }

            System.out.println();
        }

        userInput.close();
    }
}
