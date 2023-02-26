package WebSocket;

public class WrapperModel {
    private int type;
    private String content;
    private long trackerId;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getTrackerId() {
        return trackerId;
    }

    public void setTrackerId(long trackerId) {
        this.trackerId = trackerId;
    }

    public void setType(AsyncType a) {
        this.type = a.value;
    }

    public int getType() {
        return type;
    }
}
