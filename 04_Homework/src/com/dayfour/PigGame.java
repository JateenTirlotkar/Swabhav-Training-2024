package com.dayfour;
import java.util.Random;
import java.util.Scanner;

public class PigGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int totalScore = 0;
        int turn = 1;

        while (totalScore < 20) {
            System.out.println("TURN " + turn);
            int turnScore = 0;
            boolean turnOver = false;

            while (!turnOver) {
                System.out.print("Roll or hold? (r/h): ");
                String choice = input.nextLine();

                if (choice.equals("r")) {
                    int die = random.nextInt(6) + 1;
                    System.out.println("Die: " + die);

                    if (die == 1) {
                        System.out.println("Turn over. No score.");
                        turnOver = true;
                    } else {
                        turnScore += die;
                    }
                } else if (choice.equals("h")) {
                    System.out.println("Score for turn: " + turnScore);
                    totalScore += turnScore;
                    System.out.println("Total score: " + totalScore);
                    turnOver = true;
                } else {
                    System.out.println("Invalid choice. Please enter 'r' to roll or 'h' to hold.");
                }
            }
            turn++;
        }//first while

        System.out.println("You finished in " + (turn - 1) + " turns!");
        System.out.println("Game over!");
        input.close();
    }
}
