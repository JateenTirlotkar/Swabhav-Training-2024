package com.incorrect;

public class Q {
	int n;
	synchronized int get() {
		System.out.println("Got " + n);
		return n;
	}
	public void put(int n) {
		this.n=n;
		System.out.println("Put "+ n);
		
	}

}
