package violation.model;

public class TaxCalculator {
	DBLogger dblogger;

	public TaxCalculator(DBLogger dblogger) {
		super();
		this.dblogger = dblogger;
	}
	public TaxCalculator() {
		
	}

	public int calculateTax(int amount, int rate) {

		int tax = 0;
		try {
			tax = amount / rate;
			System.out.println("Tax: " + tax);
		} catch (Exception e) {
			new DBLogger().log("Divide by zero");

		}

		return rate;

	}

}
