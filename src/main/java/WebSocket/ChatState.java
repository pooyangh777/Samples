package WebSocket;

public enum ChatState {
    /**
     * The socket is connecting.
     */
    Connecting("Connecting"),

    /**
     * The socket is already connected.
     */
    Connected("Connected"),

    /**
     * The socket closed due to weak internet connectivity or an error that had happened on the server.
     */
    Closed("Closed"),

    /**
     * Async is ready to use.
     */
    Ready("ChatReady");

    private final String value;
    ChatState(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
