import java.io.*;

public class CharacterStream {
    public static void main(String[] args) throws IOException {

        // * Membuat file
        FileInputStream byteInput = new FileInputStream("input.txt");
        FileReader charInput = new FileReader("input.txt");

        FileOutputStream byteOutput = new FileOutputStream("byteOutput.txt");
        FileWriter charOutput = new FileWriter("charOutput.txt");

        int buffers;

        // * Membaca file
        // ? untuk mencetak data ke FileIOutputStream
        buffers = byteInput.read();
        do {
            System.out.print((char) buffers);
            byteOutput.write(buffers);
            buffers = byteInput.read();
        } while (buffers != -1);

        System.out.println("\n");

        // ? untuk mencetak data ke FileWriter
        int buffers2 = charInput.read();
        do {
            System.out.print((char) buffers2);
            charOutput.write(buffers2);
            buffers2 = charInput.read();
        } while (buffers2 != -1);

        // * close dokument
        // ! important, kita harus mengclose dokument, jika tidak makan akan membuat resources leak dan charOutput.txt akan hanya menampilkan dokument kosong
        byteOutput.close();
        byteInput.close();
        charInput.close();
        charOutput.close();
    }
}
