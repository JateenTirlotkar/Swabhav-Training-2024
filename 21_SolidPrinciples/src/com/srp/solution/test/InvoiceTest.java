package com.srp.solution.test;

import com.srp.solution.model.Invoice;
import com.srp.solution.model.InvoicePrinter;
import com.srp.solution.model.TaxCalculator;

public class InvoiceTest {
	public static void main(String[] args) {
		Invoice invoice = new Invoice("1","Mobile", 2000, 10);
		TaxCalculator taxCalculator = new TaxCalculator(invoice);
		InvoicePrinter invoicePrinter = new InvoicePrinter(taxCalculator, invoice);
		invoicePrinter.Invoice();
		
		
	}

}
