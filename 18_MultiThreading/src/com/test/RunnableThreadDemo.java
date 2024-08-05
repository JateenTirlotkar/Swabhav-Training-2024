package com.test;

import com.model.RunnableThread;

public class RunnableThreadDemo {
	public static void main(String[] args) {
		RunnableThread thread1 = new RunnableThread("thread1");
		RunnableThread thread2 = new RunnableThread("thread2");
		
		System.out.println(thread1.getThread().isAlive());
		System.out.println(thread2.getThread().isAlive());
		thread1.getThread().setPriority(Thread.MAX_PRIORITY);
		thread2.getThread().setPriority(Thread.MIN_PRIORITY);
		
		
		
		
		for (int i = 5; i > 0; i--) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}

		}
		try {
			thread1.getThread().join();
			thread2.getThread().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(thread1.getThread().isAlive());
		System.out.println(thread2.getThread().isAlive());
		
	}

}
