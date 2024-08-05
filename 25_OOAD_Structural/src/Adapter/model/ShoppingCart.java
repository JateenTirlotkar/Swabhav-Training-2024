package Adapter.model;

import java.util.*;

public class ShoppingCart {
	List<Iitems> cartItems;

	public ShoppingCart(List<Iitems> cartItems) {
		super();
		this.cartItems = cartItems;
	}
	
	public void  addItemToCart(Iitems item) {
		cartItems.add(item);
		
	}
	public List<Iitems> getCartItems(){
		return cartItems;

	}
	public double getCartPrice() {
		return cartItems.stream()
				.map(item->item.getItemPrice())
				.reduce(0.0, (number1,number2)-> number1+number2);
	}

}
