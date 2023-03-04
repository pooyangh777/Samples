package WebSocket;

import WebSocket.Input.AsyncMessageResponse;
import WebSocket.Input.ChatMessageResponse;
import WebSocket.Input.Thread;
import com.google.gson.Gson;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

public class Chat implements AsyncListener {
    private final ChatListener listener;
    Async async;
    Gson gson = new Gson();
    private String token;

    public Chat(ChatListener listener) {
        async = new Async(URI.create("wss://msg.pod.ir/ws"), this);
        this.listener = listener;
    }

    @Override
    public void onSocketStateChanged(AsyncState state) {
        System.out.println("The state of async changed to " + state.toString());
        if (state == AsyncState.Ready) {
            getUserInfo();
        }
    }

    @Override
    public void onMessage(AsyncMessageResponse message) {
        //Message
        ChatMessageResponse chatMessageResponseMessage = gson.fromJson(message.getContent(), ChatMessageResponse.class);
        if (chatMessageResponseMessage.getType() == 23) {
            // Chat READY
            listener.onConnectionStateChanged(ChatState.Ready);
        } else if (chatMessageResponseMessage.getType() == 14) {
            Thread[] threads = gson.fromJson(chatMessageResponseMessage.getContent(), Thread[].class);
            List<Thread> threadList = Arrays.asList(threads);
            listener.sendMessageToClient(threadList);

        }
    }

    public void connect() {
        async.connect();
    }

    public void getUserInfo() {
        send(ChatMessageVOTypes.userInfo);
    }

    public void getThreads(GetThreadRequest getThreadRequest) {
        Message message = new Message();
        AsyncMessageVO asyncMessageVO = new AsyncMessageVO();
        ChatMessageVO chatMessageVO = new ChatMessageVO();
        chatMessageVO.setType(ChatMessageVOTypes.getThreads);
        chatMessageVO.setToken(token);
        chatMessageVO.setContent(gson.toJson(getThreadRequest));
        asyncMessageVO.setContent(gson.toJson(chatMessageVO));
        message.setContent(gson.toJson(asyncMessageVO)); // AsyncMessageVO toJson String
        String jsonMessageString = gson.toJson(message);
        async.send(jsonMessageString);
    }

    public void send(ChatMessageVOTypes type) {
        Message message = new Message();
        AsyncMessageVO asyncMessageVO = new AsyncMessageVO();
        ChatMessageVO chatMessageVO = new ChatMessageVO();
        chatMessageVO.setType(type);
        chatMessageVO.setToken(token);
        asyncMessageVO.setContent(gson.toJson(chatMessageVO));
        message.setContent(gson.toJson(asyncMessageVO)); // AsyncMessageVO toJson String
        String jsonMessageString = gson.toJson(message);
        async.send(jsonMessageString);
    }

    public void setToken(String token) {
        this.token = token;
    }
}
