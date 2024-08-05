package packet.model;

public class Delivered implements IPacketState{

	@Override
	public void next(Packet packet) {
		System.out.println("No next Sate !!!Its Delivered");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void current(Packet packet) {
		System.out.println("Delievered");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void previous(Packet packet) {
		packet.setPacketState(new Received());
		System.out.println("Received");
		// TODO Auto-generated method stub
		
	}

}
