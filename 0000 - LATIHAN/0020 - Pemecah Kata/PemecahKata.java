import java.lang.StringBuilder;
import java.util.Scanner;

public class PemecahKata {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukan nama : ");
        String inputNama = userInput.nextLine();
        StringBuilder nama = new StringBuilder(inputNama);
        char[] vowels = {'a', 'i', 'u', 'e', 'o', 'A', 'I', 'U', 'E', 'O'};
        char[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w',
                'x', 'y', 'z', 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W',
                'X', 'Y', 'Z'};
        try {
            int i = nama.length() - 1;
            for (; i >= 0; i--) {
                int multiVowel = 0;
                for (int j = 0; j < vowels.length; j++) {
                    if ((i > 0) && (nama.charAt(i) == vowels[j]) && (nama.charAt(i - 1) != ' ')) {
                        // ! check for multi-vowel (exp : eeerlang)
                        forMultiVowelCheck:
                        for (int k = i; k >= 0; k--) {
                            for (int l = 0; l < consonants.length; l++) {
                                if (nama.charAt(k) == consonants[l])
                                    break forMultiVowelCheck;
                            }
                            for (int m = 0; m < vowels.length; m++) {
                                if (nama.charAt(k) == (vowels[m])) {
                                    multiVowel++;
                                }
                            }
                        }
                        int sukuN = i - multiVowel;
                        if (sukuN > 0) {
                            nama.insert(sukuN, "-");
                            i = sukuN;
                        }
                    }
                }
            }
            // ! delete "-" on space
            for (int p = 0; p < nama.length(); p++) {
                if (nama.charAt(p) == ' ' && nama.charAt(p + 1) == '-') {
                    nama.deleteCharAt(p + 1);
                }
            }
        } finally {
            System.out.println(nama);
        }
    }
}