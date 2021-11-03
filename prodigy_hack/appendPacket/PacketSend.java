package prodigy_hack.appendPacket;

public class PacketSend {

	public static boolean send() {
		return true;
	}
	public static boolean receive() {
		return true;
	}
	public int send;
	public int receive;
	public PacketSend(int send, int receive) {
		super();
		this.send = send;
		this.receive = receive;
	}
	public int getSend() {
		return send;
	}
	public void setSend(int send) {
		this.send = send;
	}
	public int getReceive() {
		return receive;
	}
	public void setReceive(int receive) {
		this.receive = receive;
	}
	
	
}
