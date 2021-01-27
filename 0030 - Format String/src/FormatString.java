import java.util.Formatter;

public class FormatString {
    public static void main(String[] args) {
        String name = "memew";
        int age = 20;
        System.out.printf("Nama saya %s, umur saya %d tahun\n", name, age);

//        * conversion  : f = float,    d = integer,    c = character,  s = String, b = boolean
//        ! struktur format = %[argumen_index$][flags][width][.precision]conversion

//        ? [argumen_index$]
        System.out.println("\n\n== [argumen_index$] ==");
        System.out.printf("%1$s , wahai %1$s ternyata umur kamu baru %2$d\n", name, age);

//        ? [flags]
        System.out.println("\n\n== [flags] ==");
        int a = 1;
        int b = 5;
        int hasil = a - b;
        System.out.printf("hasil = %+d\n", hasil);

//        ? [width]
        System.out.println("\n\n== [width] ==");
        int angka = 1000;
        System.out.println("\t\t---INTEGER---");
        System.out.printf("1 ->%d\n", angka);
        System.out.printf("2 ->%6d\n", angka); // align right if positive
        System.out.printf("3 ->%-6d\n", angka); // align left if negative
        System.out.printf("4 ->%+6d\n", angka);
        System.out.printf("5 ->%+-6d\n", angka); // flags can be combined
        System.out.printf("6 ->%15d\n", angka); // same as the bottom one
        System.out.printf("7 ->% 15d\n", angka); // same as the top one
        System.out.printf("8 ->%015d\n", angka); // flags = 0 --> we add leading "0" didepan
        System.out.printf("9 ->%+015d\n", angka); // flags = 0 --> we add leading "0" didepan dan flags + memperbaiki seperti baris code diatas
        int angka2 = +1000000;
        System.out.printf("10->%,15d\n", angka2);
        System.out.printf("11->%+,15d\n", angka2);
        System.out.printf("12->%+-,15d\n", angka2);
        System.out.printf("13->%-,15d\n", angka2);
        System.out.println("\t\t---FLOATING POINT---");
        double angkaKoma = 1.565467564564;
        System.out.printf("%f\n", angkaKoma);
        System.out.printf("%+5f\n", angkaKoma);

//        ? [.precision]
        System.out.println("\n\n== [.precision]==");
        System.out.printf("%.2f\n", angkaKoma);
        System.out.printf("%8.2f\n", angkaKoma); // combined of with and precision
        System.out.printf("%-8.2f\n", angkaKoma); // combined of with and precision
        System.out.printf("%08.2f\n", angkaKoma); // combined of with, precision, and flags
        System.out.printf("%+08.2f\n", angkaKoma); // combined of with, precision, and flags

        System.out.println("\n\n== save format kedalam variabel string ==");
//        * struktur format = %[argumen_index$][flags][width][.precision]conversion
//        ! save format kedalam variabel string
        String nama = "Erlangga";
        double ipk = 3.96564353453;

        String infoFormat = String.format("Nama = %1$s, IPK = %2$+5.2f\n", nama, ipk);
        System.out.println("dengan String.format = " + infoFormat);

//        ! save format kedalam StringBuilder
        StringBuilder builderformat = new StringBuilder();
        Formatter formatBuilder = new Formatter(builderformat);
        formatBuilder.format("Nama = %1$s, IPK = %2$+5.2f\n", nama, ipk);
        System.out.println("dengan formatBuilder = " + builderformat);


    }
}
















