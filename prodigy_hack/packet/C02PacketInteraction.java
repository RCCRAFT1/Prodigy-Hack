package prodigy_hack.packet;

public class C02PacketInteraction {
	public static String Packet2;
	public static String PacketInteraction;
	
	public boolean packetDetectSend() {
		return C02PacketInteraction.Packet2 != null;
	}
	// String checks
	public static String prodigyInteractionPacket;
	
	public static class ProdigyInteraction {
		public static String packetChecks;
		public static String packetRemove;
		
		public static String interactionPlayer;
		public static String interactionEntity;
		public static String interactionServer;
		
		@SuppressWarnings("unused")
		private boolean cancelEventPlayer() {
			return false;
		}
		public static String prodigyPlayer;
	}

	public static String getPacket2() {
		return Packet2;
	}

	public static void setPacket2(String packet2) {
		Packet2 = packet2;
	}

	public static String getPacketInteraction() {
		return PacketInteraction;
	}

	public static void setPacketInteraction(String PacketInteraction) {
		C02PacketInteraction.PacketInteraction = PacketInteraction;
	}

	public static String getProdigyInteractionPacket() {
		return prodigyInteractionPacket;
	}

	public static void setProdigyInteractionPacket(String prodigyInteractionPacket) {
		C02PacketInteraction.prodigyInteractionPacket = prodigyInteractionPacket;
	}
	
	
}
