package solution.test;

import solution.model.ILunchInterval;
import solution.model.IWorkable;
import solution.model.Labour;
import solution.model.Robot;

public class WorkerTest {
	public static void main(String[] args) {
		IWorkable robot = new Robot();
		robot.start();
		robot.stop();
		
		IWorkable labour = new Labour();
		labour.start();
		labour.stop();
		
		ILunchInterval labour1 = new Labour();
		labour1.eat();
		labour1.drink();
		
	}

}
