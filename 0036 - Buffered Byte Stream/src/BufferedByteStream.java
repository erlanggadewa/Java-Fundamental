import java.io.*;

public class BufferedByteStream {
    public static void main(String[] args) throws IOException {
        long waktuStart, waktuEnd;

        FileInputStream byteInput = new FileInputStream("input.txt");
        System.out.println("Panjang dokumen : " + byteInput.available() + "\n");

        // * Menghitung kecepatan pembacaan dari drive
        System.out.println("---- DRIVE ----");
        waktuStart = System.nanoTime();
        System.out.println(byteInput.readAllBytes());
        waktuEnd = System.nanoTime();
        System.out.println("Selisih waktu dengan drive : " + (waktuEnd - waktuStart) + "\n");
        byteInput.close();


        FileInputStream byteInput2 = new FileInputStream("input.txt");

        // * Menghitung kecepatan pembacaan dari memori
        System.out.println("---- MEMORY ----");
        BufferedInputStream memoriInput = new BufferedInputStream(byteInput2);
        memoriInput.mark(-2);
        waktuStart = System.nanoTime();
        System.out.println(memoriInput.readAllBytes());
        waktuEnd = System.nanoTime();
        System.out.println("Selisih waktu dengan memori  : " + (waktuEnd - waktuStart));
        memoriInput.reset();

        // * Baca ulang
        byte[] data = memoriInput.readAllBytes();
        String kata = new String(data);
        System.out.println(kata);

        // * Menulis dari memori ke output.txt
        FileOutputStream byteOutput = new FileOutputStream("output.txt");
        BufferedOutputStream memoriOutput = new BufferedOutputStream(byteOutput);

        // * write data berupa byte
        memoriOutput.write(data,0, data.length);
        memoriOutput.flush();

        // * close
        memoriInput.close();
        memoriOutput.close();
        byteOutput.close();
        byteInput2.close();


    }
}












