package com.day9.objectCalisthenics;

import java.util.Random;
import java.util.Scanner;

public class Copy {  //PigDiceGame
    public static void main(String[] args) {
        ScannerInput input = new ScannerInput();
        RandomDie random = new RandomDie();
        TotalScore totalScore = new TotalScore();
        Turn turn = new Turn(1);

        while (totalScore.isLessThan(20)) {
            System.out.println("Turn " + turn.value());
            TurnScore turnScore = new TurnScore();
            TurnOver turnOver = new TurnOver();

            calculateTurn(turnOver, input, random, turnScore, totalScore);
            turn.next();
        }
        
        System.out.println("You finished in " + (turn.value() - 1) + " turns!");
        System.out.println("Game over!");
        input.close();
    }

    private static void calculateTurn(TurnOver turnOver, ScannerInput input, RandomDie random, TurnScore turnScore, TotalScore totalScore) {
        while (!turnOver.isOver()) {
            System.out.print("Roll or hold? (r/h): ");
            Choice choice = input.getChoice();
            ifChoiceIsRoll(choice, random, turnOver, turnScore, totalScore);
        }
    }

    private static void ifChoiceIsRoll(Choice choice, RandomDie random, TurnOver turnOver, TurnScore turnScore, TotalScore totalScore) {
        if (choice.isRoll()) {
            Die die = random.roll();
            System.out.println("Die: " + die.value());
            ifDieEqualsOne(die, turnOver, turnScore);
        }
        ifChoiceIsHold(choice, turnScore, totalScore, turnOver);
    }

    private static void ifDieEqualsOne(Die die, TurnOver turnOver, TurnScore turnScore) {
        if (die.isOne()) {
            System.out.println("Turn over. No score.");
            turnOver.end();
            return;
        }
        turnScore.add(die);
    }

    private static void ifChoiceIsHold(Choice choice, TurnScore turnScore, TotalScore totalScore, TurnOver turnOver) {
        if (choice.isHold()) {
            System.out.println("Score for turn: " + turnScore.value());
            totalScore.add(turnScore);
            System.out.println("Total score: " + totalScore.value());
            turnOver.end();
            return;
        }
        if (!choice.isValid()) {
            System.out.println("Invalid choice. Please enter 'r' to roll or 'h' to hold.");
        }
    }

    private static class Turn {
        private int value;

        public Turn(int initialValue) {
            this.value = initialValue;
        }

        public void next() {
            value++;
        }

        public int value() {
            return value;
        }
    }

    private static class TurnScore {
        private int value;

        public TurnScore() {
            this.value = 0;
        }

        public void add(Die die) {
            value += die.value();
        }

        public int value() {
            return value;
        }
    }

    private static class TotalScore {
        private int value;

        public TotalScore() {
            this.value = 0;
        }

        public void add(TurnScore turnScore) {
            value += turnScore.value();
        }

        public int value() {
            return value;
        }

        public boolean isLessThan(int target) {
            return value < target;
        }
    }

    private static class TurnOver {
        private boolean isOver;

        public TurnOver() {
            this.isOver = false;
        }

        public void end() {
            isOver = true;
        }

        public boolean isOver() {
            return isOver;
        }
    }

    private static class Choice {
        private final String value;

        public Choice(String value) {
            this.value = value;
        }

        public boolean isRoll() {
            return value.equals("r");
        }

        public boolean isHold() {
            return value.equals("h");
        }

        public boolean isValid() {
            return value.equals("r") || value.equals("h");
        }
    }

    private static class Die {
        private final int value;

        public Die(int value) {
            this.value = value;
        }

        public int value() {
            return value;
        }

        public boolean isOne() {
            return value == 1;
        }
    }

    private static class ScannerInput {
        private final Scanner input;

        public ScannerInput() {
            this.input = new Scanner(System.in);
        }

        public Choice getChoice() {
            return new Choice(input.nextLine());
        }

        public void close() {
            input.close();
        }
    }

    private static class RandomDie {
        private final Random random;

        public RandomDie() {
            this.random = new Random();
        }

        public Die roll() {
            return new Die(random.nextInt(6) + 1);
        }
    }
}
