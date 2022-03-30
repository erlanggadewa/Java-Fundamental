public class Soal3 {
  public static void main(String[] args) {
    luasPermukaan(7, 5);
  }

  private static void luasPermukaan(int jari, int tinggi) {
    double A = Math.PI * jari * (jari + Math.sqrt((tinggi * tinggi) + (jari * jari)));

    // System.out.println("Hasilnya = " + A);
    System.out.printf("Hasilnya = %.3f", A);
  }
}