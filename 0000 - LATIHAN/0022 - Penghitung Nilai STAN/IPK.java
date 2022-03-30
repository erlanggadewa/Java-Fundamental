import java.util.*;

public class IPK {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        ArrayList<String> arrAngka = new ArrayList<>();
        String input1, input2;

        // * NB : Masukan -1 dan -1 pada input SKS dan NILAI untuk mengakhiri program

        int nomor = 1;
        do {
            System.out.print("Masukan SKS (spasi) NILAI (" + nomor++ + ") = ");
            input1 = userInput.next();
            input2 = userInput.next();
            if (input1.equalsIgnoreCase("-1") || input2.equalsIgnoreCase("-1")) {
                break;
            }
            arrAngka.add(input1);
            arrAngka.add(input2);

        } while (true);
        ipk(arrAngka);
    }

    private static void ipk(ArrayList<String> arrAngka) {
        double total = 0, sks = 0;
        arrAngka = konversi(arrAngka);

        for (int i = 1; i < arrAngka.size(); i += 2) {
            total = total + (Double.parseDouble(arrAngka.get(i - 1)) * Double.parseDouble(arrAngka.get(i)));
            sks += Double.parseDouble(arrAngka.get(i - 1));
        }
        System.out.println("\nSELAMAT IPK ANDA : " + total / sks);

    }

    private static ArrayList<String> konversi(ArrayList<String> arrAngka) {
        for (int i = 1; i < arrAngka.size(); i += 2) {
            switch (arrAngka.get(i)) {
                case "A":
                case "a":
                    arrAngka.set(i, "4");
                    break;

                case "A-":
                case "a-":
                    arrAngka.set(i, "3.7");
                    break;

                case "B":
                case "b":
                    arrAngka.set(i, "3");
                    break;

                case "BC":
                case "bc":
                    arrAngka.set(i, "2.5");
                    break;

                case "C":
                case "c":
                    arrAngka.set(i, "2");
                    break;

                case "D":
                case "d":
                    arrAngka.set(i, "1");
                    break;

                case "E":
                case "e":
                    arrAngka.set(i, "0");
                    break;
            }
        }
        return arrAngka;
    }
}
