package com.model;

public class CreditCard implements Payment {

	@Override
	public void payBill() {
		System.out.println("Billed payed through credit card");
		
	}

	@Override
	public void redeem() {
		// TODO Auto-generated method stub
		System.out.println("Reddemed through credit card");
		
	}
}
