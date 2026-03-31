// Program: Number Guessing Game
// Description: User tries to guess a randomly generated number between 1 and 100.
// Concept: Loops, conditions, user input, random numbers

import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int randomNumber = (int)(Math.random() * 100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("🎮 Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");

        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("🎉 Correct! You guessed the number in " + attempts + " attempts.");
            }
        }

        sc.close();
    }
}
