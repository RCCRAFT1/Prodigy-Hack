package devtools_java.commands;

public class Prod {
	//TODO  Make constructors for the entire platform engine. {C}
    //TODO Make player packets always cancel events no matter what. {C}
    //TODO Make only interact cancel if object was unreachable. {C}
    //TODO Make proper methods {C}


    //Game methods
    public  boolean prodigyGame;
    public  String game;

    //packet methods
    public boolean prodigyPacket;
    public  String packetPlayer;
    public  String packetServer;
    public  String packetACK;
    public  String packetInteract;

    //interact methods
    public boolean prodigyInteraction;
    public  String interactionPlayer;
    public  String interactionGame;
    public  String interactionEntity;
    public  String interactionServer;
    //event methods
    public boolean Event;
    public  String eventPre;
    public  String evenPost;
    public  String eventUpdate;
    //engine methods
    public boolean engine;
    public  String EnumInterface;
    public  String LangRunAppendLibrary;
    public  String MathVoid;
    public  String Prodigy;
    public  String ProdigyInterface;

    public boolean isProdigyGame() {
        return prodigyGame;
    }

    public void setProdigyGame(boolean prodigyGame) {
        this.prodigyGame = prodigyGame;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public boolean isProdigyPacket() {
        return prodigyPacket;
    }

    public void setProdigyPacket(boolean prodigyPacket) {
        this.prodigyPacket = prodigyPacket;
    }

    public String getPacketPlayer() {
        return packetPlayer;
    }

    public void setPacketPlayer(String packetPlayer) {
        this.packetPlayer = packetPlayer;
    }

    public String getPacketServer() {
        return packetServer;
    }

    public void setPacketServer(String packetServer) {
        this.packetServer = packetServer;
    }

    public String getPacketACK() {
        return packetACK;
    }

    public void setPacketACK(String packetACK) {
        this.packetACK = packetACK;
    }

    public String getPacketInteract() {
        return packetInteract;
    }

    public void setPacketInteract(String packetInteract) {
        this.packetInteract = packetInteract;
    }

    public boolean isProdigyInteraction() {
        return prodigyInteraction;
    }

    public void setProdigyInteraction(boolean prodigyInteraction) {
        this.prodigyInteraction = prodigyInteraction;
    }

    public String getInteractionPlayer() {
        return interactionPlayer;
    }

    public void setInteractionPlayer(String interactionPlayer) {
        this.interactionPlayer = interactionPlayer;
    }

    public String getInteractionGame() {
        return interactionGame;
    }

    public void setInteractionGame(String interactionGame) {
        this.interactionGame = interactionGame;
    }

    public String getInteractionEntity() {
        return interactionEntity;
    }

    public void setInteractionEntity(String interactionEntity) {
        this.interactionEntity = interactionEntity;
    }

    public String getInteractionServer() {
        return interactionServer;
    }

    public void setInteractionServer(String interactionServer) {
        this.interactionServer = interactionServer;
    }

    public boolean isEvent() {
        return Event;
    }

    public void setEvent(boolean event) {
        Event = event;
    }

    public String getEventPre() {
        return eventPre;
    }

    public void setEventPre(String eventPre) {
        this.eventPre = eventPre;
    }

    public String getEvenPost() {
        return evenPost;
    }

    public void setEvenPost(String evenPost) {
        this.evenPost = evenPost;
    }

    public String getEventUpdate() {
        return eventUpdate;
    }

    public void setEventUpdate(String eventUpdate) {
        this.eventUpdate = eventUpdate;
    }

    public boolean isEngine() {
        return engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public String getEnumInterface() {
        return EnumInterface;
    }

    public void setEnumInterface(String enumInterface) {
        EnumInterface = enumInterface;
    }

    public String getLangRunAppendLibrary() {
        return LangRunAppendLibrary;
    }

    public void setLangRunAppendLibrary(String langRunAppendLibrary) {
        LangRunAppendLibrary = langRunAppendLibrary;
    }

    public String getMathVoid() {
        return MathVoid;
    }

    public void setMathVoid(String mathVoid) {
        MathVoid = mathVoid;
    }

    public String getProdigy() {
        return Prodigy;
    }

    public void setProdigy(String prodigy) {
        Prodigy = prodigy;
    }

    public String getProdigyInterface() {
        return ProdigyInterface;
    }

    public void setProdigyInterface(String prodigyInterface) {
        ProdigyInterface = prodigyInterface;
    }

    public Prod(boolean prodigyGame, String game, boolean prodigyPacket, String packetPlayer, String packetServer, String packetACK, String packetInteract, boolean prodigyInteraction, String interactionPlayer, String interactionGame, String interactionEntity, String interactionServer, boolean event, String eventPre, String evenPost, String eventUpdate, boolean engine, String enumInterface, String langRunAppendLibrary, String mathVoid, String prodigy, String prodigyInterface) {
        this.prodigyGame = prodigyGame;
        this.game = game;
        this.prodigyPacket = prodigyPacket;
        this.packetPlayer = packetPlayer;
        this.packetServer = packetServer;
        this.packetACK = packetACK;
        this.packetInteract = packetInteract;
        this.prodigyInteraction = prodigyInteraction;
        this.interactionPlayer = interactionPlayer;
        this.interactionGame = interactionGame;
        this.interactionEntity = interactionEntity;
        this.interactionServer = interactionServer;
        Event = event;
        this.eventPre = eventPre;
        this.evenPost = evenPost;
        this.eventUpdate = eventUpdate;
        this.engine = engine;
        EnumInterface = enumInterface;
        LangRunAppendLibrary = langRunAppendLibrary;
        MathVoid = mathVoid;
        Prodigy = prodigy;
        ProdigyInterface = prodigyInterface;
    }
}
