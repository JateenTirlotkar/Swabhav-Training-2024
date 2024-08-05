package com.daythree;

import java.util.Scanner;

public class Treasure_Island {
	public static void main(String[] args) {
		System.out.println("Welcome to Treasure Island, Your mission is to find the treasure");
		System.out.println("Select a direction- left/right: ");
		Scanner sc = new Scanner(System.in);
		String first_choice = sc.next();
		String second_choice;
		String third_choice=null;

		if (first_choice.equals("left")) {
			System.out.println("You chose left. Now choose another direction- left/right: ");
			Scanner sc1 = new Scanner(System.in);
			second_choice = sc1.next();
			if (second_choice.equals("left")) {
				System.out.println("Wait");
				System.out.println("Choose a door: red, yellow, blue");
				Scanner sc2 = new Scanner(System.in);
				third_choice = sc2.next();
			}
		} else if (first_choice.equals("right")) {
			System.out.println("Fall in a hole, game over");
		} else {
			System.out.println("Attcked by trout, Game Over");
		}
		switch (third_choice) {
		case "red":
			System.out.println("Burned by fire! Game Over");
			break;
		case "blue":
			System.out.println("Eaten by beasts! Game Over");
			break;
		case "yellow":
			System.out.println("You Win!!!!!");
			break;
		default:
			System.out.println("Invalid Input, Game Over");

		}

	}

}
