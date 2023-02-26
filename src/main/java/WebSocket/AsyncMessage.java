package WebSocket;

public class AsyncMessage {
    long id;
    int senderMessageId;
    String senderName;
    int senderId;
    int type;
    String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSenderMessageId() {
        return senderMessageId;
    }

    public void setSenderMessageId(int senderMessageId) {
        this.senderMessageId = senderMessageId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public AsyncMessage(int id, int senderMessageId, String senderName, int senderId, int type, String content) {
        this.id = id;
        this.senderMessageId = senderMessageId;
        this.senderName = senderName;
        this.senderId = senderId;
        this.type = type;
        this.content = content;
    }
}
