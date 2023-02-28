package WebSocket;

import com.google.gson.Gson;

import java.net.URI;

public class Chat implements AsyncListener {
    Async async;
    Gson gson = new Gson();

    public Chat() {
        async = new Async(URI.create("wss://msg.pod.ir/ws"), this);
    }

    @Override
    public void onSocketStateChanged(AsyncState state) {
        System.out.println("The state of async changed to " + state.toString());
        if (state == AsyncState.Ready) {
           getUserInfo();
        }
    }

    @Override
    public void onMessage(String message) {
        System.out.println("Chat SDK:\n" + message);
    }

    public void connect() {
        async.connect();
    }

    private void getUserInfo() {
        send(ChatMessageVOTypes.userInfo);
    }

    private void getThreads() {
        send(ChatMessageVOTypes.getThreads);
    }

    public void send(ChatMessageVOTypes type) {
        Message message = new Message();
        AsyncMessageVO asyncMessageVO = new AsyncMessageVO();
        ChatMessageVO chatMessageVO = new ChatMessageVO();
        chatMessageVO.setType(type);
        asyncMessageVO.setContent(gson.toJson(chatMessageVO));
        message.setContent(gson.toJson(asyncMessageVO)); // AsyncMessageVO toJson String

        String jsonMessageString = gson.toJson(message);
        async.send(jsonMessageString);
    }
}
