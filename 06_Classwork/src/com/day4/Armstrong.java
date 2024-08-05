package com.day4;
import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		System.out.println("Enter a 3 digit number");
		Scanner sc = new Scanner(System.in);
		int number= sc.nextInt();
		int temp=number;
		
		int sum=0;
		int cube=0;
		int rem=0;
		int pow=0;
		while(number>0) {
			pow++;
			number = number/10;
		}
		number=temp;
		
		while(number>0) {
			rem= number%10;
			cube= (int)Math.pow(rem,pow);
			sum=sum+cube;
			number=number/10;
		}
		System.out.println(sum);
		if(temp==sum)
		{
			System.out.println("It is Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}
		
	}

}
