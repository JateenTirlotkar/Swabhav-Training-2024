package facade.test;

import facade.model.HomeTheaterFacade;

public class HomeTheatreTest {
	public static void main(String[] args) {
		HomeTheaterFacade theatre1 = new HomeTheaterFacade();
		theatre1.start();
		System.out.println();
		theatre1.stop();
	}

}
