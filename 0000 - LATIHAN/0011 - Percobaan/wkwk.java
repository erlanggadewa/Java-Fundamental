import java.util.Scanner;

public class wkwk {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int input = userInput.nextInt() + 8;
		int output, checkPoint = 0;
		do {
			checkPoint++;
			input = input - 8;
			if (input >= 8) {
				output = 8;
			} else {
				output = input % 8;
			}
			System.out.printf("K%d penumpang = %d\n", checkPoint, output);
		} while (output == 8);
	}
}