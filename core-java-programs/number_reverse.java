// Program: Reverse a Number
// Description: Reverses a given number using loop.
// Concept: Loops and remainder logic

public class NumberReverse {
    public static void main(String[] args) {
        int num = 1234, reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
