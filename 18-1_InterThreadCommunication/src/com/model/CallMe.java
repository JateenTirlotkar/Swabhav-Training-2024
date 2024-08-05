package com.model;

public class CallMe {
//	private String message;

//	public CallMe(String message) {
//		super();
//		this.message = message;
//	}
	
	public synchronized  void call(String message) {
		System.out.print("[ "+ message );
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("]");
	}

}
