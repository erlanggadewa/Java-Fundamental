import java.util.*;

public class Spiral {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int sukuKeN = userInput.nextInt();

        for (int index = 1; index <= sukuKeN; index++) {
            System.out.print(index + " ");
        }
    }
}
