import java.util.Scanner;

public class wkwk {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int angka = userInput.nextInt();
		System.out.println("angka yang anda masukan adalah " + angka);
		userInput.close();
	}
}