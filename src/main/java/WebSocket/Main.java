package WebSocket;

import WebSocket.Input.Message;
import WebSocket.Input.Thread;
import WebSocket.output.GetHistoryRequest;

import java.util.List;

public class Main {
    static Chat chat;

    public static void main(String[] args) {
        chat = new Chat(new ChatListener() {
            @Override
            public void onConnectionStateChanged(ChatState state) {
                System.out.println("Chat State changed" + state);
                if (state == ChatState.Ready) {
//                    GetThreadRequest getThreadRequest = new GetThreadRequest(15, 0, "hamed");
//                    chat.getThreads(getThreadRequest);

//                    SendTextMessageRequest request = new SendTextMessageRequest("salam aqa hamed", 551015867);
//                    chat.sendMessageThread(request);
                    GetHistoryRequest request = new GetHistoryRequest();
                    request.setCount(50);
                    request.setOffset(0);
                    chat.getHistory(request, 3252552L);
                }
                //IDLE
            }

            @Override
            public void onGetThreads(List<Thread> list) {
                for (Thread t : list) {
                    System.out.println(t.getLastParticipantName());
                }
            }

            @Override
            public void onGetHistory(List<Message> messages) {
                for (Message message: messages) {
                    System.out.println(message.toString());
                }
            }
        });
        chat.setToken("786df54c62c440cdb4ca67e4e6122a1a.XzIwMjMz");
        chat.connect();
        while (true) {
        }
    }
}
