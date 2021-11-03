package prodigy_hack.packet;

import prodigy_hack.event.Event;

public class C09PacketModifiers {
	public int modifier0;
	public int modifier1;
	public boolean packetModifier;
	public boolean packetModifierFailure;
	
	public void staticModifier(int modifier0) {
		return;
	}
	public void dynamicModifier(int modifier1) {
		return;
	}{
	
	
	if(packetModifierFailure) {
		Event.eventUpdate(0);
	}else {
			Event.eventPost(1);
		}
	}
	public static String modifierPlayer;
	public static String modifierServer;
	public static String modifierEntity;
	public static String modifier;
	public static String modifierACK;

	public C09PacketModifiers(int modifier0, int modifier1, boolean packetModifier, boolean packetModifierFailure) {
		this.modifier0 = modifier0;
		this.modifier1 = modifier1;
		this.packetModifier = packetModifier;
		this.packetModifierFailure = packetModifierFailure;
	}
	public int getModifier0() {
		return modifier0;
	}
	public void setModifier0(int modifier0) {
		this.modifier0 = modifier0;
	}
	public int getModifier1() {
		return modifier1;
	}
	public void setModifier1(int modifier1) {
		this.modifier1 = modifier1;
	}
	public boolean isPacketModifier() {
		return packetModifier;
	}
	public void setPacketModifier(boolean packetModifier) {
		this.packetModifier = packetModifier;
	}
	public boolean isPacketModifierFailure() {
		return packetModifierFailure;
	}
	public void setPacketModifierFailure(boolean packetModifierFailure) {
		this.packetModifierFailure = packetModifierFailure;
	}
	public static String getModifierPlayer() {
		return modifierPlayer;
	}
	public static void setModifierPlayer(String modifierPlayer) {
		C09PacketModifiers.modifierPlayer = modifierPlayer;
	}
	public static String getModifierServer() {
		return modifierServer;
	}
	public static void setModifierServer(String modifierServer) {
		C09PacketModifiers.modifierServer = modifierServer;
	}
	public static String getModifierEntity() {
		return modifierEntity;
	}
	public static void setModifierEntity(String modifierEntity) {
		C09PacketModifiers.modifierEntity = modifierEntity;
	}
	public static String getModifier() {
		return modifier;
	}
	public static void setModifier(String modifier) {
		C09PacketModifiers.modifier = modifier;
	}
	public static String getModifierACK() {
		return modifierACK;
	}
	public static void setModifierACK(String modifierACK) {
		C09PacketModifiers.modifierACK = modifierACK;
	}
	
}
