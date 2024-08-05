package com.test;

import com.model.MyThread;

public class ThreadDemo {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread("thread1");
		MyThread thread2 = new MyThread("thread2");
		MyThread thread3 = new MyThread("thread3");
		
		for (int i = 5; i > 0; i--) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}

		}
	}
	}


