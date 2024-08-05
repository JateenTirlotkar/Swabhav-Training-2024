package packet.model;

public class Received implements IPacketState{

	@Override
	public void next(Packet packet) {
		System.out.println("Delivered");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void current(Packet packet) {
		System.out.println("Received");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void previous(Packet packet) {
		packet.setPacketState(new Ordered());
		System.out.println("Ordered");
		// TODO Auto-generated method stub
		
	}

}
