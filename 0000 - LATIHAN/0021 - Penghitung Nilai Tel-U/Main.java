public class Main {
    public static void main(String[] args) {
        abgd(85, 85, 85, 83.5, 85, 85, 82.5, 85);

    }

    private static void konversi(String matkul, double nilai) {
        if (nilai > 80) {
            System.out.printf("Nilai matkul %s mendapatkan nilai : %.2f, dengan Nilai mata kuliah A", matkul, nilai);
        } else if (nilai <= 80 && nilai > 70) {
            System.out.printf("Nilai matkul %s mendapatkan nilai : %.2f, dengan Nilai mata kuliah AB", matkul, nilai);
        } else if (nilai <= 70 && nilai > 65) {
            System.out.printf("Nilai matkul %s mendapatkan nilai : %.2f, dengan Nilai mata kuliah B", matkul, nilai);
        } else if (nilai <= 65 && nilai > 50) {
            System.out.printf("Nilai matkul %s mendapatkan nilai : %.2f, dengan Nilai mata kuliah BC", matkul, nilai);
        } else if (nilai <= 60 && nilai > 50) {

        }
    }

    private static void abgd(double audacity, double blender, double resolve, double figma, double gimp, double inscape,
            double natron, double obs) {
        double nilai = (((audacity * 6.25) + (blender * 18.5) + (resolve * 12.5) + (figma * 18.75) + (gimp * 12.5)
                + (inscape * 12.5) + (natron * 12.5) + (obs * 6.25)) / 100);
        konversi("ABGD", nilai);
    }
}
