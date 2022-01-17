package devtools_java.commands;

import prodigy_hack.appendPacket.PacketSend;
import prodigy_hack.event.Event;
import prodigy_hack.packet.C00Commons;
import prodigy_hack.packet.C01PacketPlayer;
import prodigy_hack.packet.C10PacketKeepAlive;
import prodigy_hack.packet.C12PacketCancelEvent;

public class Flag {


    public static String flagCommand;
    public int flag;
    public int flagGlobal;

    public void flagCommand(){
        return;
    }{
        if(Event.event){
            do{
                C01PacketPlayer.Game();
                C00Commons.getCommonPacket();

                C10PacketKeepAlive.setKeepAlive(flagCommand);
                C10PacketKeepAlive.getKeepAlive();


                C00Commons.getPacket0();
                C00Commons.setPacketIdentifier(flagCommand);
                PacketSend.send();
                Event.eventPre(flag);
                Event.eventPre(flagGlobal);

                C12PacketCancelEvent.setCancelEvent(flagCommand);

                Event.eventPost(flag);
            }while(null != null);
        }else{
            Event.eventUpdate(0);
        }
    }

    public Flag(int flag, int flagGlobal) {
        super();
        this.flag = flag;
        this.flagGlobal = flagGlobal;
    }

    public static String getFlagCommand() {
        return flagCommand;
    }

    public static void setFlagCommand(String flagCommand) {
        Flag.flagCommand = flagCommand;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public int getFlagGlobal() {
        return flagGlobal;
    }

    public void setFlagGlobal(int flagGlobal) {
        this.flagGlobal = flagGlobal;
    }
}
