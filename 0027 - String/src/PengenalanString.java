import java.util.Arrays;

public class PengenalanString {
    public static void main(String[] args) {
        char[] kata1 = {'h', 'a', 'l', 'l', 'o'};
        String kata2 = "hallo";
        System.out.println("char = " + Arrays.toString(kata1));
        System.out.println("String = " + kata2);
        printAddress(kata2, kata2);

        System.out.println("\nkomponen pertama dari char[] = " + kata1[0]);
        System.out.println("komponen pertama dari String = " + kata2.charAt(0));

        kata1[0] = 'c';
        System.out.println("\nkata char[] baru = " + Arrays.toString(kata1));
        //! kata2.charAt(0) = "c"; <---- tidak bisa
        //? kita tidak dapat memodifikasi isi dari string secara langsung,
        //? tapi kita dapat memanipulasi isi dari string secara tidak langsung.
        System.out.println("kata string baru = " + "c" + kata2.substring(1, 5) + "\n"); //! akan diambil string pada 1 <= index < 5

        // ? Memori string pada java (string pool)
        String str1 = "hallo";
        String str2 = "test";
        String str3 = "testing";
        printAddress("str1", str1);
        printAddress("str2", str2);
        printAddress("str3", str3);
        str3 = str3.substring(0, 4);
        printAddress("str3", str3);

        String s1 = "foobar";
        String s2 = "foobar";
        System.out.println(s1 == s2);      // true
        s2 = new String("foobar");
        System.out.println(s1 == s2);      // false
        System.out.println(s1.equals(s2)); // true
        /*
        ! Kesimpulan
            1. String di java immutabble
            2. String yang ada di sting pool akan reusable, sehingga lebih menghemat memory
            3. Membuat string dengan method baru, maka dia akan ditaruh di heap memory bukan di string pool
         */


    }

    private static void printAddress(String nama, String data) {
        int address = System.identityHashCode(data);
        System.out.println(nama + " -> " + data + "\t||\t address = " + Integer.toHexString(address));

    }
}