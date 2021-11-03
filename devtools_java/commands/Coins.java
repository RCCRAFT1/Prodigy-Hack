package devtools_java.commands;

import prodigy_hack.appendPacket.PacketSend;
import prodigy_hack.event.Event;
import prodigy_hack.packet.*;

public class Coins {
	public static String coinCommand;
	public int coinsAdd;
	public int coinsAddStatementAmount;
	int count = 0;
	public void coinCommand() {
		return;
	}{
	if(Event.eventPost) {
		do {
			Event.eventPost(coinsAdd);
			C01PacketPlayer.Game();
			C00Commons.getPacketIdentifier();
			C00Commons.getCommonPacket();
			C01PacketPlayer.getPacketPlayer();
			C01PacketPlayer.setPacketPlayer(coinCommand);
			PacketSend.send();
			count++;
			break;
		}while(null != null);
	}else {
		Event.eventUpdate(0);
		}
	}{
	switch(coinsAddStatementAmount) {

		}
	}
	public Coins(int coinsAdd, int coinsAddStatementAmount) {
		super();
		this.coinsAdd = coinsAdd;
		this.coinsAddStatementAmount = coinsAddStatementAmount;
	}
	public static String getCoinCommand() {
		return coinCommand;
	}
	public static void setCoinCommand(String coinCommand) {
		Coins.coinCommand = coinCommand;
	}
	public int getCoinsAdd() {
		return coinsAdd;
	}
	public void setCoinsAdd(int coinsAdd) {
		this.coinsAdd = coinsAdd;
	}
	public int getCoinsAddStatementAmount() {
		return coinsAddStatementAmount;
	}
	public void setCoinsAddStatementAmount(int coinsAddStatementAmount) {
		this.coinsAddStatementAmount = coinsAddStatementAmount;
	}
	
}