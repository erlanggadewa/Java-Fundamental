public class Modul3Soal2 {
    public static void main(String[] args) {
        int uangSaku = 2500000;
        int pengeluaran1 = 100000;
        int pengeluaran2 = 85000;
        int pengeluaran3 = 101000;
        int pengeluaran4 = 120000;
        int pengeluaran5 = 50000;
        int pengeluaran6 = 75000;
        int sisaSaku = uangSaku - (pengeluaran1 + pengeluaran2 + pengeluaran3 + pengeluaran4 + pengeluaran5 + pengeluaran6) ;
        System.out.println("Total uang saku \t\t= " + uangSaku + " rupiah");
        System.out.println("Pengeluaran hari pertama \t= " + pengeluaran1 + " rupiah");
        System.out.println("Pengeluaran hari kedua \t\t= " + pengeluaran2 + " rupiah");
        System.out.println("Pengeluaran hari ketiga \t= " + pengeluaran3 + " rupiah");
        System.out.println("Pengeluaran hari keempat \t= " + pengeluaran4 + " rupiah");
        System.out.println("Pengeluaran hari kelima \t= " + pengeluaran5 + " rupiah");
        System.out.println("Pengeluaran hari keenam \t= " + pengeluaran6 + " rupiah");
        System.out.println("-------------------------------------------------------");
        System.out.println("Sisa uang saku \t\t\t= " + sisaSaku + " rupiah");
    }
}
