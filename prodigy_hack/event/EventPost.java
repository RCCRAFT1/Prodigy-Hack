package prodigy_hack.event;

public class EventPost {{
	boolean eventPost = false;
	if(eventPost) {
		Event.eventUpdate(1);
		}else {
			Event.eventUpdate(0);
		}
	
	}
	public static String modifierPre;
	
	public int eventNull;

	public EventPost(int eventNull) {
		this.eventNull = eventNull;
	}

	public static String getModifierPre() {
		return modifierPre;
	}

	public static void setModifierPre(String modifierPre) {
		EventPre.modifierPre = modifierPre;
	}

	public int getEventNull() {
		return eventNull;
	}

	public void setEventNull(int eventNull) {
		this.eventNull = eventNull;
	}
	
}
