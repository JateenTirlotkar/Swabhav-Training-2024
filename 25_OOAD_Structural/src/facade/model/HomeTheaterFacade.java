package facade.model;

public class HomeTheaterFacade {
	public void start() {
		DvdPlayer dvd = new DvdPlayer();
		dvd.on();
		dvd.input(InputSource.hdmi);
		Projector projector = new Projector();
		projector.on();
		SoundSystem system = new SoundSystem();
		system.on();
		system.Volume(60);
	}
	
	public void stop() {
		DvdPlayer dvd = new DvdPlayer();
		dvd.off();
		Projector projector = new Projector();
		projector.off();
		SoundSystem system = new SoundSystem();
		system.off();
		
	}

}
