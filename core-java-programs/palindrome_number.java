// Program: Palindrome Number
// Description: Checks whether a number is a palindrome.
// Concept: Loops and number reversal logic

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if (original == reversed)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome");

        sc.close();
    }
}
