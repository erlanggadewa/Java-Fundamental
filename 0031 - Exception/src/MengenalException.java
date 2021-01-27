import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MengenalException {
    public static void main(String[] args) {
        int[] arrAngka = {1, 2, 3, 4};

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukan index : ");
        int index = userInput.nextInt();

        System.out.println("\n----PERTAMA----");
        try {
            System.out.println(arrAngka[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index anda melebihi batas");
        } finally {
            System.out.println("Program Selesai");
        }

        System.out.println("\n----KEDUA----");
        try {
            System.out.println(arrAngka[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // ! System.err.println di eskeskusi terakhir
            System.err.println("Index anda melebihi batas");
        } finally {
            System.out.println("Program Selesai");
        }
        System.out.println("cek");

        System.out.println("\n----KETIGA----");
        FileInputStream fileInput;
        try {
            fileInput = new FileInputStream("input.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            System.out.println("Close Document");
        }

    }
}
















