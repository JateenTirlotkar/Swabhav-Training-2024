package com.test;

import java.util.Scanner;

import com.model.Employee;

public class Employee_test {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee1 id: ");
		emp1.setId(sc.nextInt());
		System.out.println("Enter Employee1 Name: ");
		emp1.setName(sc.next());
		System.out.println("Enter Employee1 Salary: ");
		emp1.setSalary(sc.nextInt());
		
		
		
		Employee emp2 = new Employee();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Employee2 id: ");
		emp2.setId(sc.nextInt());
		System.out.println("Enter Employee2 Name: ");
		emp2.setName(sc.next());
		System.out.println("Enter Employee2 Salary: ");
		emp2.setSalary(sc.nextInt());
		
		
		System.out.println("Details of Employee1: ");
		System.out.println("Employee id: " + emp1.getId());
		System.out.println("Employee Name: " + emp1.getName());
		System.out.println("Employee Salary: $" + emp1.getSalary() + "\n");
		
		System.out.println("Details of Employee2:");
		System.out.println("Employee id: "+ emp2.getId());
		System.out.println("Employee Name: " + emp2.getName());
		System.out.println("Employee Salary: " + emp2.getSalary());
		
		
		
		
		
		sc.close();
	}

}
