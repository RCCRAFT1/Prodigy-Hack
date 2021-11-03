package prodigy_hack.event;

public class EventUpdate {
	//Use different methods
	
	public int eventUpdate;
	public int eventUpdateRoute;
	public boolean eventUpdateCancel;
	
	public void eventUpdateSpeical() {
		return;
	}

	public EventUpdate(int eventUpdate, int eventUpdateRoute, boolean eventUpdateCancel) {
		this.eventUpdate = eventUpdate;
		this.eventUpdateRoute = eventUpdateRoute;
		this.eventUpdateCancel = eventUpdateCancel;
	}

	public int getEventUpdate() {
		return eventUpdate;
	}

	public void setEventUpdate(int eventUpdate) {
		this.eventUpdate = eventUpdate;
	}

	public int getEventUpdateRoute() {
		return eventUpdateRoute;
	}

	public void setEventUpdateRoute(int eventUpdateRoute) {
		this.eventUpdateRoute = eventUpdateRoute;
	}

	public boolean isEventUpdateCancel() {
		return eventUpdateCancel;
	}

	public void setEventUpdateCancel(boolean eventUpdateCancel) {
		this.eventUpdateCancel = eventUpdateCancel;
	}
	
	
}
