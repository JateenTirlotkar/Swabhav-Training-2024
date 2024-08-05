package com.test;
import com.model.Number;;

public class NumberTest {
	public static void main(String[] args) {
		Number number1 = new Number(10);
		Number number2 = new Number(20);
		
		System.out.println("Values before Swapping "+ number1.getValue() +" " + number2.getValue());
		
		swap(number1,number2);
		
		System.out.println("Values after Swapping "+ number1.getValue() +" " + number2.getValue());
		
	}

	private static void swap(Number number1, Number number2) {
		int temp = number1.getValue();
		number1.setValue(number2.getValue());
		number2.setValue(temp);
	
	}

}
