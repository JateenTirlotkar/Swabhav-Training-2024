package com.test;

import com.model.Base;
import com.model.Derived1;
import com.model.Derived2;

public class BaseTest {
	public static void main(String[] args) {
		Base base = new Base();
		base.display();
		
		Derived1 derived1 = new Derived1();
		derived1.display();
		
		Derived2 derived2 = new Derived2();
		derived2.display();
		
		base = derived1;
		base.display();
		
		base = derived2;
		base.display();
	}

}
