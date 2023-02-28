package WebSocket;

public interface AsyncListener {
    void onSocketStateChanged(AsyncState state);

    void onMessage(String message);
}
