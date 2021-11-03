package prodigy_hack.packet;

public class C07PacketACK {
	public static String packetack;
	public static String packetHandling;
	
	public int handling;
	
	public void route() {
		return;
	}

	public static String getPacketack() {
		return packetack;
	}

	public static void setPacketack(String packetack) {
		C07PacketACK.packetack = packetack;
	}

	public static String getPacketHandling() {
		return packetHandling;
	}

	public static void setPacketHandling(String packetHandling) {
		C07PacketACK.packetHandling = packetHandling;
	}

	public int getHandling() {
		return handling;
	}

	public void setHandling(int handling) {
		this.handling = handling;
	}

	public C07PacketACK(int handling) {
		this.handling = handling;
	}
	
}
