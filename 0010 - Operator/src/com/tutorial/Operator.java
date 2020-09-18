package com.tutorial;

public class Operator {
    public static void main (String[] Args){

        //OPERATOR ASSIGNMENT

        // ASSIGNMENT OPERATOR PENJUMLAH
        int a = 12;
        System.out.println("Nilai A = " + a );
        a += 8; // a = a + 8
        System.out.println("Nilai akhir A = " + a);

        System.out.println(); //enter baris

        //ASSIGNMENT OPERATOR PENGURANGAN
        int b = 98;
        System.out.println("Nilai B = " + b);
        b -= 18;
        System.out.println("Nilai akhir B = " + b);

        System.out.println(); //enter baris

        //ASSIGNMENT PERKALIAN
        int c = 3;
        System.out.println("Nilai C = " + c);
        c *= 4;
        System.out.println("Nilai akhir C = " + c);

        System.out.println(); //enter baris

        //ASSIGNMENT PEMBAGIAN
        int d = 10;
        System.out.println("Nilai D = " + d);
        d *= 2;
        System.out.println("Nilai akhir D = " + d);

        System.out.println(); //enter baris

        //ASSINGMENT MODULUS
        int e = 11;
        System.out.println("Nilai E = " + e);
        e %= 2;
        System.out.println("Nilai akhir E = " + e);

        System.out.println(); //enter baris

        //OPERATOR KOMPARASI
        System.out.println("****************************************\n");

        int f,g;
        boolean hasilkomparasi;

        //Operator equal atau persamaan (==)
        System.out.println("----- PERSAMAAN");
        f = 10;
        g = 10;
        hasilkomparasi = (f==g);
        System.out.printf("%d == %d --> %s \n", f, g, hasilkomparasi);
        f = 10;
        g = 12;
        hasilkomparasi = (f==g);
        System.out.printf("%d == %d --> %s \n", f, g, hasilkomparasi);

        System.out.println(); //enter baris

        //Operator not equal atau pertidaksamaan (!=)
        System.out.println("----- PERTIDAKSAMAAN");
        f = 10;
        g = 10;
        hasilkomparasi = (f!=g);
        System.out.printf("%d != %d --> %s \n", f, g, hasilkomparasi);
        f = 10;
        g = 12;
        hasilkomparasi = (f!=g);
        System.out.printf("%d != %d --> %s \n", f, g, hasilkomparasi);

        System.out.println(); //enter baris

        //Operator less than atau kurang dari (<)
        System.out.println("----- KURANG DARI");
        f = 10;
        g = 11;
        hasilkomparasi = (f<g);
        System.out.printf("%d < %d --> %s \n", f, g, hasilkomparasi);
        f = 10;
        g = 10;
        hasilkomparasi = (f<g);
        System.out.printf("%d < %d --> %s \n", f, g, hasilkomparasi);

        System.out.println(); //enter baris

        //Operator greater than atau kurang dari (>)
        System.out.println("----- LEBIH DARI");
        f = 10;
        g = 9;
        hasilkomparasi = (f>g);
        System.out.printf("%d > %d --> %s \n", f, g, hasilkomparasi);
        f = 10;
        g = 10;
        hasilkomparasi = (f>g);
        System.out.printf("%d > %d --> %s \n", f, g, hasilkomparasi);

        System.out.println(); //enter baris

        //Operator less than equal atau kurang dari sama dengan (<=)
        System.out.println("----- KURANG DARI SAMA DENGAN");
        f = 10;
        g = 11;
        hasilkomparasi = (f<=g);
        System.out.printf("%d <= %d --> %s \n", f, g, hasilkomparasi);
        f = 10;
        g = 10;
        hasilkomparasi = (f<=g);
        System.out.printf("%d <= %d --> %s \n", f, g, hasilkomparasi);
        f = 10;
        g = 9;
        hasilkomparasi = (f<=g);
        System.out.printf("%d <= %d --> %s \n", f, g, hasilkomparasi);

        System.out.println(); //enter baris

        //Operator great than equal atau lebih dari sama dengan (>=)
        System.out.println("----- LEBIH DARI SAMA DENGAN");
        f = 10;
        g = 11;
        hasilkomparasi = (f>=g);
        System.out.printf("%d >= %d --> %s \n", f, g, hasilkomparasi);
        f = 10;
        g = 10;
        hasilkomparasi = (f>=g);
        System.out.printf("%d >= %d --> %s \n", f, g, hasilkomparasi);
        f = 10;
        g = 9;
        hasilkomparasi = (f>=g);
        System.out.printf("%d >= %d --> %s \n", f, g, hasilkomparasi);

        System.out.println(); //enter baris

        // OPERATOR LOGIKA (operasi yang dilakukan pada tipe data boolean)
        // OR , AND , XOR

        System.out.println("****************************************\n");

        boolean h, i, j;

        // OR -> atau  (||)
        System.out.println("===== OR =====");
        h = true;
        i = true;
        j = (h || i);
        System.out.println(h + " || " + i + " = " + j);
        h = true;
        i = false;
        j = (h || i);
        System.out.println(h + " || " + i + " = " + j);
        h = false;
        i = true;
        j = (h || i);
        System.out.println(h + " || " + i + " = " + j);
        h = false;
        i = false;
        j = (h || i);
        System.out.println(h + " || " + i + " = " + j);

        System.out.println(); // enter baris

        //AND --> dan (&&)
        System.out.println("===== AND =====");
        h = true;
        i = true;
        j = (h && i);
        System.out.println(h + " && " + i + " = " + j);
        h = true;
        i = false;
        j = (h && i);
        System.out.println(h + " && " + i + " = " + j);
        h = false;
        i = true;
        j = (h && i);
        System.out.println(h + " && " + i + " = " + j);
        h = false;
        i = false;
        j = (h && i);
        System.out.println(h + " && " + i + " = " + j);

        System.out.println();// enter baris

        //XOR --> exlusive or (^)
        System.out.println("===== XOR =====");
        h = true;
        i = true;
        System.out.println(h + " ^ " + i + " = " + j);
        h = true;
        i = false;
        System.out.println(h + " ^ " + i + " = " + j);
        h = false;
        i = true;
        System.out.println(h + " ^ " + i + " = " + j);
        h = false;
        i = false;
        System.out.println(h + " ^ " + i + " = " + j);
        System.out.println(); //enter baris

        //NOT --> negasi ( flipping (!))
        System.out.println("===== NEGASI (!) =====");
        h = true;
        j = !h;
        System.out.println(h + " ---> (!) = " + j);
        i = false;
        j = !i;
        System.out.println(i + " ---> (!) = " + j);




































    }
}
