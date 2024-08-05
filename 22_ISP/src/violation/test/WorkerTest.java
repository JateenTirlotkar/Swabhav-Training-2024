package violation.test;


import violation.model.Robot;
import violation.model.IWorker;
import violation.model.Labour;

public class WorkerTest {
	public static void main(String[] args) {
		IWorker labour = new Labour();
		labour.startWork();
		labour.stopWork();
		labour.drink();
		labour.eat();
		
		IWorker robot = new Robot();
		robot.startWork();
		robot.stopWork();
		robot.drink();
		robot.eat();
	}

}
