package prodigy_hack.packet;

public class C10PacketKeepAlive {
	public static String keepAlive;
	public static String keepAlive1;
	public static String keepAlive2;
	
	public boolean keepAlivePacket;
	public boolean keepAliveReturn;
	public int count = 0;
	
	public void cancelKeepAlive() {
		return;
	}
	
	public static String booleanString;

	public C10PacketKeepAlive(boolean keepAlivePacket, boolean keepAliveReturn, int count) {
		super();
		this.keepAlivePacket = keepAlivePacket;
		this.keepAliveReturn = keepAliveReturn;
		this.count = count;
	}

	public static String getKeepAlive() {
		return keepAlive;
	}

	public static void setKeepAlive(String keepAlive) {
		C10PacketKeepAlive.keepAlive = keepAlive;
	}

	public static String getKeepAlive1() {
		return keepAlive1;
	}

	public static void setKeepAlive1(String keepAlive1) {
		C10PacketKeepAlive.keepAlive1 = keepAlive1;
	}

	public static String getKeepAlive2() {
		return keepAlive2;
	}

	public static void setKeepAlive2(String keepAlive2) {
		C10PacketKeepAlive.keepAlive2 = keepAlive2;
	}

	public boolean isKeepAlivePacket() {
		return keepAlivePacket;
	}

	public void setKeepAlivePacket(boolean keepAlivePacket) {
		this.keepAlivePacket = keepAlivePacket;
	}

	public boolean isKeepAliveReturn() {
		return keepAliveReturn;
	}

	public void setKeepAliveReturn(boolean keepAliveReturn) {
		this.keepAliveReturn = keepAliveReturn;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public static String getBooleanString() {
		return booleanString;
	}

	public static void setBooleanString(String booleanString) {
		C10PacketKeepAlive.booleanString = booleanString;
	}
	
	
}
