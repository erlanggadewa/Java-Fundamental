import java.util.Scanner;

public class UbahLirik {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    String lirik = userInput.nextLine();

    String lirikBerubah = ubahLirik(lirik);

    System.out.println(lirikBerubah);

    userInput.close();
  }

  private static String ubahLirik(String lirik) {

    String[] vowels = { "a", "e", "i", "o", "u" };

    String pengganti = vowels[lirik.length() % 5];

    String lirikBaru = lirik.replaceAll("[aeiouAEIOU]", pengganti);

    return lirikBaru;
  }

}
