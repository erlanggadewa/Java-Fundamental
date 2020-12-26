import java.util.Arrays;

public class PengenalanString {
    public static void main(String[] args) {
        char[] kata1 = {'h', 'a', 'l', 'l', 'o'};
        String kata2 = "hallo";
        System.out.println("char = " + Arrays.toString(kata1));
        System.out.println("String = " + kata2);

        System.out.println("\nkomponen pertama dari char[] = " + kata1[0]);
        System.out.println("komponen pertama dari String = " + kata2.charAt(0));

        kata1[0] = 'c';
        System.out.println("\nkata char[] baru = " + Arrays.toString(kata1));
        //! kata2.charAt(0) = "c"; <---- tidak bisa
        //? kita tidak dapat memodifikasi isi dari string secara langsung,
        //? tapi kita dapat memanipulasi isi dari string secara tidak langsung.
        System.out.println("kata string baru = " + "c" + kata2.substring(1, 5)); //! akan diambil string pada 1 <= index < 5

    }
}