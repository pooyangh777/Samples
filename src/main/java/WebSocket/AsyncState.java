package WebSocket;

public enum AsyncState {
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
    Ready("AsyncReady");

    private final String value;
    AsyncState(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
