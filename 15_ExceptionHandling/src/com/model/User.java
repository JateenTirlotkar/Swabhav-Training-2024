package com.model;

import com.exceptions.EmailNotValidException;
import com.exceptions.PasswordNotValidException;

public class User {
	private String email;
	private String password;

	public User(String email, String password) {
		super();
		validateEmail(email);
		validatePassword(password);
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		validateEmail(email);
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		validatePassword(password);
		this.password = password;
	}

	public void validateEmail(String email) {
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";

		if (!email.matches(emailRegex)) {
			throw new EmailNotValidException();
		}
	}

	public void validatePassword(String password) {
		  if((password.length() < 8)) {
		   throw new PasswordNotValidException();
		  }
		  boolean hasUpperCase = password.chars().anyMatch(Character::isUpperCase);
		  boolean hasDigit = password.chars().anyMatch(Character::isDigit);
		  boolean hasSpecialChar = password.chars().anyMatch(ch->Character.isLetterOrDigit(ch));
		  if(!hasUpperCase || !hasDigit||  !hasSpecialChar) {
		   throw new PasswordNotValidException();
		  }
		  
		 }
	
	 public String toString() {
		  return "User : email=" + email + ", password=" + password + "";
		 }

}
