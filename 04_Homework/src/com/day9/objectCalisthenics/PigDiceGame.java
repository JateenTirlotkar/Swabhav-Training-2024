package com.day9.objectCalisthenics;

import java.util.*;

class Game {
	int turnScore = 0;
	int turn = 1;
	int totalScore = 0;

}

public class PigDiceGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		Game game = new Game();
		boolean turnOver = false;
		String choice = null;
		int die = 0;

		while (game.turnScore < 20) {
			System.out.println("Turn " + game.turn);
			int turnScore = 0;
			turnOver = false;

			calculateTurn(turnOver, input, die, choice, random, game);
			System.out.println("You finished in " + (game.turn - 1) + " turns!");
			System.out.println("Game over!");
			input.close();

		}

	}

	public static void calculateTurn(boolean turnOver, Scanner input, int die, String choice, Random random,
			Game game) {
		while (!turnOver) {
			System.out.println("Roll or hold? (r/h): ");
			choice = input.nextLine();
			ifChoiceIsRoll(die, choice, random, turnOver, die, game);
			game.turn++;
		}

	}

	public static void ifChoiceIsRoll(int die, String choice, Random random, boolean turnOver, int turnScore,
			Game game) {
		if (choice.equals("r")) {
			die = random.nextInt(6) + 1;
			System.out.println("Die: " + die);
		}
		ifDieEqualsOne(die, turnOver, choice, game);
	}

	public static void ifDieEqualsOne(int die, boolean turnOver, String choice, Game game) {
		if (die == 1) {
			System.out.println("Turn over. No score.");
			turnOver = true;

		}
		game.turnScore += die;
		ifChoiceIsHold(choice, turnOver, game);

	}

	public static void ifChoiceIsHold(String choice, boolean turnOver, Game game) {
		if (choice.equals("h")) {
			System.out.println("Score for turn: " + game.turnScore); // 
			game.totalScore += game.turnScore;
			System.out.println("Total score: " + game.totalScore);
			turnOver = true;

		}
		if (choice.equals("g")) {
			System.out.println("Invalid choice. Please enter 'r' to roll or 'h' to hold.");
		}

	}

}
