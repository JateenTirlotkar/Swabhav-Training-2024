package com.test;

import java.util.Scanner;

import com.exceptions.EmailNotValidException;
import com.exceptions.PasswordNotValidException;
import com.model.User;

public class UserTest {
	public static void main(String[] args) {
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter Email id ");
		String email = scanner.next();
		System.out.println("Enter Password ");
		String password = scanner.next();
		
		 try {
			   User user = new User(email, password);
			   System.out.println("User Created!");
			   System.out.println(user);
			   
			  }
			  catch(EmailNotValidException e) {
			   System.out.println("Error : " +e.getMessage());
			  }
			  catch(PasswordNotValidException e) {
			   System.out.println("Error : "+ e.getMessage());
			  }
			  scanner.close();
	}

}
