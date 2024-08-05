package com.model;

public class MainThread {
	
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		thread.setName("My name");
		System.out.println(thread);
		
		for(int i=5;i>0;i--) {
			System.out.println(thread.currentThread().getName() + "" + i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
		
	}
	
	
	

}
}
}
