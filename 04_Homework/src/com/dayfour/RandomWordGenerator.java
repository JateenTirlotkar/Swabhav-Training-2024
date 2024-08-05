package com.dayfour;

import java.util.Random;
import java.util.Scanner;

public class RandomWordGenerator {
    public static void main(String[] args) {
        String WordCharacter = "abcdefghijklmnopqrstuvwxyz";
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        
        int length = random.nextInt(5) + 2;
        for (int i = 0; i < length; i++) {
            char randomChar = WordCharacter.charAt(random.nextInt(WordCharacter.length()));
            sb.append(randomChar);
        }
        
        String randomWord = sb.toString();
        System.out.println(randomWord);
        
        int wordLength = randomWord.length();
        int MaxLives = wordLength * 7;
        
        StringBuilder blanks = new StringBuilder(); 
        for (int i = 0; i < wordLength; i++) {
            blanks.append("_");
        }
        
        int lives = MaxLives;
        
        System.out.println("Welcome to Random Word Guessing Game!");
        System.out.println("-------------------------------------------------------");
        System.out.println("Guess the word by entering one letter at a time.");
        System.out.println("The word has " + wordLength + " letters. You have " + lives + " lives to guess the word.");
        
        while (lives > 0 && blanks.indexOf("_") != -1) {
            System.out.println("Current word: " + blanks);
            System.out.println("Enter your guess: ");
            String guess = sc.next().toLowerCase();
            
            boolean found = false;
            for (int i = 0; i < wordLength; i++) {
                if (randomWord.charAt(i) == guess.charAt(0)) {
                    blanks.setCharAt(i, guess.charAt(0));
                    found = true;
                }
            }
            
            if (found) {
                System.out.println("Correct guess!");
            } else {
                lives--;
                System.out.println("Incorrect guess. You lose a life. Lives left: " + lives);
            }
        }
        
        if (blanks.indexOf("_") == -1) {
            System.out.println("Guessed word: " + blanks);
            System.out.println("Congratulations... You guessed the word: " + randomWord);
            System.out.println("You Win!");
        } else {
            System.out.println("Game over! You've run out of lives.");
            System.out.println("The word was: " + randomWord);
            System.out.println("Better luck next time!");
        }
    }
}
