package com.company;

public class Main {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Hallo");
        printData(builder);

//        ! append
        System.out.println("== append ==");
        builder.append(" Jogja");
        printData(builder);

//        ! insert
        System.out.println("== insert ==");
        builder.insert(5, " Kota");
        printData(builder);

//        ! deleteChartAt
        System.out.println("== deleteCharAt ==");
        builder.deleteCharAt(0);
        printData(builder);

//        ! delete
        System.out.println("== delete ==");
        builder.delete(0, 5);
        printData(builder);

//        ! setCharAt -> mengubah pada index tertentu
        System.out.println("== setCharAt ==");
        builder.setCharAt(5, 'Y');
        printData(builder);

//        ! replace
        System.out.println("== replace ==");
        builder.replace(5, 10, "Jakarta");
        printData(builder);

//        ! indexOf
        System.out.println("== indexOf ==");
        System.out.println("berada pada index ke " + builder.indexOf("Jakarta") + "\n");

//        ! trinToSize -> mengurangi penyimpanan kapasitas
        System.out.println("== trimToSize ==");
        builder.trimToSize();
        printData(builder);

//        ! reverse
        System.out.println("== reverse ==");
        builder.reverse();
        printData(builder);

//        ! Casting ke String
        System.out.println("== casting to string ==");
        String kalimat = builder.toString();
        System.out.println(kalimat + " || Alamat -> " + Integer.toHexString(System.identityHashCode(kalimat)));
    }

    private static void printData(StringBuilder builder) {
        System.out.println("data = " + builder);
        System.out.println("panjang data = " + builder.length());
        System.out.println("kapasitas data = " + builder.capacity());
        int address = System.identityHashCode(builder);
        System.out.println("address = " + Integer.toHexString(address));
        System.out.print("\n");
    }
}
