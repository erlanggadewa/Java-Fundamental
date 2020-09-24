import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukan jumlah permen yang dimiliki Dira = ");
        int jumlahPermen = inputUser.nextInt();
        System.out.print("Masukan jumlah teman Dira = ");
        int jumlahTeman = inputUser.nextInt() + 1;
        int jumlahBagi = jumlahPermen / jumlahTeman;
        int sisaBagi = jumlahPermen % jumlahTeman;
        System.out.println("Setiap orang mendapat " + jumlahBagi + " permen");
        System.out.println("Sisa permen Dira tinggal " + sisaBagi + " permen");
    }
}
