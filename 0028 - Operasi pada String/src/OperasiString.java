import java.util.Scanner;

public class OperasiString {
    public static void main(String[] args) {
        String kata = "saya suka makan pisang";
        System.out.println(kata);
        System.out.println(Integer.toHexString(System.identityHashCode(kata)) + "\n");

//        ! mengambil komponen dari string
        System.out.println(kata.charAt(0) + "\n");

//        ! substring
        kata = kata.substring(10, 15);
        System.out.println(kata + "\n");

//        ! concatenation (concat) -> menggabungkan
        String kalimat1 = kata + " bakwan";
        System.out.println(kalimat1);
        kata = kata + " pisang";
        System.out.println(kata);
        System.out.println(Integer.toHexString(System.identityHashCode(kata)) + "\n");

//        ! concat dengan non string
        int jumlah = 20;
        String kalimat2 = kata + " " + jumlah;
        System.out.println(kalimat2 + "\n");

//        ! lowercase dan uppercase
        System.out.println(kalimat2.toUpperCase());
        System.out.println(kalimat2.toLowerCase() + "\n");

//        ! replace
        String kalimat3 = kalimat2.replace("m", "d");
        System.out.println(kalimat3 + "\n");

//        ! compare
        String motor1 = "royal enfield";
        String motor2 = "Kawasaki w175";
        System.out.println(motor1.compareToIgnoreCase(motor2));
        System.out.println(motor1.compareTo(motor2) + "\n");

//        ! equality (persamaan)
        String kataInput = "test"; // ! ini di string pool
        String kataTest = "test"; // ! ini di string pool
        if (kataInput == kataTest) {
            System.out.println("address sama");
        } else {
            System.out.println("address beda");
        }

        Scanner userInput = new Scanner(System.in);

        System.out.print("masukan input = ");
        kataTest = userInput.next(); // ! tidak di string pool
        if (kataInput == kataTest) {
            System.out.println("address sama");
        } else {
            System.out.println("address beda");
        }
        if (kataInput.equals(kataTest)) {
            System.out.println("kata sama");
        } else {
            System.out.println("kata beda");
        }
    }
}
