package com.test;

import com.model.BankTransfer;
import com.model.CreditCard;
import com.model.PayPal;
import com.model.Payment;

public class PaymentTest {
	public static void main(String[] args) {
		CreditCard creditcard = new CreditCard();
		creditcard.payBill();
		creditcard.redeem();
	}
	
	
	
}


