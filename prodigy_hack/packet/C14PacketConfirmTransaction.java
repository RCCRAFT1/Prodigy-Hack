package prodigy_hack.packet;

public class C14PacketConfirmTransaction {
    public static boolean  confirmTransaction;
    public static boolean confirmTransactionGame;
    public static boolean confirmTransactionPlayer;
    public static boolean confirmTransactionServer;
    public static boolean confirmTransactionEntity;
    public static boolean confirmTransactionInteraction;

    public void confirmTransaction(int transaction) {
        return;
    }

    public C14PacketConfirmTransaction() {
        super();
    }

    public static boolean isConfirmTransaction() {
        return confirmTransaction;
    }

    public static void setConfirmTransaction(boolean confirmTransaction) {
        C14PacketConfirmTransaction.confirmTransaction = confirmTransaction;
    }

    public static boolean isConfirmTransactionGame() {
        return confirmTransactionGame;
    }

    public static void setConfirmTransactionGame(boolean confirmTransactionGame) {
        C14PacketConfirmTransaction.confirmTransactionGame = confirmTransactionGame;
    }

    public static boolean isConfirmTransactionPlayer() {
        return confirmTransactionPlayer;
    }

    public static void setConfirmTransactionPlayer(boolean confirmTransactionPlayer) {
        C14PacketConfirmTransaction.confirmTransactionPlayer = confirmTransactionPlayer;
    }

    public static boolean isConfirmTransactionServer() {
        return confirmTransactionServer;
    }

    public static void setConfirmTransactionServer(boolean confirmTransactionServer) {
        C14PacketConfirmTransaction.confirmTransactionServer = confirmTransactionServer;
    }

    public static boolean isConfirmTransactionEntity() {
        return confirmTransactionEntity;
    }

    public static void setConfirmTransactionEntity(boolean confirmTransactionEntity) {
        C14PacketConfirmTransaction.confirmTransactionEntity = confirmTransactionEntity;
    }

    public static boolean isConfirmTransactionInteraction() {
        return confirmTransactionInteraction;
    }

    public static void setConfirmTransactionInteraction(boolean confirmTransactionInteraction) {
        C14PacketConfirmTransaction.confirmTransactionInteraction = confirmTransactionInteraction;
    }
}
