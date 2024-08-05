package com.model;

public class PayPal  implements Payment{
	public void payBill() {
		System.out.println("Payed through PayPal");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void redeem() {
		System.out.println("Redeemed through Paypal");
		// TODO Auto-generated method stub
		
	}


}
