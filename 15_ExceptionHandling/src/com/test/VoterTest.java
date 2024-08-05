package com.test;

import java.util.Scanner;

import com.exceptions.AgeNotValidException;
import com.model.Voter;

public class VoterTest {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Enter voter id");
		int  voterId = scanner.nextInt();
		System.out.println("Enter First Name");
		String firstName = scanner.next();
		System.out.println("Enter last Name  ");
		String lastName = scanner.next();
		System.out.println("Enter Age ");
		int age = scanner.nextInt();
		Voter voter = null;
		try {
		voter = new Voter(voterId, firstName, lastName, age);
		System.out.println(voter);
		}
		catch(AgeNotValidException exception)
		{
			System.out.println(exception.getMessage());
		}
		
	}

}
