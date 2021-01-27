import java.io.FileInputStream;

public class IOStream {
    public static void main(String[] args) {

        try {
            FileInputStream fileInput1 = new FileInputStream("text1.txt");
            System.out.println("text1.txt tersedia / ditemukan");
            System.out.print((char) fileInput1.read());
            System.out.print((char) fileInput1.read());
            System.out.print((char) fileInput1.read());
            System.out.print((char) fileInput1.read());
            System.out.print((char) fileInput1.read());
        } catch (Exception e) {
            System.out.println("text2.txt tidak ditemukan");
            System.out.println(e);
        }


        System.out.print("\n\n");

        // ! text2.txt tidak dapat ditemukan karena penempatan dokumennya
        try {
            FileInputStream fileInput2 = new FileInputStream("text2.txt");
            System.out.println("text2.txt tersedia / ditemukan");
            System.out.print((char) fileInput2.read());
            System.out.print((char) fileInput2.read());
            System.out.print((char) fileInput2.read());
            System.out.print((char) fileInput2.read());
            System.out.print((char) fileInput2.read());
        } catch (Exception e) {
            System.out.println("text2.txt tidak ditemukan");
            System.out.println(e);
        }

    }
}
