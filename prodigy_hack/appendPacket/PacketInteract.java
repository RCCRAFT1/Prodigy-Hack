package prodigy_hack.appendPacket;

public class PacketInteract {
	public static String appendPacket;
	public static String cancelEventNull;
	
	public static String cancelInteractionEventNull;
	public static String cancelInteractionFalse;
	
	public class interactionDefault {
		public String interactionPlayer;
		public String interactionEntity;
		public String interactionServerPlayer;
		
		public void interactionSendCancelEvent(int interaction) {
			return;
		}
	}
	@SuppressWarnings("unlikely-arg-type")
	public boolean cancelInteractionFalse() {
		return this.equals(appendPacket);
	}
	public static String equalsPacketInteraction;
	public static String packetInteractionAll;
	public static String getAppendPacket() {
		return appendPacket;
	}
	public static void setAppendPacket(String appendPacket) {
		PacketInteract.appendPacket = appendPacket;
	}
	public static String getCancelEventNull() {
		return cancelEventNull;
	}
	public static void setCancelEventNull(String cancelEventNull) {
		PacketInteract.cancelEventNull = cancelEventNull;
	}
	public static String getCancelInteractionEventNull() {
		return cancelInteractionEventNull;
	}
	public static void setCancelInteractionEventNull(String cancelInteractionEventNull) {
		PacketInteract.cancelInteractionEventNull = cancelInteractionEventNull;
	}
	public static String getCancelInteractionFalse() {
		return cancelInteractionFalse;
	}
	public static void setCancelInteractionFalse(String cancelInteractionFalse) {
		PacketInteract.cancelInteractionFalse = cancelInteractionFalse;
	}
	public static String getEqualsPacketInteraction() {
		return equalsPacketInteraction;
	}
	public static void setEqualsPacketInteraction(String equalsPacketInteraction) {
		PacketInteract.equalsPacketInteraction = equalsPacketInteraction;
	}
	public static String getPacketInteractionAll() {
		return packetInteractionAll;
	}
	public static void setPacketInteractionAll(String packetInteractionAll) {
		PacketInteract.packetInteractionAll = packetInteractionAll;
	}
	
	
}
