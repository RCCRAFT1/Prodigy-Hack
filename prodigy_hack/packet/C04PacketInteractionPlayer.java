package prodigy_hack.packet;

public class C04PacketInteractionPlayer extends C02PacketInteraction{
	
	public int interactionPlayer;
	private boolean interactionFailure;
	
	public void interaction(String cancelEventNull) {
		return;
	}
	public static boolean playerEventCapureInteraction;

	public C04PacketInteractionPlayer(int interactionPlayer) {
		this.interactionPlayer = interactionPlayer;
	}

	public int getInteractionPlayer() {
		return interactionPlayer;
	}

	public void setInteractionPlayer(int interactionPlayer) {
		this.interactionPlayer = interactionPlayer;
	}

	public static boolean isPlayerEventCapureInteraction() {
		return playerEventCapureInteraction;
	}

	public static void setPlayerEventCapureInteraction(boolean playerEventCapureInteraction) {
		C04PacketInteractionPlayer.playerEventCapureInteraction = playerEventCapureInteraction;
	}{
	
	if(interactionFailure) {
		
	}else {
		
	}
	
	
	}
	
	public static String interactionFalureEventCancelled;

	public C04PacketInteractionPlayer(boolean interactionFailure) {
		this.interactionFailure = interactionFailure;
	}

	public boolean isInteractionFailure() {
		return interactionFailure;
	}

	public void setInteractionFailure(boolean interactionFailure) {
		this.interactionFailure = interactionFailure;
	}
	
	
}
