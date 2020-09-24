import java.util.Scanner;

public class Soal1{
	public static void main (String[] args){
		Scanner userInput = new Scanner(System.in); 
		System.out.print("Masukan jumlah nominal uang tabungan anda = ");
		long nominalUang = userInput.nextLong();
		System.out.print("Masukan jumlah hari = ");
		int hari = userInput.nextInt();
		long totalTabungan = nominalUang * hari;
		System.out.println("Total tabungan anda selama " + hari + " hari sebesar = " +  totalTabungan + " Rupiah");
	}

}
