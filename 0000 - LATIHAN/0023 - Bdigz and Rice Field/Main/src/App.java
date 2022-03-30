import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    String[] data1 = { "angga", "miko", "hardi" };
    String[] data2 = { "priyo", "todi", "gusto" };
    data2 = data1;
    printArray(data2);
  }

  private static void printArray(String[] arrData) {
    for (int i = 0; i < arrData.length; i++) {
      System.out.print(arrData[i] + ", ");
    }
    System.out.print("\n");
  }

}
