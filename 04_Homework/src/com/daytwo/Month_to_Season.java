package com.daytwo;
import java.util.Scanner;
public class Month_to_Season {
	public static void main(String[] args) {
		System.out.println("Enter a month number");
		Scanner sc = new Scanner(System.in);
		int month_number= sc.nextInt();
		
		switch(month_number) {
		
		case 1:
		case 10:
		case 11:
		case 12: System.out.println("Winter");
		break;
		case 2:
		case 3:
		case 4:
		case 5: System.out.println("Monsoon");
		break;
		default:  System.out.println("Summer");
		
		}
		
			
		
	}

}
