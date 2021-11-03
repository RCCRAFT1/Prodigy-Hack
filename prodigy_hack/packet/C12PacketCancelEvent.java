package prodigy_hack.packet;


public class C12PacketCancelEvent {
    public static String cancelEvent;
    public boolean cancelEventTrue;
    public boolean cancelEventFalse;

    public int count = 0;
    public void methodCancelEvent() {
        return;
    }
    public boolean cancelEventString(){
        return this.hashCode(0);
    }
	private boolean hashCode(int i) {
		// TODO Auto-generated method stub
		return false;
	}

    public static String getCancelEvent() {
        return cancelEvent;
    }

    public static void setCancelEvent(String cancelEvent) {
        C12PacketCancelEvent.cancelEvent = cancelEvent;
    }

    public boolean isCancelEventTrue() {
        return cancelEventTrue;
    }

    public void setCancelEventTrue(boolean cancelEventTrue) {
        this.cancelEventTrue = cancelEventTrue;
    }

    public boolean isCancelEventFalse() {
        return cancelEventFalse;
    }

    public void setCancelEventFalse(boolean cancelEventFalse) {
        this.cancelEventFalse = cancelEventFalse;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public C12PacketCancelEvent(boolean cancelEventTrue, boolean cancelEventFalse, int count) {
        super();
        this.cancelEventTrue = cancelEventTrue;
        this.cancelEventFalse = cancelEventFalse;
        this.count = count;
    }
}
