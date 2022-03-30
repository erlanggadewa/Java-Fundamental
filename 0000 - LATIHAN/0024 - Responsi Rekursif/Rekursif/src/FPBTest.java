import java.util.Scanner;

public class FPBTest {
  public static void main(String[] args) throws Exception {
    Scanner userInput = new Scanner(System.in);

    System.out.print("Masukan angka x : ");
    int x = userInput.nextInt();
    System.out.print("Masukan angka y : ");
    int y = userInput.nextInt();
    System.out.println(fpb(x, y));

    userInput.close();
  }

  private static int fpb(int x, int y) {
    int sisa = x % y;
    if (x % y == 0) {
      return y;
    } else {
      return fpb(y, sisa);
    }
  }
}
