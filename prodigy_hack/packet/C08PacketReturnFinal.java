package prodigy_hack.packet;

public class C08PacketReturnFinal {
	public int returnPacket;
	public int returnFail;
	
	public void returnPacketAlaways(String[] args) {
		return;
	}

	public C08PacketReturnFinal(int returnPacket, int returnFail) {
		super();
		this.returnPacket = returnPacket;
		this.returnFail = returnFail;
	}

	public int getReturnPacket() {
		return returnPacket;
	}

	public void setReturnPacket(int returnPacket) {
		this.returnPacket = returnPacket;
	}

	public int getReturnFail() {
		return returnFail;
	}

	public void setReturnFail(int returnFail) {
		this.returnFail = returnFail;
	}
	
}
