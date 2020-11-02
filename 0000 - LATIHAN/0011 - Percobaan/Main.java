import java.util.Scanner;	
	public class Soal01 {
			public static void main (String[] args) {
				double nilaiKesatu, nilaiKedua, hasil;
				Scanner caca = new Scanner(System.in);
					nilaiKesatu = caca.nextDouble();
					char operasi = caca.next().charAt(0);
					nilaiKedua = caca.nextDouble();

					switch (operasi){
						case '+' :
							hasil = nilaiKesatu + nilaiKedua;
							System.out.printf("%.3f", hasil);
						break;
						case '-' :
							hasil = nilaiKesatu - nilaiKedua;
							System.out.printf("%.3f", hasil);
						break;
						case '*' :
							hasil = nilaiKesatu * nilaiKedua;
							System.out.printf("%.3f", hasil);
						break;
						case '/' :
							hasil = nilaiKesatu / nilaiKedua;
							System.out.printf("%.3f", hasil);
						break;
						case'^' :
							hasil = Math.pow(nilaiKesatu, nilaiKedua);
							System.out.printf("%.3f", hasil);
						break;
					}
			}
		}