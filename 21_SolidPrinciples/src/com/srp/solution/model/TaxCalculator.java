package com.srp.solution.model;

public class TaxCalculator {
	private Invoice invoice;
	
	public TaxCalculator(Invoice invoice) {
		super();
		this.invoice = invoice;
	}

	public  double CalculateTax() {
		return invoice.getAmount()*invoice.getTax()/100;
	}

}
