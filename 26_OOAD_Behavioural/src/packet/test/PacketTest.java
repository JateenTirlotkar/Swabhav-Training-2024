package packet.test;

import packet.model.IPacketState;
import packet.model.Ordered;
import packet.model.Packet;

public class PacketTest {
	public static void main(String[] args) {
		Packet packet  = new Packet(new Ordered());
		packet.packetStatus();
		packet.nextState();
		packet.nextState();
		packet.previousState();
	}

}
