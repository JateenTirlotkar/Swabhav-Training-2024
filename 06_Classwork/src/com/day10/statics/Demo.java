package com.day10.statics;

public class Demo {
	private int a=1;
	static private int b = 2;
	private int c = 3;
	
	public void increment()
	{
		a++;
		b++;
		c++;
		
	}
	public void display()
	{
		System.out.println("a " + a);
		System.out.println("b " +b);
		System.out.println("c "+c);
	}
	static
	{
		System.out.println("Bye");
	}
}
