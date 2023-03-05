package WebSocket;

import WebSocket.Input.*;
import WebSocket.Input.Thread;
import WebSocket.output.GetHistoryRequest;
import WebSocket.output.SendTextMessageRequest;
import com.google.gson.Gson;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

import static WebSocket.ChatMessageVOTypes.*;

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
        int type = chatMessageResponseMessage.getType();
        switch (type) {
            case userInfo:
                onGetUserInfo(message, chatMessageResponseMessage);
                break;
            case getThreads:
                onGetThreads(message, chatMessageResponseMessage);
                break;
            case getHistory:
                onGetHistory(message, chatMessageResponseMessage);
                break;
        }
    }

    public void connect() {
        async.connect();
    }

    public void sendMessageThread(SendTextMessageRequest request) {
        sendMessage(ChatMessageVOTypes.message, gson.toJson(request), null);
    }

    public void getUserInfo() {
        sendMessage(userInfo, null, null);
    }
    public void getHistory(GetHistoryRequest request, Long subjectId) {
        sendMessage(getHistory,gson.toJson(request), subjectId);
    }

    public void getThreads(GetThreadRequest request) {
        sendMessage(getThreads, gson.toJson(request), null);
    }

    public void sendMessage(int type, String content, Long subjectId) {
        Message message = new Message();
        AsyncMessageVO asyncMessageVO = new AsyncMessageVO();
        ChatMessageVO chatMessageVO = new ChatMessageVO();
        chatMessageVO.setSubjectId(subjectId);
        chatMessageVO.setType(type);
        chatMessageVO.setToken(token);
        chatMessageVO.setContent(content);
        asyncMessageVO.setContent(gson.toJson(chatMessageVO));
        message.setContent(gson.toJson(asyncMessageVO)); // AsyncMessageVO toJson String
        String jsonMessage = gson.toJson(message);
        send(jsonMessage);
    }

    public void send(String message) {
        async.send(message);
    }

    public void setToken(String token) {
        this.token = token;
    }

    private void onGetThreads(AsyncMessageResponse message, ChatMessageResponse chatMessageResponseMessage) {
        Thread[] threads = gson.fromJson(chatMessageResponseMessage.getContent(), Thread[].class);
        List<Thread> threadList = Arrays.asList(threads);
        listener.onGetThreads(threadList);
    }

    private void onGetHistory(AsyncMessageResponse message, ChatMessageResponse chatMessageResponseMessage) {
        WebSocket.Input.Message[] messages = gson.fromJson(chatMessageResponseMessage.getContent(), WebSocket.Input.Message[].class);
        listener.onGetHistory(Arrays.asList(messages));
    }

    private void onGetUserInfo(AsyncMessageResponse message, ChatMessageResponse chatMessageResponseMessage) {
        listener.onConnectionStateChanged(ChatState.Ready);
    }
}
