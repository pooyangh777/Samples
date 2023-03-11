package WebSocket;

import WebSocket.Input.Message;
import WebSocket.Input.Thread;

import java.util.List;

public interface ChatListener {
    void onConnectionStateChanged(ChatState state);
    void onGetThreads(List<Thread> list);
    void onGetHistory(List<Message> historyModel);
}
