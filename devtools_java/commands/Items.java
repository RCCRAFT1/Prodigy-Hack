package devtools_java.commands;

import prodigy_hack.appendPacket.PacketSend;
import prodigy_hack.event.Event;
import prodigy_hack.packet.C00Commons;
import prodigy_hack.packet.C01PacketPlayer;
import prodigy_hack.packet.C02PacketInteraction;
import prodigy_hack.packet.C06PacketServer;

public class Items {
	public static String itemsCommand;
	public int itemsAdd;
	public int itemsEventStatement;
	
	public void itemCommand() {
		return;
	}{
		if(Event.eventPre) {
			do {
				Event.eventUpdate(itemsAdd);
				C00Commons.getCommonPacket();
				C00Commons.getPacket0();
				C00Commons.getPacketIdentifier();
				C02PacketInteraction.getPacketInteraction();
				C06PacketServer.update();
				C01PacketPlayer.Game();
				PacketSend.send();
			}while(null != null);
		}else {
			Event.eventPre(0);
		}
	}
	public Items(int itemsAdd, int itemsEventStatement) {
		super();
		this.itemsAdd = itemsAdd;
		this.itemsEventStatement = itemsEventStatement;
	}
	public static String getItemsCommand() {
		return itemsCommand;
	}
	public static void setItemsCommand(String itemsCommand) {
		Items.itemsCommand = itemsCommand;
	}
	public int getItemsAdd() {
		return itemsAdd;
	}
	public void setItemsAdd(int itemsAdd) {
		this.itemsAdd = itemsAdd;
	}
	public int getItemsEventStatement() {
		return itemsEventStatement;
	}
	public void setItemsEventStatement(int itemsEventStatement) {
		this.itemsEventStatement = itemsEventStatement;
	}
	
}
