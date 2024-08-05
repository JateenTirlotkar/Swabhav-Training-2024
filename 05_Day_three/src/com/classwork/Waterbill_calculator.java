package com.classwork;
import java.util.Scanner;

public class Waterbill_calculator {
	public static void main(String[] args) {
		System.out.println("Enter no.of units consumed");
		Scanner sc = new Scanner(System.in);
		int number_of_units= sc.nextInt();
		float meter_charge= 75;
		float  charge;
		
		
		
		
		
		if(number_of_units<=100) {
			 charge= number_of_units * 5;
		}
		else if(number_of_units<=250) {
			 charge= (number_of_units-100)* 10;
			 charge+=100*5;
		}
		else {
			 charge = (number_of_units-250) * 20;
			 charge+=100*5;
			 charge+=150*10;
		}
		
		 float total_bill = meter_charge + charge;
		 System.out.println("Your Total Water bill is: " + total_bill );
		
	}

}
