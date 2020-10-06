import java.util.Scanner;

public class wkwk{
	public static void main(String[]args){
		
		Scanner inputAngga = new Scanner(System.in);
		String bangunDatar;
		double angkaMasukan1,angkaMasukan2, luas, keliling;
		int luas1, keliling1;

		bangunDatar = inputAngga.nextLine();

		switch (bangunDatar){
			case "Persegi":
			angkaMasukan1 = inputAngga.nextDouble();
			luas = angkaMasukan1 * angkaMasukan1;
			keliling = 4 * angkaMasukan1;
			luas1 = (int) luas;
			keliling1 = (int) keliling;
			System.out.println(luas1 + " " + keliling1);


			break;
			case "Persegi Panjang":
			angkaMasukan1 = inputAngga.nextDouble();
			angkaMasukan2 = inputAngga.nextDouble();
			luas = angkaMasukan1 * angkaMasukan2;
			keliling = angkaMasukan1 + angkaMasukan1 + angkaMasukan2 + angkaMasukan2;
			luas1 = (int) luas;
			keliling1 = (int) keliling;
			System.out.println(luas1 + " " + keliling1);


			break;
			case "Segitiga":	
			angkaMasukan1 = inputAngga.nextDouble();
			angkaMasukan2 = inputAngga.nextDouble();
			luas = angkaMasukan1 * angkaMasukan2 * 5 / 10;
			keliling = Math.sqrt((angkaMasukan1 * angkaMasukan1) + (angkaMasukan2 * angkaMasukan2)) + angkaMasukan2 + angkaMasukan1;
			luas1 = (int) luas;
			keliling1 = (int) keliling;
			System.out.println(luas1 + " " + keliling1);


			break;
			case "Lingkaran":
			angkaMasukan1 = inputAngga.nextDouble();
			luas = 0.25 * 3.14 * angkaMasukan1 * angkaMasukan1;
			keliling = 3.14 * angkaMasukan1;
			System.out.println(luas + " " + keliling);


			break;
			default:
		}
		
		

	}
}