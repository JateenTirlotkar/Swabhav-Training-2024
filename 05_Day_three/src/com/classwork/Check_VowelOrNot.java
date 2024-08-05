package com.classwork;
import java.util.Scanner;

public class Check_VowelOrNot {
	public static void main(String[] args) {
		System.out.println("Enter a letter");
		Scanner sc = new Scanner(System.in);
		char letter = sc.next().charAt(0);
		
		if(letter== 'a' || letter == 'e' || letter =='i' || letter == 'o' || letter=='u') {
			System.out.println("The letter is a vowel");
			
		}
		else {
			System.out.println("Letter is not a vowel");
		}
		
		
		
		
		char ch='g';
		switch(ch) {
		case 'a':System.out.println("Vowel");
		break;
		case 'e':System.out.println("Vowel");
		break;
		case 'i':System.out.println("Vowel");
		break;
		case 'o':System.out.println("Vowel");
		break;
		case 'u':System.out.println("Vowel");
		break;
		default:System.out.println("Not a Vowel");
		}
		
		
	
	
	
	}

}
