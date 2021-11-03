package prodigy_hack.packet;

public class C05PacketInteractionServer {
	public int server;
	public int serverInt;
	public C05PacketInteractionServer(int server, int serverInt) {
		this.server = server;
		this.serverInt = serverInt;
	}
	
	//Most packet handling for server-sided interactions is on the server.
}
