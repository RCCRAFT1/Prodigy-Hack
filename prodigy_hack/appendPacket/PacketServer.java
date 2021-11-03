package prodigy_hack.appendPacket;

public class PacketServer {
	// Can't cancel server events. Very simple code
	
	public static String appendPacketServer;
	
	public void serverCancelFalse(int serverPacket) {
		return;
	}
	public void serverRedirect(int server) {
		return;
	}
	public static String getPublicValueServerModifiy() {
		return publicValueServerModifiy;
	}
	public static void setPublicValueServerModifiy(String publicValueServerModifiy) {
		PacketServer.publicValueServerModifiy = publicValueServerModifiy;
	}
	private static String publicValueServerModifiy;
}
