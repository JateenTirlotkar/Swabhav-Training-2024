package Adapter.model;

import java.util.Arrays;

public class AdapterTest {
	public static void main(String[] args) {
		
		
		Hat hat = new Hat("Jateen", "Tirlotkar", 200.0, 20.0);
		HatAdapter adapter = new HatAdapter(hat);
		
		Biscuit biscuit = new Biscuit("PArle",10.0);
		
		adapter.getItemName();
		adapter.getItemPrice();
		
		ShoppingCart cart = new ShoppingCart(Arrays.asList(biscuit,adapter));
		System.out.println(cart.getCartPrice());
		
		System.out.println(cart.getCartItems());
		
	}

}
