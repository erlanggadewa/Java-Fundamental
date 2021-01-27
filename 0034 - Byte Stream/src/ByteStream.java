import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteStream {
    public static void main(String[] args) throws Exception {
//        * Deklarasi variabel
        FileInputStream fileInput = null;
        FileOutputStream fileOutput = null;

//        * Membuka file
        fileInput = new FileInputStream("cek1.txt");

//        * Membaca file dan menampilkan di console dengan looping
        int data = fileInput.read();
        do {
            System.out.print((char) data);
            data = fileInput.read();
        } while (data != -1); // ! program akan berhenti ketika data bernilai -1, karena tidak ada ASCII -1

//        * Menutup file
        fileInput.close();


//        * Membuat aplikasi pembuka dan penampil
        fileInput = new FileInputStream("cek2.txt");
        fileOutput = new FileOutputStream("outputCek2.txt");
        // ! Menulis outputCek2.txt berdasarkan cek2.txt, hasil bisa di buka file outputCek2.txt
        try {
            int buffers = fileInput.read();
            do {
                fileOutput.write(buffers);
                buffers = fileInput.read();
            } while (buffers != -1);
        } finally {
            fileInput.close();
            fileOutput.close();
        }

//        * Membuat aplikasi diatas tetapi d    engan try with resources
//        ! jika memberikan resources pada try maka program akan otomatis terclose karena beda scope
//        ! hampir mirip seperti for
        try (
                FileOutputStream fileOutput2 = new FileOutputStream("outputCek3.txt");
                FileInputStream fileInput2 = new FileInputStream("cek3.txt")
        ) {
            int buffers = fileInput2.read();
            do {
                fileOutput2.write(buffers);
                buffers = fileInput2.read();
            } while (buffers != -1);
        }


    }
}















