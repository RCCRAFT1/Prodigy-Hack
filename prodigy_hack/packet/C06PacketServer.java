package prodigy_hack.packet;

public class C06PacketServer {
	public int connstruct;
	public int server;
	
	public boolean serverCancelEvent() {
		return false;
	}

	public C06PacketServer(int connstruct, int server) {
		this.connstruct = connstruct;
		this.server = server;
	}

	public static void update() {
		
	}
	
}
