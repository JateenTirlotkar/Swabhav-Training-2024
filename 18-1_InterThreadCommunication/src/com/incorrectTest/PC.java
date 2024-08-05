package com.incorrectTest;

import com.incorrect.Consumer;
import com.incorrect.Producer;
import com.incorrect.Q;

class PC {
	public static void main(String args[]) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		System.out.println("Press Control-C to stop.");
	}
}
