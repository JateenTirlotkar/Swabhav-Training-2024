package com.model;

public class RunnableThread implements Runnable {
	
	private Thread thread;
	
	public Thread getThread() {
		return thread;
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}

	public RunnableThread(String name) {
		
		thread = new Thread(this,name);
		thread.start();
	}

	@Override
	public void run() {
		for (int i = 5; i > 0; i--) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}

		}
		
	}

}
