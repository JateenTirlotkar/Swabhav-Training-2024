package com.test;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		Function<Integer,Integer> squareNumber =(Integer number)-> {
			return number*number;
			
		};
//		System.out.println(squareNumber.apply(4));
		method(squareNumber);
	}
	private static void method(Function<Integer,Integer> squareNumber) {
		System.out.println(squareNumber.apply(4));
	}

}
