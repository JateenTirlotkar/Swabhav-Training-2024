package Adapter.model;

public class Biscuit implements Iitems{
	
	String name;
	Double mrp;

	public Biscuit(String name, Double mrp) {
		super();
		this.name = name;
		this.mrp = mrp;
	}

	@Override
	public String getItemName() {
		
		return name;
	}

	@Override
	public Double getItemPrice() {
		return mrp;
	}

}
