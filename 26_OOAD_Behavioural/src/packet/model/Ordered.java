package packet.model;

public class Ordered implements IPacketState{

	@Override
	public void next(Packet packet) {
		packet.setPacketState(new Received());
		System.out.println("Received ");
		// TODO Auto-generated method stub
		
	}
	
	
	

	@Override
	public void current(Packet packet) {
		System.out.println("Ordered ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void previous(Packet packet) {
		
		System.out.println(" No, its just ordered");
		// TODO Auto-generated method stub
		
	}

}
