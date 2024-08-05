package com.model;

public class Caller implements Runnable {
	private String message;
	private CallMe target;
	private Thread thread;

	
	public Caller(String message, CallMe target) {
		this.message= message;
		this.target = target;
		thread = new Thread(this);
		thread.start();
		
		
	}


	@Override
	public void run() {
		target.call(message);
		// TODO Auto-generated method stub
		
	}


	public Thread getThread() {
		return thread;
	}

}
