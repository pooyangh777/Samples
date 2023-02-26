package WebSocket;

import java.net.URI;
public class main {

    public static void main(String[] args) {

        WebSocketClass cls = new WebSocketClass(URI.create("wss://msg.pod.ir/ws"), new AsyncListener() {
            @Override
            public void onSocketStateChanged(AsyncState state) {
                System.out.println("The state of async changed to " + state.toString());
            }
        });
        cls.connect();
        while (true) {
        }
    }
}
