package WebSocket.Input;

public class SendTextMessageRequest {
    String message;
    long threadId;

    public SendTextMessageRequest(String message, long threadId) {
        this.message = message;
        this.threadId = threadId;
    }
}
