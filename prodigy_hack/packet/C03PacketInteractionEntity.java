package prodigy_hack.packet;

import prodigy_hack.event.Event;

public class C03PacketInteractionEntity extends C02PacketInteraction{
	public int interactionEntity;
	
	public void interaction(String cancelEvent) {
		return;
	}
	
	public static boolean chingChongInteraction;

	public C03PacketInteractionEntity(int interactionEntity) {
		this.interactionEntity = interactionEntity;
	}

	public int getInteractionEntity() {
		return interactionEntity;
	}

	public void setInteractionEntity(int interactionEntity) {
		this.interactionEntity = interactionEntity;
	}

	public static boolean isChingChongInteraction() {
		return chingChongInteraction;
	}

	public static void setChingChongInteraction(boolean chingChongInteraction) {
		C03PacketInteractionEntity.chingChongInteraction = chingChongInteraction;
	} {
	
	if(chingChongInteraction) {
		Event.event();
	}
	
	
	}
	public static boolean interactionFailure; {
		
	}{
	
	if(interactionFailure) {
		
	}else {
		
	}
	
	
	
	}
	public static String interactionFailureEventCancelled;
	public static String interactionCancelled;
	
	public int interactionCancelledEvent;

	public static String getInteractionFailureEventCancelled() {
		return interactionFailureEventCancelled;
	}

	public static void setInteractionFailureEventCancelled(String interactionFailureEventCancelled) {
		C03PacketInteractionEntity.interactionFailureEventCancelled = interactionFailureEventCancelled;
	}

	public int getInteractionCancelledEvent() {
		return interactionCancelledEvent;
	}

	public void setInteractionCancelledEvent(int interactionCancelledEvent) {
		this.interactionCancelledEvent = interactionCancelledEvent;
	}

	
	
	
}
