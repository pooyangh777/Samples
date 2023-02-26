# javax.websocket ServerRegister


JAVA JDK8
## Features

- [x] ConnectToServer
- [x] DeviceRegister
- [x] ServerRegister


## Connect To Server

```swift
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

```

## Server Answer
Switch Between Types That Server Answer.
Each Case Call Special Method
```swift 
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
```
## DeviceId & Send a Request For Device Register
```swift
public void onPing() {
    RegisterDevice registerDevice = new RegisterDevice(false, "PodChat", deviceId);
    String content = getWrapperVo(AsyncType.DeviceRegister, gson.toJson(registerDevice));
    send(content);
} 
```
<br/>

## Server Register
```swift
public void serverRegister(AsyncModelClass response) {
    String peerId = response.getContent();
    System.out.println(peerId);
    ServerRegister serverRegister = new ServerRegister("chat-server");
    String content = getWrapperVo(AsyncType.ServerRegister, gson.toJson(serverRegister));
    send(content);
}
```
## Send Message To Server
```swift
public void send(String s) {
    System.out.println(s);
    session.getAsyncRemote().sendText(s);
}
```
