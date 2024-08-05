package com.day5;

public class pattern_star {
	public static void main(String[] args) {
		
		int i= 1;
		int j=1;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println(" ");
		}
	}

}
