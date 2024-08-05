package Adapter.model;

public class HatAdapter implements Iitems {
	Hat hat;
	

	public HatAdapter(Hat hat) {
		super();
		this.hat = hat;
	}

	@Override
	public String getItemName() {
		
		return hat.getShortname()+hat.getLongName();
	}

	@Override
	public Double getItemPrice() {
		
		return hat.getBasicPrice()+ hat.getTax();
	}

}
