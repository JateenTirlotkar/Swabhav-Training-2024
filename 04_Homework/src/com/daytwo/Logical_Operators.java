package com.daytwo;
import java.util.Scanner;

public class Logical_Operators {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter first boolean value : ");
	        boolean a = sc.nextBoolean();

	      
	        System.out.print("Enter second boolean value : ");
	        boolean b = sc.nextBoolean();

	        
	        boolean resultAnd = a && b;
	        boolean resultOr = a || b;
	        boolean resultXor = a ^ b;
	        boolean resultNotA = !a;
	        boolean resultNotB = !b;

	        
	        System.out.println("Results:");
	        System.out.println(a + " && " + b + " = " + resultAnd);
	        System.out.println(a + " || " + b + " = " + resultOr);
	        System.out.println(a + " XOR " + b + " = " + resultXor);
	        System.out.println("NOT " + a + " = " + resultNotA);
	        System.out.println("NOT " + b + " = " + resultNotB);
	

}
}
