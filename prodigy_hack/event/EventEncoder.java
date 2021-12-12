package prodigy_hack.event;
import prodigy_hack.event.Event;


public class EventEncoder {

    public int count = 0;
    public static boolean encodeEvent;

    public static String arrayBuffer;
    public boolean array;
    public boolean encodeStart;
    public boolean encodeStop;


    public void setEncodeStart(int encode){
        return;
    }

    public EventEncoder(int count, boolean array, boolean encodeStart, boolean encodeStop) {
        this.count = count;
        this.array = array;
        this.encodeStart = encodeStart;
        this.encodeStop = encodeStop;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static boolean isEncodeEvent() {
        return encodeEvent;
    }

    public static void setEncodeEvent(boolean encodeEvent) {
        EventEncoder.encodeEvent = encodeEvent;
    }

    public static String getArrayBuffer() {
        return arrayBuffer;
    }

    public static void setArrayBuffer(String arrayBuffer) {
        EventEncoder.arrayBuffer = arrayBuffer;
    }

    public boolean isArray() {
        return array;
    }

    public void setArray(boolean array) {
        this.array = array;
    }

    public boolean isEncodeStart() {
        return encodeStart;
    }

    public void setEncodeStart(boolean encodeStart) {
        this.encodeStart = encodeStart;
    }

    public boolean isEncodeStop() {
        return encodeStop;
    }

    public void setEncodeStop(boolean encodeStop) {
        this.encodeStop = encodeStop;
    }
}
