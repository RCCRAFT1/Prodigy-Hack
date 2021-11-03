package devtools_java.commands;

import prodigy_hack.appendPacket.PacketSend;
import prodigy_hack.event.Event;
import prodigy_hack.packet.C00Commons;
import prodigy_hack.packet.C01PacketPlayer;
import prodigy_hack.packet.C02PacketInteraction;

public class Stars {
	public static String starsCommand;
	public int starsAdd;
	public int starAddStatementAmount;
	public int starAddLabel;
	int count = 0;
	
	public void starCommand() {
		return;
	}{
		if(Event.event) {
			do {
				Event.eventPre(starsAdd);
				C01PacketPlayer.getPacketPlayer();
				C00Commons.getCommonPacket();
				C00Commons.getPacket0x00();
				C01PacketPlayer.Game();
				Event.eventPost(0);
				C02PacketInteraction.getProdigyInteractionPacket();
				C02PacketInteraction.setPacket2(starsCommand);
				C01PacketPlayer.setPacketPlayer(starsCommand);
				PacketSend.send();
				count++;
			}while(null != null);
		}else {
			Event.eventUpdate(0);
		}
	}
	public Stars(int starsAdd, int starAddStatementAmount, int starAddLabel, int count) {
		super();
		this.starsAdd = starsAdd;
		this.starAddStatementAmount = starAddStatementAmount;
		this.starAddLabel = starAddLabel;
		this.count = count;
	}
	public static String getStarsCommand() {
		return starsCommand;
	}
	public static void setStarsCommand(String starsCommand) {
		Stars.starsCommand = starsCommand;
	}
	public int getStarsAdd() {
		return starsAdd;
	}
	public void setStarsAdd(int starsAdd) {
		this.starsAdd = starsAdd;
	}
	public int getStarAddStatementAmount() {
		return starAddStatementAmount;
	}
	public void setStarAddStatementAmount(int starAddStatementAmount) {
		this.starAddStatementAmount = starAddStatementAmount;
	}
	public int getStarAddLabel() {
		return starAddLabel;
	}
	public void setStarAddLabel(int starAddLabel) {
		this.starAddLabel = starAddLabel;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
}
