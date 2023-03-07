import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner userInput = new Scanner(System.in);

    // first input
    int n = userInput.nextInt();
    List<Integer> arr = new ArrayList<Integer>();

    // second input
    for (int i = 0; i < n; i++) {
      Integer a = userInput.nextInt();

      if (arr.contains(a))
        arr.remove(a);
      else
        arr.add(a);
    }

    System.out.println("Total number that is'n repeated: " + arr.size());

  }
}
