package WebSocket;

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
                    GetThreadRequest getThreadRequest=new GetThreadRequest(15,0,"hamed");
                    chat.getThreads(getThreadRequest);
                }
                //IDLE
            }

            @Override
            public void sendMessageToClient(List<Thread> list) {
                for (Thread t : list) {
                    System.out.println(t.getLastParticipantName());
                }
            }

        });
        chat.setToken("7dcc537874eb4bc082151b671f6b665e.XzIwMjMz");
        chat.connect();
        while (true) {
        }
    }
}
