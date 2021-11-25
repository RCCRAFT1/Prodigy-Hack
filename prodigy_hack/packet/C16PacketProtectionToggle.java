package prodigy_hack.packet;

import prodigy_hack.event.Event;

public class C16PacketProtectionToggle {
	public static boolean toggle;

    public int count = 0; //create a bitflip sequence
    public static boolean togglePacket;

    public static void togglePacket() {
    }

    public void setToggleStateTrue(int on){
        return;
    }
    public void setToggleStateFalse(int off){
        return;
    }

    public int getToggledState(){
       return count++;
    }{

    if(count >= 0){
        Event.eventUpdate(1);
        }else{
        Event.eventUpdate(0);
        }
    }

	public static void toggle() {
		// TODO Auto-generated method stub
		//ah yes this is prtfect
	}
}