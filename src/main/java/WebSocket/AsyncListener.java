package WebSocket;

import WebSocket.Input.AsyncMessageResponse;

public interface AsyncListener {
    void onSocketStateChanged(AsyncState state);

    void onMessage(AsyncMessageResponse message);
}
