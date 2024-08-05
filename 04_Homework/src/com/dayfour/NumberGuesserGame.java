package com.dayfour;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesserGame {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean playAgain = true;

        while (playAgain) {
            playGame(input);
            System.out.print("Do you want to play the game again? (yes/no): ");
            String response = input.nextLine();
            playAgain = response.equals("yes");
        }

        input.close();
    }

    public static void playGame(Scanner input) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess = 0;
        final int MAX_ATTEMPTS = 10;

        System.out.println("Random number generated: " + randomNumber);

        while (attempts < MAX_ATTEMPTS) {
            System.out.print("Guess a number: ");
            guess = input.nextInt();
            input.nextLine(); // Consume newline

            attempts++;

            if (guess < randomNumber) {
                System.out.println("Sorry, too low");
            } else if (guess > randomNumber) {
                System.out.println("Sorry, too high");
            } else {
                System.out.println("You won in attempt: " + attempts);
                return;
            }
        }

        System.out.println("You've reached the maximum number of attempts " + MAX_ATTEMPTS);
    }
}
