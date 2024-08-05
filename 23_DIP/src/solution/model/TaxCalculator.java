package solution.model;

import java.util.logging.Logger;

import violation.model.DBLogger;

public class TaxCalculator {
	Logger logger;

	public TaxCalculator(Logger logger) {
		super();
		this.logger = logger;
	}
	
	public TaxCalculator() {
		
	}
	
	
	public int calculateTax(int amount, int rate) {

		int tax = 0;
		try {
			tax = amount / rate;
			System.out.println("Tax: " + tax);
		} catch (Exception e) {
//			new ILogger.DBLogger().log("Divide by zero");

		}

		return rate;

	}

	

}
