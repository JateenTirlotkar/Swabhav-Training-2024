package com.test;

import java.util.function.BiPredicate;

public class BiPredicateTest {
	public static void main(String[] args) {
		BiPredicate<Integer,Integer> greaterChecker = (Integer number1, Integer number2) -> (number1>number2);
		System.out.println(greaterChecker.test(5, 7));
	}

}
