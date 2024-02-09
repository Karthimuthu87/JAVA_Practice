package FirstPackage;

import java.util.Scanner;

public class PalindromInteger {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = scanner.nextInt();
        scanner.close();
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(int num) {
        int i = 0;
        int j = num;

        while (i > 0) {
            int value = num%10;
            i= i*10+value;
            num /= 10;
        }
         return i == j;
    }
}