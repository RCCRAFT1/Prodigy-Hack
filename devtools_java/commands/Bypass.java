package devtools_java.commands;

import prodigy_hack.appendPacket.PacketSend;
import prodigy_hack.event.Event;
import prodigy_hack.packet.C00Commons;
import prodigy_hack.packet.C01PacketPlayer;
import prodigy_hack.packet.C16PacketProtectionToggle;

public class Bypass {

    //use this to do basically anything
    public static String bypassCommand;
    public int bypass;
    public int bypassGlobal;

    public static String setBypassLength;
    public int bypassMaxLength;

    public void bypassCommand(){
        return;
    }{
        if(Event.event){
            do{
                C16PacketProtectionToggle.toggle();
                C16PacketProtectionToggle.togglePacket();
                C01PacketPlayer.Game();
                C00Commons.getCommonPacket();
                PacketSend.send();
            }while(null != null);
        }else{
            Event.eventUpdate(0);
        }

    }

    public Bypass(int bypass, int bypassGlobal) {
        super();
        this.bypass = bypass;
        this.bypassGlobal = bypassGlobal;
    }

    public static String getBypassCommand() {
        return bypassCommand;
    }

    public static void setBypassCommand(String bypassCommand) {
        Bypass.bypassCommand = bypassCommand;
    }

    public int getBypass() {
        return bypass;
    }

    public void setBypass(int bypass) {
        this.bypass = bypass;
    }

    public int getBypassGlobal() {
        return bypassGlobal;
    }

    public void setBypassGlobal(int bypassGlobal) {
        this.bypassGlobal = bypassGlobal;
    }


}
