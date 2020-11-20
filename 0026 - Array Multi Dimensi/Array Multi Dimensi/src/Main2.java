
import java.util.*;

public class Main2 {
    public static void main(String[] args) {
//        * ARRAY MULTIDIMENSI LANJUTAN
        int[][] array2D_1 = {
                {'A', 'B', 'C'},
                {'D', 'E'}
        };
//        * ALAMAT array2D_1
        System.out.println("Alamat array2D kulit luar = " + Arrays.deepToString(array2D_1)); /* kenapa berubah jadi angka, karena ini char */
        System.out.println("Alamat array2D kulit luar = " + array2D_1);
        System.out.println("Alamat array2D kulit dalam = " + Arrays.toString(array2D_1));
        System.out.println("Alamat array2D index 0 di kulit terluar = " + array2D_1[0]);
        System.out.println("Alamat array2D index 1 di kulit terluar = " + array2D_1[1] + "\n");

        char[] arrayChar1 = {'V', 'W', 'X'};
        char[] arrayChar2 = {'Y', 'Z'};
        char[][] array2D_2 = {
                arrayChar1,
                arrayChar2
        };
//        ? MAKA ALAMAT ARRAY AKAN TETAP SAMA, KARENA ARRAY DALAM JAVA BERSIFAT SEBAGAI OBJECT
        System.out.println("Alamat arrayChar1 kulit luar = " + arrayChar1);
        System.out.println("Alamat arrayChar2 kulit luar = " + arrayChar2);
        System.out.println("Alamat array2D_2 kulit dalam = " + Arrays.toString(array2D_2));
        System.out.println("Alamat array2D_2 index 0 di kulit terluar = " + array2D_2[0]);
        System.out.println("Alamat array2D_2 index 1 di kulit terluar = " + array2D_2[1]);
        System.out.println("Isi arrayChar1 = " + arrayChar1); /* jika seperti ini akan langsung print isi char nya, bukan alamatnya */
        System.out.println("Isi arrayChar2 = " + arrayChar2); /* jika seperti ini akan langsung print isi char nya, bukan alamatnya */
        System.out.println(System.identityHashCode(arrayChar1)); /* hash code akan menampilakn kembalian dalam bentuk integer*/
        System.out.println(Arrays.hashCode(arrayChar2)); /* hash code akan menampilakn kembalian dalam bentuk integer*/
        System.out.println(Integer.toHexString(System.identityHashCode(arrayChar1))); /* alamat arraynya tetap sama*/
        System.out.println(Integer.toHexString(System.identityHashCode(arrayChar2))); /* alamat arraynya tetap sama*/
    }
}
