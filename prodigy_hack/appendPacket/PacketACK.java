package prodigy_hack.appendPacket;

public class PacketACK {
	public static String appentPacketAck;
	public static String dataPacket;
	
	public static String ack;
	
	public void ackCancelEvent(int ack) {
		return;
	}
	public void ackCancelEventInfo(int info) {
		return;
	}
	public static String autoGenerationAckPacket;
	public static String cancelEvent;

	public static String getAppentPacketAck() {
		return appentPacketAck;
	}
	public static void setAppentPacketAck(String appentPacketAck) {
		PacketACK.appentPacketAck = appentPacketAck;
	}
	public static String getDataPacket() {
		return dataPacket;
	}
	public static void setDataPacket(String dataPacket) {
		PacketACK.dataPacket = dataPacket;
	}
	public static String getAck() {
		return ack;
	}
	public static void setAck(String ack) {
		PacketACK.ack = ack;
	}
	public static String getAutoGenerationAckPacket() {
		return autoGenerationAckPacket;
	}
	public static void setAutoGenerationAckPacket(String autoGenerationAckPacket) {
		PacketACK.autoGenerationAckPacket = autoGenerationAckPacket;
	}
	public static String getCancelEvent() {
		return cancelEvent;
	}
	public static void setCancelEvent(String cancelEvent) {
		PacketACK.cancelEvent = cancelEvent;
	}
	
}
