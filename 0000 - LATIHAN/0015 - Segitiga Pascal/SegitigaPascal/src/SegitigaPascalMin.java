import java.util.Arrays;
import java.util.Scanner;
class SegitigaPascalMin { //opening of class
    public static void main(String args[]) { //opening of main
        Scanner sc = new Scanner(System.in);
        int n, i, j, a[][], s;
        //taking user's input.
        System.out.println("HOW MANY STEPS?");
        n = sc.nextInt();
        s = n - 1;
        a = new int[n][n];
        //filling the 2D matrix.
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++)
                if (j == 0 || j == i)
                    a[i][j] = 1;
                else
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
        }
        //displaying the Pascal's Triangle as the output.
        System.out.println("\nOUTPUT:\n");
        for (i = 0; i < n; i++) {
            for (j = 0; j <= s; j++)
                System.out.print(" "); //printing blank spaces at the beginning of rows

            s--;

            for (j = 0; j <= i; j++)
                System.out.print(a[i][j] + " ");

            System.out.println();
        }
        System.out.println(Arrays.deepToString(a));
    } //clossing of main
} //closing of class