import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);

        ArrayList < String > dataArisan = new ArrayList<>();
        String nama = "";

        do {
            // ? INPUT NAMA
            nama = masukan.next();
            // ? MEMBUAT - TIDAK IKUT KEDALAM ARRAYLIST
            if (!nama.equals("-")) {
                dataArisan.add(nama); // ? A, B, C,
            }
        } while (!nama.equals("-"));

        Random acak = new Random();
        //  ?    3                 3
        int banyakOrang = dataArisan.size();
        //  ?                    0 <= x < 3 --> 0 1 2 
        int angkaAcak = acak.nextInt(banyakOrang);
        // ? array = [A, B, C] 
        // ?   INDEX  0  1  2
        System.out.println(dataArisan.get(angkaAcak));
    }
}