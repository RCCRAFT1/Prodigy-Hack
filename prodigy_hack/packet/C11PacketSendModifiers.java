package prodigy_hack.packet;

import prodigy_hack.event.Event;

public class C11PacketSendModifiers {
	public static String modifier1;
	public static String modifier2;
	int count = 0;
	public boolean attachModifierString;

	public static String getModifier1() {
		return modifier1;
	}

	public static void setModifier1(String modifier1) {
		C11PacketSendModifiers.modifier1 = modifier1;
	}

	public static String getModifier2() {
		return modifier2;
	}

	public static void setModifier2(String modifier2) {
		C11PacketSendModifiers.modifier2 = modifier2;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean isAttachModifierString() {
		return attachModifierString;
	}

	public void setAttachModifierString(boolean attachModifierString) {
		this.attachModifierString = attachModifierString;
	}

	public C11PacketSendModifiers(int count, boolean attachModifierString) {
		super();
		this.count = count;
		this.attachModifierString = attachModifierString;
	}

	{

	if(Event.eventPost){
		do{
			C00Commons.setPacketIdentifier(null);
			C01PacketPlayer.Game();
		}while(null != null);
	}else {
		Event.eventUpdate(0);
		}
	count++;


	}
}