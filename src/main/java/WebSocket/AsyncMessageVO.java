package WebSocket;

public class AsyncMessageVO {
    String content;
    int ttl = 800000;
    int priority = 1;
    String peerName = "chat-server";
    String uniqueId = "19F39376-26E5-412C-B8FD-024202AC833D";

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getTtl() {
        return ttl;
    }

    public int getPriority() {
        return priority;
    }

    public String getPeerName() {
        return peerName;
    }

    public String getUniqueId() {
        return uniqueId;
    }
}
