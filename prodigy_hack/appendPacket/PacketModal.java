package prodigy_hack.appendPacket;

public final class PacketModal {
	public static String modalPacketInformation;
	public static String modalPacketDateSend;
	
	public boolean packetCancelShift() {
		return true;
	}
	public boolean packetCancelPlayer() {
		return true;
	}
	public void packetPlayerNull (int playerWeb) {
		return;
	}
	
	public static String packetPlayerInt;
	public static String packetIntPlayer;
	//Packet check cancels
	public void packetPlayer(int packetPlayerInteract) {
		return;
	}
	public static String packetPlayerCancel;
	
	public boolean intPacketPlayer() {
		return this.packetPlayerInteract();
	}
	private boolean packetPlayerInteract() {
		// TODO Auto-generated method stub
		return false;
	}
	public static String interactPlayer;
	public static String interactPacket;
	
	public void playerPacketInt(int playerMovement) {
		return;
	}
	public void playerPacketMovement(int movement) {
		return;
	}
	public boolean playerCancelEvent() {
		return PacketModal.packetIntPlayer != null;
	}
	public static String playerCancelEventPacket;

	public static String getModalPacketInformation() {
		return modalPacketInformation;
	}
	public static void setModalPacketInformation(String modalPacketInformation) {
		PacketModal.modalPacketInformation = modalPacketInformation;
	}
	public static String getModalPacketDateSend() {
		return modalPacketDateSend;
	}
	public static void setModalPacketDateSend(String modalPacketDateSend) {
		PacketModal.modalPacketDateSend = modalPacketDateSend;
	}
	public static String getPacketPlayerInt() {
		return packetPlayerInt;
	}
	public static void setPacketPlayerInt(String packetPlayerInt) {
		PacketModal.packetPlayerInt = packetPlayerInt;
	}
	public static String getPacketIntPlayer() {
		return packetIntPlayer;
	}
	public static void setPacketIntPlayer(String packetIntPlayer) {
		PacketModal.packetIntPlayer = packetIntPlayer;
	}
	public static String getPacketPlayerCancel() {
		return packetPlayerCancel;
	}
	public static void setPacketPlayerCancel(String packetPlayerCancel) {
		PacketModal.packetPlayerCancel = packetPlayerCancel;
	}
	public static String getInteractPlayer() {
		return interactPlayer;
	}
	public static void setInteractPlayer(String interactPlayer) {
		PacketModal.interactPlayer = interactPlayer;
	}
	public static String getInteractPacket() {
		return interactPacket;
	}
	public static void setInteractPacket(String interactPacket) {
		PacketModal.interactPacket = interactPacket;
	}
	public static String getPlayerCancelEventPacket() {
		return playerCancelEventPacket;
	}
	public static void setPlayerCancelEventPacket(String playerCancelEventPacket) {
		PacketModal.playerCancelEventPacket = playerCancelEventPacket;
	}
	
	
}
