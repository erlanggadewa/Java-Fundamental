import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        String nama;
        int umur;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukan nama anda = ");
        nama = userInput.nextLine();
        System.out.print("Masukan umur anda = ");
        umur = userInput.nextInt();
        System.out.println("Halo, " + nama);
        System.out.println("Ternyata usiamu baru " + umur + " tahun ya!");
    }
}
