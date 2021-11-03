package prodigy_hack.appendPacket;

public class PacketPlayer {
	public static String appendPacket;
	public static String cancelEvent;
	
	public static String cancelPlayerEvent;
	public static String cancelPlayer;
	
	public class playerDefault {
		public String playerSendInformation;
		public String playerSendInteraction;
		
		public void playerSendInformationCancel(int player) {
			return;
		}
	}
	public boolean cancelEventPacket() {
		return this.cancelEvent();
	}
	private boolean cancelEvent() {
		// TODO Auto-generated method stub
		return false;
	}
	public static String getAppendPacket() {
		return appendPacket;
	}
	public static void setAppendPacket(String appendPacket) {
		PacketPlayer.appendPacket = appendPacket;
	}
	public static String getCancelEvent() {
		return cancelEvent;
	}
	public static void setCancelEvent(String cancelEvent) {
		PacketPlayer.cancelEvent = cancelEvent;
	}
	public static String getCancelPlayerEvent() {
		return cancelPlayerEvent;
	}
	public static void setCancelPlayerEvent(String cancelPlayerEvent) {
		PacketPlayer.cancelPlayerEvent = cancelPlayerEvent;
	}
	public static String getCancelPlayer() {
		return cancelPlayer;
	}
	public static void setCancelPlayer(String cancelPlayer) {
		PacketPlayer.cancelPlayer = cancelPlayer;
	}
	
}
