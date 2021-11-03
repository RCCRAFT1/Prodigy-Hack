package prodigy_hack.event;

public class EventPre extends Event {{
	if(eventPre) {
		Event.eventPre();
		}else {
			Event.eventPost(0);
		}
	
	}
	public static String modifierPre;
	
	public int eventNull;

	public EventPre(int eventNull) {
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
