package WebSocket;

public enum AsyncType {
    Ping(0),
    ServerRegister(1),
    DeviceRegister(2),
    Message(3),
    MessageAckNeeded(4),
    MessageSenderAckNeeded(5),
    Ack(6),
    PeerRemoved(-3),
    ErrorMessage(-99),
    Unknown(-100);
    final int value;

    AsyncType(int type) {
        this.value = type;
    }

    public static AsyncType check(int type) {
        switch (type) {
            case 0:
                return Ping;
            case 1:
                return ServerRegister;
            case 2:
                return DeviceRegister;
            case 3:
                return Message;
            case 4:
                return MessageAckNeeded;
            case 5:
                return MessageSenderAckNeeded;
            case 6:
                return Ack;
            case -3:
                return PeerRemoved;
            case -99:
                return ErrorMessage;
            case -100:
                return Unknown;
        }
        return null;
    }


}

