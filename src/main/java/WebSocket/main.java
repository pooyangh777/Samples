package WebSocket;

import java.net.URI;
import java.net.URISyntaxException;

public class main {
    public static void main(String[] args) {
        WebSocketClass cls = new WebSocketClass(URI.create("wss://msg.pod.ir/ws"));
        cls.connect();
        while (true) {
        }
    }
}
