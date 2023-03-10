package WebSocket.Input;

import WebSocket.ChatMessageVOTypes;

public class Message {
    public Boolean deletable;
    public Boolean delivered;
    public Boolean editable;
    public Boolean edited;
    public Integer id;
    public Boolean mentioned;
    public String message;
    public Integer messageType;
    public String metadata;
    public Integer ownerId;
    public Boolean pinned;
    public Integer previousId;
    public Boolean seen;
    public String systemMetadata;
    public Integer threadId;
    public Long time;
    public Long timeNanos;
    public String uniqueId;
    public Thread conversation;
    public Participant participant;
    public Long pinTime;
    public Boolean pinNotifyAll;

    public Boolean getDeletable() {
        return deletable;
    }

    public void setDeletable(Boolean deletable) {
        this.deletable = deletable;
    }

    public Boolean getDelivered() {
        return delivered;
    }

    public void setDelivered(Boolean delivered) {
        this.delivered = delivered;
    }

    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public Boolean getEdited() {
        return edited;
    }

    public void setEdited(Boolean edited) {
        this.edited = edited;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getMentioned() {
        return mentioned;
    }

    public void setMentioned(Boolean mentioned) {
        this.mentioned = mentioned;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public Boolean getPinned() {
        return pinned;
    }

    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    public Integer getPreviousId() {
        return previousId;
    }

    public void setPreviousId(Integer previousId) {
        this.previousId = previousId;
    }

    public Boolean getSeen() {
        return seen;
    }

    public void setSeen(Boolean seen) {
        this.seen = seen;
    }

    public String getSystemMetadata() {
        return systemMetadata;
    }

    public void setSystemMetadata(String systemMetadata) {
        this.systemMetadata = systemMetadata;
    }

    public Integer getThreadId() {
        return threadId;
    }

    public void setThreadId(Integer threadId) {
        this.threadId = threadId;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Long getTimeNanos() {
        return timeNanos;
    }

    public void setTimeNanos(Long timeNanos) {
        this.timeNanos = timeNanos;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public Thread getConversation() {
        return conversation;
    }

    public void setConversation(Thread conversation) {
        this.conversation = conversation;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public Long getPinTime() {
        return pinTime;
    }

    public void setPinTime(Long pinTime) {
        this.pinTime = pinTime;
    }

    public Boolean getPinNotifyAll() {
        return pinNotifyAll;
    }

    public void setPinNotifyAll(Boolean pinNotifyAll) {
        this.pinNotifyAll = pinNotifyAll;
    }

    @Override
    public String toString() {
        return "Message{" +
                "deletable=" + deletable +
                ", delivered=" + delivered +
                ", editable=" + editable +
                ", edited=" + edited +
                ", id=" + id +
                ", mentioned=" + mentioned +
                ", message='" + message + '\'' +
                ", messageType=" + messageType +
                ", metadata='" + metadata + '\'' +
                ", ownerId=" + ownerId +
                ", pinned=" + pinned +
                ", previousId=" + previousId +
                ", seen=" + seen +
                ", systemMetadata='" + systemMetadata + '\'' +
                ", threadId=" + threadId +
                ", time=" + time +
                ", timeNanos=" + timeNanos +
                ", uniqueId='" + uniqueId + '\'' +
                ", conversation=" + conversation +
                ", participant=" + participant +
                ", pinTime=" + pinTime +
                ", pinNotifyAll=" + pinNotifyAll +
                '}';
    }

}
