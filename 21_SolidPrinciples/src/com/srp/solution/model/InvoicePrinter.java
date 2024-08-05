package com.srp.solution.model;

public class InvoicePrinter {
	private Invoice invoice;
	private TaxCalculator taxcalculator;
	
	public InvoicePrinter(TaxCalculator taxcalculator, Invoice invoice) {
		super();
		this.taxcalculator = taxcalculator;
		this.invoice = invoice;
	}

	

	public void Invoice() {
		System.out.println("Id : "+ invoice.getId());
		System.out.println("Description: " + invoice.getDescription() );
		System.out.println("Amount: "+ invoice.getAmount());
		System.out.println("Tax: "+ invoice.getTax());
		System.out.println("Tax Amount"+ taxcalculator.CalculateTax());
		System.out.println("Total Amount with tax: "+(invoice.getAmount()+ taxcalculator.CalculateTax()));

}
}
