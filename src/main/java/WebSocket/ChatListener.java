package WebSocket;

import WebSocket.Input.HistoryModel;
import WebSocket.Input.Thread;

import java.util.List;

public interface ChatListener {
    void onConnectionStateChanged(ChatState state);
    void MessageGetThread(List<Thread> list);
    void MessageGetHistory(HistoryModel historyModel);
}
