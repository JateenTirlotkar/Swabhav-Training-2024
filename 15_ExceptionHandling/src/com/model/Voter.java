package com.model;

import com.exceptions.AgeNotValidException;

public class Voter {
	private int voterId;
	private String firstName;
	private String LastName;
	private int age;

	public Voter(int voterId, String firstName, String lastName, int age) {
		super();
		this.voterId = voterId;
		this.firstName = firstName;
		LastName = lastName;
		if(age<18)
			throw new AgeNotValidException(age);
		this.age = age;

	}

	public int getVoterId() {
		return voterId;
	}

	public void setVoterId(int voterid) {
		this.voterId = voterid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {

		this.age = age;

	}

	@Override
	public String toString() {
		return "Voter [voterid=" + voterId + ", firstName=" + firstName + ", LastName=" + LastName + ", age=" + age
				+ "]";
	}

}
