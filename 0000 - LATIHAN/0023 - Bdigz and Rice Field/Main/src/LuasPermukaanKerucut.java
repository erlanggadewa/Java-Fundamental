import java.util.*;

public class LuasPermukaanKerucut {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    int jari = userInput.nextInt();

    int tinggi = userInput.nextInt();
    double hasil = calcLuasPermukaan(tinggi, jari);

    System.out.printf("%.3f\n", hasil);
    userInput.close();
  }

  private static double calcLuasPermukaan(int tinggi, int jari) {
    double hasil = Math.PI * jari * (jari + Math.sqrt((tinggi * tinggi) + (jari * jari)));

    return hasil;
  }
}