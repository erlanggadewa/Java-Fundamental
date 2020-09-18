import java.util.Stack;
import java.util.Scanner;

class menara_hanoi_stack_meine {
    static Stack<Integer>[] menara = new Stack[4];
    static int n;

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        menara[1] = new Stack<Integer>();
        menara[2] = new Stack<Integer>();
        menara[3] = new Stack<Integer>();

        System.out.println();
        artMenaraHanoi();
        System.out.println("PROSES MENARA HANOI");

        System.out.println("\nATURAN ::");
        System.out.println("\t-> Terdapat 3 menara dan N tumpukan diska (N adalah total diska)");
        System.out.println("\t-> Tumpukan diska awal terdapat di Menara 1");
        System.out.println("\t-> Tumpukan diska harus dipindah ke Menara 3");
        System.out.println("\t-> Menara 2 digunakan sebagai bantuan dalam proses memindah diska");
        System.out.println("\t-> Setiap pemindahan hanya bisa 1 buah diska");
        System.out.println("\t-> Diska hanya boleh dipindah dari yang teratas");
        System.out.println("\t-> Diska bernilai kecil harus di atas diska bernilai besar");

        System.out.print("\nMASUKKAN JUMLAH DISKA\nIN :: ");
        final int num = in.nextInt();
        System.out.println();
        n = num;

        System.out.println("\nOUT :: ");
        mhs(num);

        System.out.println("TOTAL PROSES EFEKTIF :: " + ((int) Math.pow(2, n) - 1));

        in.close();
    }

    static void artMenaraHanoi() {
        System.out.println();
        System.out.println("      |      _   _  __  _  _  ___  _");
        System.out.println("     / \\    | |_| |/  \\| \\| |/   \\| |   ____   _____  __   ____ _  __");
        System.out.println("    /   \\   |  _  |  # |    |  #  | |  / ___|_|_   _|/  \\ /  __| |/ /");
        System.out.println("    | # |   |_| |_|_/\\_|_|\\_|\\___/|_|  |____  | | | |  # |  |__|    \\");
        System.out.println("    |   |   /#//#/#//#//#//#//##/ /#/    |____/ |_| |_/\\_|\\____|_|\\__\\");
        System.out.println("    | # |                                /###/  /#//#//#/ /###//#//##/");
        System.out.println("    |  _|__   ____   _____  __  ____   ______  __  _____   ______");
        System.out.println("    | /___/\\ /___/\\ /____/\\/_/\\/___/| /_____/\\/_/|/____/| /_____/\\");
        System.out.println("    |/    \\ /    \\ /  _  \\|  \\/    | /  _   \\|  |/  __ | /  _   \\ \\");
        System.out.println("    |      |      |  |_|  |    /|  |/  / |   |     /| \\|/  / |   | |");
        System.out.println("    |   |     |   |  ____/|   | |  |   |/    |    | |  |   |/    | |");
        System.out.println("    \\__/ \\___/\\___|\\_____|\\___|  \\_|\\_____|\\_|\\___|/    \\_____|\\_|/");
        System.out.println(
                "    /#/ /##/ /###/ /####/ /###/  /#//####/ /#//###/     /####/ /#/\n   /#/ /##/ /###/ /####/ /###/  /#//####/ /#//###/     /####/ /#/");
        System.out.println("\n");
    }

    static void mhs(final int n) {
        for (int a = n; a > 0; a--)
            menara[1].push(a);

        System.out.println("-> TUMPUKAN AWAL DISKA");
        out();

        System.out.println("-> PROSES PEMINDAHAN DISKA");
        pindah(n, 1, 2, 3);
    }

    static void pindah(final int n, final int a, final int b, final int c) {
        if (n > 0) {
            pindah(n - 1, a, c, b);

            final int d = menara[a].pop();
            menara[c].push(d);

            out();
            pindah(n - 1, b, a, c);
        }
    }

    static void out() {
        System.out.println("                       MENARA 1    MENARA 2    MENARA 3");
        System.out.println("                          |           |           |");
        System.out.println("                         / \\         / \\         / \\");

        for (int a = n - 1; a >= 0; a--) {
            System.out.print("Tumpukan tingkat " + (a + 1) + " ");
            String menara1 = " ", menara2 = " ", menara3 = " ";

            try {
                menara1 = String.valueOf(menara[1].get(a));
            } catch (final Exception e) {
            }

            try {
                menara2 = String.valueOf(menara[2].get(a));
            } catch (final Exception e) {
            }

            try {
                menara3 = String.valueOf(menara[3].get(a));
            } catch (final Exception e) {
            }

            System.out.println("\t/ " + menara1 + " \\       / " + menara2 + " \\       / " + menara3 + " \\");

            if (a != 0)
                System.out.println("                        |   |       |   |       |   |");

            else if (a == 0)
                System.out.println("                       _|___|_     _|___|_     _|___|_");
        }

        System.out.println("\n");
    }
}