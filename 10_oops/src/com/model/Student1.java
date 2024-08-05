package com.model;

public class Student1 extends Person {
	private int rollNumber;
	private Double percentage;
	public int getRollNumber() {
		return rollNumber;
	}
	public Student1(String name, String address, int age, int rollNumber, Double percentage) {
		super(name, address, age);
		this.rollNumber = rollNumber;
		this.percentage = percentage;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student1 [rollNumber=" + rollNumber + ", percentage=" + percentage + ", getName()=" + getName()
				+ ", getAddress()=" + getAddress() + ", getAge()=" + getAge() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
