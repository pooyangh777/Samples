package WebSocket;

import com.google.gson.Gson;

import javax.websocket.*;
import java.io.IOException;
import java.net.URI;
import java.nio.ByteBuffer;

@ClientEndpoint
public class WebSocketClass {
    URI url;
    WebSocketContainer container;
    Session session;
    Gson gson = new Gson();
    String deviceId;

    public WebSocketClass(URI url) {
        this.url = url;
        container = ContainerProvider.getWebSocketContainer();
    }

    public void connect() {
        try {
            session = container.connectToServer(this, url);
        } catch (DeploymentException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    @OnMessage
    public void onMessage(String message) {
        System.out.println(message);
        AsyncModelClass response = gson.fromJson(message, AsyncModelClass.class);
        AsyncType type = AsyncType.check(response.getType());
        if (type != null) {
            switch (type) {
                case Ping:
                    deviceId = response.getContent();
                    onPing();
                    break;
                case DeviceRegister:
                    serverRegister(response);
                    break;
                case ServerRegister:
                    System.out.println(response.getType());
                    break;
            }
        }
    }

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("webSocket open");
    }

    @OnClose
    public void onClose(Session session) {
        System.out.println("webSocket closed");
    }

    @OnMessage
    public void byt(ByteBuffer b) {
        System.out.println("handling bytebuffer");
    }

    public void onPing() {
        RegisterDevice registerDevice = new RegisterDevice(false, "PodChat", deviceId);
        String content = getWrapperVo(AsyncType.DeviceRegister, gson.toJson(registerDevice));
        send(content);
    }

    public String getWrapperVo(AsyncType asyncType, String content) {
        if (content != null) {
            WrapperModel model = new WrapperModel();
            model.setContent(content);
            model.setType(asyncType);
            return gson.toJson(model);
        } else return null;
    }

    public void send(String s) {
        System.out.println(s);
        session.getAsyncRemote().sendText(s);
    }

    public void serverRegister(AsyncModelClass response) {
        String peerId = response.getContent();
        System.out.println(peerId);
        ServerRegister serverRegister = new ServerRegister("chat-server");
        String content = getWrapperVo(AsyncType.ServerRegister, gson.toJson(serverRegister));
        send(content);
    }

}
