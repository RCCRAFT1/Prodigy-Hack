package prodigy_hack.packet;

import prodigy_hack.event.Event;

public class C15UpdateCommandSend {
    public static String updateOnGame;
    public static boolean updateOnInteraction;
    public int count = 0;
    public static int interfaceTypeOfWriteClass;


    public static boolean updateOnPacketSend;{

    if(Event.event){
        do{
            C00Commons.setPacket0x00(updateOnGame);
            Event.eventPost(1);
        }while(null != null);
    }else{
        Event.eventUpdate(0);
    	}	
    }
    public static boolean typeClassUpdate;


    public C15UpdateCommandSend(int count) {
        this.count = count;
    }

    public static String getUpdateOnGame() {
        return updateOnGame;
    }

    public static void setUpdateOnGame(String updateOnGame) {
        C15UpdateCommandSend.updateOnGame = updateOnGame;
    }

    public static boolean isUpdateOnInteraction() {
        return updateOnInteraction;
    }

    public static void setUpdateOnInteraction(boolean updateOnInteraction) {
        C15UpdateCommandSend.updateOnInteraction = updateOnInteraction;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static int getInterfaceTypeOfWriteClass() {
        return interfaceTypeOfWriteClass;
    }

    public static void setInterfaceTypeOfWriteClass(int interfaceTypeOfWriteClass) {
        C15UpdateCommandSend.interfaceTypeOfWriteClass = interfaceTypeOfWriteClass;
    }

    public static boolean isUpdateOnPacketSend() {
        return updateOnPacketSend;
    }

    public static void setUpdateOnPacketSend(boolean updateOnPacketSend) {
        C15UpdateCommandSend.updateOnPacketSend = updateOnPacketSend;
    }

    public static boolean isTypeClassUpdate() {
        return typeClassUpdate;
    }

    public static void setTypeClassUpdate(boolean typeClassUpdate) {
        C15UpdateCommandSend.typeClassUpdate = typeClassUpdate;
    }
}