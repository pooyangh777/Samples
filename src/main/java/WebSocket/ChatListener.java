package WebSocket;

import WebSocket.Input.Thread;

import java.util.List;

public interface ChatListener {
    void onConnectionStateChanged(ChatState state);
    void sendMessageToClient(List<Thread> list);
}
