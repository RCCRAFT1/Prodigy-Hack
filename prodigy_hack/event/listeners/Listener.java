package prodigy_hack.event.listeners;

public class Listener {
    public boolean listenerMain;
    public static String yourMom;

    public void listenerDirection(String bufferArray){
        return;
    }
    public boolean listenerDirection;
    public int count = 0;

    public Listener(boolean listenerMain, boolean listenerDirection, int count) {
        super();
        this.listenerMain = listenerMain;
        this.listenerDirection = listenerDirection;
        this.count = count;
    }

    public boolean isListenerMain() {
        return listenerMain;
    }

    public void setListenerMain(boolean listenerMain) {
        this.listenerMain = listenerMain;
    }

    public static String getYourMom() {
        return yourMom;
    }

    public static void setYourMom(String yourMom) {
        Listener.yourMom = yourMom;
    }

    public boolean isListenerDirection() {
        return listenerDirection;
    }

    public void setListenerDirection(boolean listenerDirection) {
        this.listenerDirection = listenerDirection;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
