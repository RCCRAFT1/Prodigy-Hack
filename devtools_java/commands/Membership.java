package devtools_java.commands;

import prodigy_hack.appendPacket.PacketSend;
import prodigy_hack.event.Event;
import prodigy_hack.packet.C00Commons;
import prodigy_hack.packet.C01PacketPlayer;
import prodigy_hack.packet.C04PacketInteractionPlayer;

public class Membership {
	public static String memberShip;
	public static String memberState;
	public int membershipAdd;
	public int membershipState;
	public int membershipStatementEvent;
	int count = 0;
	
	public void membershipState() {
		return;
	}{
		if(Event.eventUpdate) {
			Object value = null;
			
			do {
				Event.eventUpdate(membershipAdd);
				C01PacketPlayer.getPacket1();
				PacketSend.send();
				Event.eventUpdate(membershipState);
				C00Commons.getPacket0x00();
				C00Commons.getCommonPacket();
				C04PacketInteractionPlayer.isPlayerEventCapureInteraction();
				PacketSend.send();
				count++;
			}while(value != null);
		}else {
			Event.eventPre(1);
		}
		
	}
	public Membership(int membershipAdd, int membershipState, int membershipStatementEvent) {
		super();
		this.membershipAdd = membershipAdd;
		this.membershipState = membershipState;
		this.membershipStatementEvent = membershipStatementEvent;
	}
	public static String getMemberShip() {
		return memberShip;
	}
	public static void setMemberShip(String memberShip) {
		Membership.memberShip = memberShip;
	}
	public static String getMemberState() {
		return memberState;
	}
	public static void setMemberState(String memberState) {
		Membership.memberState = memberState;
	}
	public int getMembershipAdd() {
		return membershipAdd;
	}
	public void setMembershipAdd(int membershipAdd) {
		this.membershipAdd = membershipAdd;
	}
	public int getMembershipState() {
		return membershipState;
	}
	public void setMembershipState(int membershipState) {
		this.membershipState = membershipState;
	}
	public int getMembershipStatementEvent() {
		return membershipStatementEvent;
	}
	public void setMembershipStatementEvent(int membershipStatementEvent) {
		this.membershipStatementEvent = membershipStatementEvent;
	}
	
}
