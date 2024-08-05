package facade.model;

public class DvdPlayer {
	public void on() {
		System.out.println("Dvd Player is On ");
	}
	public void off() {
		System.out.println("Dvd Player off");
	}
	public void input(InputSource source) {
		System.out.println("Input set to "+ source+" source");
	}
	

}
