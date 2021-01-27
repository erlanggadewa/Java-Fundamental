import java.util.Scanner;

public class ExceptionPadaMethod {
    public static void main(String[] args) {
        int[] arrAngka = {1, 2, 3, 4};

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukan index : ");
        int index = userInput.nextInt();

        // ! Exception di dalam method
        System.out.println("----Exception di dalam method----");
        int hasil = ambilData1(arrAngka, index);
        System.out.printf("Nilai pada index %d, adalah %d\n\n", index, hasil);

        // ! Exception throws by method
        System.out.println("----Exception throws by method----");
        try {
            int hasil2 = ambilData2(arrAngka, index);
            System.out.printf("Nilai pada index %d, adalah %d\n", index, hasil2);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.print("\n");

    }

    private static int ambilData1(int[] arr, int index) {
        int hasil = 0;
        try {
            hasil = arr[index];
        } catch (Exception e) {
            System.out.println(e);
        }
        return hasil;
    }

    private static int ambilData2(int[] arr, int index) throws Exception {
        return arr[index];
    }
}
















