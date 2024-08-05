package com.daytwo;

public class Bitwise_operator {
	public static void main(String[] args) {
		int a= 10;
		int b= 13;
		int c = a & b;
		System.out.println("Bitwise AND "+c);
		int d= a|b;
		System.out.println("Bitwise OR " + d);
		int e= a<<1;
		System.out.println("Left Shift a " + e);
		int f= a>>1;
		System.out.println("Right Shift a "+ f);
	}

}
