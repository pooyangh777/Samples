package WebSocket;

public class Main {

    public static void main(String[] args) {
        Chat chat = new Chat(new ChatListener() {
            @Override
            public void onConnectionStateChanged(ChatState state) {
                System.out.println("Chat State changed"+ state);
                //IDLE
            }
        });
        chat.setToken("9edc5e4146fc45e189ce9d2ebc9f6ebd.XzIwMjMy");
        chat.connect();
        while (true) {
        }
    }
}
