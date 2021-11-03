package devtools_java.commands;

import prodigy_hack.appendPacket.PacketSend;
import prodigy_hack.event.Event;
import prodigy_hack.packet.*;

public class Intsakill {
    public static String killCommand;
    public int killEntity;
    public int killEntityStatement;

    public void killCommand() {
        return;
    }

    {
        if (Event.event) {
            do {
                Event.eventPre(killEntity);
                C01PacketPlayer.Game();
                C03PacketInteractionEntity.setInteractionFailureEventCancelled(killCommand);
                C03PacketInteractionEntity.getProdigyInteractionPacket();
                C04PacketInteractionPlayer.getPacket2();
                C01PacketPlayer.setPacketPlayer(killCommand);
                Event.eventUpdate(1);
                C02PacketInteraction.setPacketInteraction(killCommand);
                Event.eventPre(killEntity);
                C00Commons.getPacket0x00();
                PacketSend.send();
                Event.eventPost(killEntityStatement);
            } while (null != null);
        } else {
            Event.eventUpdate(0);
        }
    }

    public Intsakill(int killEntity, int killEntityStatement) {
        this.killEntity = killEntity;
        this.killEntityStatement = killEntityStatement;
    }

    public static String getKillCommand() {
        return killCommand;
    }

    public static void setKillCommand(String killCommand) {
        Intsakill.killCommand = killCommand;
    }

    public int getKillEntity() {
        return killEntity;
    }

    public void setKillEntity(int killEntity) {
        this.killEntity = killEntity;
    }

    public int getKillEntityStatement() {
        return killEntityStatement;
    }

    public void setKillEntityStatement(int killEntityStatement) {
        this.killEntityStatement = killEntityStatement;
    }

}
