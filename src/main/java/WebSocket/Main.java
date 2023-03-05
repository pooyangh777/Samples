package WebSocket;

import WebSocket.Input.HistoryModel;
import WebSocket.Input.SendTextMessageRequest;
import WebSocket.Input.Thread;

import java.util.List;

public class Main {
    static Chat chat;

    public static void main(String[] args) {
        chat = new Chat(new ChatListener() {
            @Override
            public void onConnectionStateChanged(ChatState state) {
                System.out.println("Chat State changed" + state);
                if (state == ChatState.Ready) {
                    GetThreadRequest getThreadRequest = new GetThreadRequest(15, 0, "hamed");
                    chat.getThreads(getThreadRequest);
                    SendTextMessageRequest request = new SendTextMessageRequest("salam aqa hamed", 551015867);
                    chat.sendMessageThread(request);
                    chat.getHistory();
                }
                //IDLE
            }

            @Override
            public void MessageGetThread(List<Thread> list) {
                for (Thread t : list) {
                    System.out.println(t.getLastParticipantName());
                }
            }

            @Override
            public void MessageGetHistory(HistoryModel historyModel) {
                System.out.println(historyModel.getMessage());
            }

        });
        chat.setToken(
                "3f1549a43048424c81f35f2e63ea8c92.XzIwMjMz");
        chat.connect();
        while (true) {
        }
    }
}
