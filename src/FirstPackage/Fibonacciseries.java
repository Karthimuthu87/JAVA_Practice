package FirstPackage;

import java.util.Scanner;

public class Fibonacciseries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = sc.nextInt();
        sc.close();
        int prev1 = 0, prev2 = 1, curr;
        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                curr = prev1;
            } else if (i == 1) {
                curr = prev2;
            } else {
                curr = prev1 + prev2;
                prev1 = prev2;
                prev2 = curr;
            }
            System.out.print(curr + " ");
        }
    }
}
