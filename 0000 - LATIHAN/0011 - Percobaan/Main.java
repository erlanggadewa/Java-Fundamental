import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner chan = new Scanner(System.in);
		int n = chan.nextInt();
		int temp = n;
		int r,sum = 0;
		
		while (n > 0){
			r = n % 10;
			n = n / 10;
			sum = sum + r*r*r;
		}
		if(temp <= sum){
			System.out.println("YA");
		}else{
			System.out.println("BUKAN");
		}
	}
}