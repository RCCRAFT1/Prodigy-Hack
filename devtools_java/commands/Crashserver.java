package devtools_java.commands;

import prodigy_hack.event.Event;
import prodigy_hack.packet.*;

public class Crashserver {
	//TODO your mom

    public static String crashServerCommand;
    public int crashServer;
    public int crashServerGlobal;

public void crashServerCommand(){
    return;
    }{
    if(Event.event){
        do{
            C01PacketPlayer.Game();
            C00Commons.getPacket0x00();
            C00Commons.getCommonPacket();
            C00Commons.setPacket0x00(crashServerCommand);
            C07PacketACK.getPacketHandling();


            C12PacketCancelEvent.getCancelEvent();
            C01PacketPlayer.setPacketPlayer(crashServerCommand);
            Event.eventPre(crashServer);
            Event.eventPre(crashServerGlobal);
            C02PacketInteraction.setProdigyInteractionPacket(crashServerCommand);
            C03PacketInteractionEntity.setInteractionFailureEventCancelled(crashServerCommand);
            Event.eventPost(crashServer);
        }while(null !=null);
    }else{
        Event.eventUpdate(0);
        }
    }

    public Crashserver(int crashServer, int crashServerGlobal) {
         super();
        this.crashServer = crashServer;
        this.crashServerGlobal = crashServerGlobal;
    }

    public static String getCrashServerCommand() {
        return crashServerCommand;
    }

    public static void setCrashServerCommand(String crashServerCommand) {
        Crashserver.crashServerCommand = crashServerCommand;
    }

    public int getCrashServer() {
        return crashServer;
    }

    public void setCrashServer(int crashServer) {
        this.crashServer = crashServer;
    }

    public int getCrashServerGlobal() {
        return crashServerGlobal;
    }

    public void setCrashServerGlobal(int crashServerGlobal) {
        this.crashServerGlobal = crashServerGlobal;
    }

}
