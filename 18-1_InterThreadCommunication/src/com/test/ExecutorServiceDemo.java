package com.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.model.Task;

public class ExecutorServiceDemo {
	public static void main(String[] args) {
		
		int coreCount = Runtime.getRuntime().availableProcessors();
		System.out.println(coreCount+ "Processors available");
		ExecutorService service = Executors.newCachedThreadPool();
		
		for(int i=0;i<100;i++) {
			service.execute(new Task());
		}
	}

}
