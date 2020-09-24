import java.util.Scanner;
public class Modul3Soal3{
    public static void main (String[] args){
        int bilbul1, bilbul2;
        double angkaPecahan;
        boolean keadaan1, keadaan2;
        Scanner userInput = new Scanner(System.in);

        // OPERASI ARITMATIKA ANTARA BILANGAN BULAT DENGAN BILANGAN BULAT
        System.out.print("Masukan bilangan bulat pertama\t= ");
        bilbul1 = userInput.nextInt();
        System.out.print("Masukan bilangan bulat kedua\t= ");
        bilbul2 = userInput.nextInt();
        System.out.println("\nHasil penjumlahan kedua bilangan bulat tersebut adalah\t= " + (bilbul1 + bilbul2));
        System.out.println("Hasil pengurangan kedua bilangan bulat tersebut adalah\t= " + (bilbul1 - bilbul2));
        System.out.println("Hasil perkalian kedua bilangan bulat tersebut adalah\t= " + (bilbul1 * bilbul2));
        System.out.println("Hasil pembagian kedua bilangan bulat tersebut adalah\t= " + (bilbul1 / bilbul2));
        System.out.println("Sisa bagi antara bilangan bulat pertama dibagi bilangan bulat kedua adalah = " + (bilbul1 % bilbul2));
        System.out.println("=================================================================================");

        // OPERASI ARITMATIKA ANTARA BILANGAN BULAT DENGAN BILANGAN PECAHAN
        System.out.print("\nMasukan bilangan bulat\t\t= ");
        bilbul1 = userInput.nextInt();
        System.out.print("Masukan bilangan pecahan\t= ");
        angkaPecahan = userInput.nextDouble();
        System.out.printf("\nHasil penjumlahan antara bilangan bulat dan bilangan pecahan diatas adalah\t  = %.3f\n", (bilbul1 + angkaPecahan));
        System.out.printf("Hasil pengurangan antara bilangan bulat dan bilangan pecahan diatas adalah\t  = %.3f\n", (bilbul1 - angkaPecahan));
        System.out.printf("Hasil perkalian antara bilangan bulat dan bilangan pecahan diatas adalah\t  = %.3f\n", (bilbul1 * angkaPecahan));
        System.out.printf("Hasil pembagian antara bilangan bulat dan bilangan pecahan diatas adalah\t  = %.3f\n", (bilbul1 / angkaPecahan));
        System.out.printf("Sisa bagi antara bilangan bulat diatas dibagi bilangan pecahan diatas adalah\t  = %.3f\n", (bilbul1 % angkaPecahan));
        System.out.println("=================================================================================");

        // OPERASI BOOLEAN
        System.out.print("\nMasukan kondisi pertama (true / false)\t= ");
        keadaan1 = userInput.nextBoolean();
        System.out.print("Masukan kondisi kedua (true / false)\t= ");
        keadaan2 = userInput.nextBoolean();
        System.out.printf("Hasil dari Keadaan pertama (%b) AND Keadaan kedua (%b) = %b\n", keadaan1, keadaan2, (keadaan1 && keadaan2));
        System.out.printf("Hasil dari Keadaan pertama (%b) OR Keadaan kedua (%b) = %b\n", keadaan1, keadaan2, (keadaan1 || keadaan2));
        System.out.printf("Hasil dari Keadaan pertama (%b) XOR Keadaan kedua (%b) = %b\n", keadaan1, keadaan2, (keadaan1 ^ keadaan2));
        System.out.printf("Hasil dari negasi Keadaan pertama atau (NOT %b) adalah = %b\n", keadaan1, !keadaan1);
        System.out.printf("Hasil dari negasi Keadaan kedua atau (NOT %b) adalah = %b\n", keadaan2, !keadaan2);












    }
}
