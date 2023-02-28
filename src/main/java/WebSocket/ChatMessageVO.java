package WebSocket;

public class ChatMessageVO {
    private String token = "9a8811cc9cea4f53aaba9787ed2f0403.XzIwMjMy";
    private int tokenIssuer = 1;
    private String uniqueId = "19F39376-26E5-412C-B8FD-024202AC833D";
    private int type;
    private String typeCode = "default";

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public int getTokenIssuer() {
        return tokenIssuer;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public int getType() {
        return type;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setType(ChatMessageVOTypes type) {
        this.type = type.value;
    }
}
