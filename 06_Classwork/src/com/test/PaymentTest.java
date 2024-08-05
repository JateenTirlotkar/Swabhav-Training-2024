package com.test;

import com.model.BankTransferPayment;
import com.model.CreditCardPayment;
import com.model.PayPalPayment;
import com.model.Payment;

public class PaymentTest {
	public static void main(String[] args) {
		Payment payment;
		payment = new CreditCardPayment();
		payment.payBill();
		payment.redeem();
		
		payment = new PayPalPayment();
		payment.payBill();
		payment.redeem();
		
		 payment = new BankTransferPayment();
		payment.payBill();
		payment.redeem();
	}

}
