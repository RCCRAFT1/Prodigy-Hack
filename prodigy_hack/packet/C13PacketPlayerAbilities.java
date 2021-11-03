package prodigy_hack.packet;


import prodigy_hack.event.Event;

public class C13PacketPlayerAbilities {
	public static boolean abilities;
    public static boolean misplacedAbilities;
    public static boolean abilitiesCancelEvent;

    public void packetPlayer(int player){
        return;
    }
    public void packetPlayerAbilities(){
        Event.eventPost(0);
    }

    public C13PacketPlayerAbilities(boolean abilities, boolean misplacedAbilities, boolean abilitiesCancelEvent) {
        super();
        C13PacketPlayerAbilities.abilities = abilities;
        C13PacketPlayerAbilities.misplacedAbilities = misplacedAbilities;
        C13PacketPlayerAbilities.abilitiesCancelEvent = abilitiesCancelEvent;
    }

    public static boolean isAbilities() {
        return abilities;
    }

    public static void setAbilities(boolean abilities) {
        C13PacketPlayerAbilities.abilities = abilities;
    }

    public static boolean isMisplacedAbilities() {
        return misplacedAbilities;
    }

    public static void setMisplacedAbilities(boolean misplacedAbilities) {
        C13PacketPlayerAbilities.misplacedAbilities = misplacedAbilities;
    }
}
