import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner inputNafidz = new Scanner(System.in);
		double angka1 = inputNafidz.nextDouble();
		double angka2 = inputNafidz.nextDouble();
		double angka3 = inputNafidz.nextDouble();
		double angka4 = inputNafidz.nextDouble();
		double hasil = (angka1 + angka2 + angka3 + angka4) / 4;
		System.out.printf("rata - ratanya adalah %.6f", hasil);
		inputNafidz.close();
	}
}