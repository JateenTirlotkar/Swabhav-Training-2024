package packet.model;

public class Packet {
	IPacketState packetState;

	public Packet(IPacketState packetState) {
		super();
		this.packetState = packetState;
	}
	

	
	public void packetStatus() {
		packetState.current(this);
	}
	public void nextState() {
		
		packetState.next(this);
		
	}
	public void previousState() {
		packetState.next(this);
	}

	public IPacketState getPacketState() {
		return packetState;
	}

	public void setPacketState(IPacketState packetState) {
		this.packetState = packetState;
	}
	

}
