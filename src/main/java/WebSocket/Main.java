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
        chat.setToken("9cbe74f5abbd4a97b855fc4765600d21.XzIwMjMz");
        chat.connect();
        while (true) {
        }
    }
}
