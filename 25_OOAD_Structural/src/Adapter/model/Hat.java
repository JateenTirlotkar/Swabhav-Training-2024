package Adapter.model;

public class Hat {
	String shortname;
	String longName;
	Double basicPrice;
	Double tax;
	public Hat(String shortname, String longName, Double basicPrice, Double tax) {
		super();
		this.shortname = shortname;
		this.longName = longName;
		this.basicPrice = basicPrice;
		this.tax = tax;
	}
	public String getShortname() {
		return shortname;
	}
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}
	public String getLongName() {
		return longName;
	}
	public void setLongName(String longName) {
		this.longName = longName;
	}
	public Double getBasicPrice() {
		return basicPrice;
	}
	public void setBasicPrice(Double basicPrice) {
		this.basicPrice = basicPrice;
	}
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "Hat [shortname=" + shortname + ", longName=" + longName + ", basicPrice=" + basicPrice + ", tax=" + tax
				+ "]";
	}
	
	

}
