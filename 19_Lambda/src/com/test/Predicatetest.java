package com.test;

import java.util.function.Predicate;

public class Predicatetest {
	public static void main(String[] args) {
		Predicate<Integer> evenChecker = (Integer number) -> (number%2==0);
		System.out.println(evenChecker.test(6));
	}

}
