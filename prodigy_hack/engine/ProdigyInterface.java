package prodigy_hack.engine;

public class ProdigyInterface {
	public static String packetInterface;
	public static Object packetNullCancel;
	
	public static String packetCancel;
	public void cancelPacket(int cancel) {
		return;
	}
	public class cancelEvent {
		public void playerPacket(int cancelEvent) {
			return;
		}
	}
	public static class packetDefine {
		public static String packetInteract;
		public static String packetPlayer;
		public static String packetACK;
		public static String packetServer;
	}
	public boolean cancelEventPacketPlayer() {
		return packetDefine.packetPlayer != null;
	}
	public boolean cancelEventPacketInteract() {
		return packetDefine.packetInteract != null;
	}
	public boolean cancelEventPacketServer() {
		return packetDefine.packetServer != null;
	}
	public boolean cancelEventPacketACK() {
		return packetDefine.packetACK != null;
	}
	public static class cancelEventPacket {
		public static String event;
		
		public void packetACK0(int event) {
			return;
		}
	}
	public static String getPacketInterface() {
		return packetInterface;
	}
	public static void setPacketInterface(String packetInterface) {
		ProdigyInterface.packetInterface = packetInterface;
	}
	public static Object getPacketNullCancel() {
		return packetNullCancel;
	}
	public static void setPacketNullCancel(Object packetNullCancel) {
		ProdigyInterface.packetNullCancel = packetNullCancel;
	}
	public static String getPacketCancel() {
		return packetCancel;
	}
	public static void setPacketCancel(String packetCancel) {
		ProdigyInterface.packetCancel = packetCancel;
	}
	
}
