import java.util.*;

public class SegitigaPascal {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int input = userInput.nextInt();

        for (int line = 1; line <= input; line++) {
            for (int space = input; space > line; space--) {
                System.out.print(" ");
            }
            int pascal = 1;
            System.out.print(pascal + " ");
            for (int nthTerm = 1; nthTerm < line; nthTerm++) {
                pascal = pascal * (line - nthTerm) / nthTerm;
                System.out.print(pascal + " ");
            }
            System.out.println();
        }
        userInput.close();
    }
}
