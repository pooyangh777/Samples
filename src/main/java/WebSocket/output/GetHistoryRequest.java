package WebSocket.output;


import java.util.List;

public class GetHistoryRequest {
    public Long threadId;
    public Integer offset;
    public Integer count;
    public Integer fromTime;
    public Integer fromTimeNanos;
    public Integer messageId;
    public Integer messageType;
    public String order;
    public String query;
    public Integer toTime;
    public String hashtag;
    public Integer toTimeNanos;
    public List<String> uniqueIds;
    public Integer userId;
    public Integer messageThreadId;
    public Integer firstMessageId;
    public Integer lastMessageId;
    public Integer senderId;
    public Integer historyTime;
    public Boolean allMentioned;
    public Boolean unreadMentioned;
    public Integer lastMessageTime;
    public Integer historyEndTime;
    public Boolean newMessages;

    public Long getThreadId() {
        return threadId;
    }

    public void setThreadId(Long threadId) {
        this.threadId = threadId;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getFromTime() {
        return fromTime;
    }

    public void setFromTime(Integer fromTime) {
        this.fromTime = fromTime;
    }

    public Integer getFromTimeNanos() {
        return fromTimeNanos;
    }

    public void setFromTimeNanos(Integer fromTimeNanos) {
        this.fromTimeNanos = fromTimeNanos;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Integer getToTime() {
        return toTime;
    }

    public void setToTime(Integer toTime) {
        this.toTime = toTime;
    }

    public String getHashtag() {
        return hashtag;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public Integer getToTimeNanos() {
        return toTimeNanos;
    }

    public void setToTimeNanos(Integer toTimeNanos) {
        this.toTimeNanos = toTimeNanos;
    }

    public List<String> getUniqueIds() {
        return uniqueIds;
    }

    public void setUniqueIds(List<String> uniqueIds) {
        this.uniqueIds = uniqueIds;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMessageThreadId() {
        return messageThreadId;
    }

    public void setMessageThreadId(Integer messageThreadId) {
        this.messageThreadId = messageThreadId;
    }

    public Integer getFirstMessageId() {
        return firstMessageId;
    }

    public void setFirstMessageId(Integer firstMessageId) {
        this.firstMessageId = firstMessageId;
    }

    public Integer getLastMessageId() {
        return lastMessageId;
    }

    public void setLastMessageId(Integer lastMessageId) {
        this.lastMessageId = lastMessageId;
    }

    public Integer getSenderId() {
        return senderId;
    }

    public void setSenderId(Integer senderId) {
        this.senderId = senderId;
    }

    public Integer getHistoryTime() {
        return historyTime;
    }

    public void setHistoryTime(Integer historyTime) {
        this.historyTime = historyTime;
    }

    public Boolean getAllMentioned() {
        return allMentioned;
    }

    public void setAllMentioned(Boolean allMentioned) {
        this.allMentioned = allMentioned;
    }

    public Boolean getUnreadMentioned() {
        return unreadMentioned;
    }

    public void setUnreadMentioned(Boolean unreadMentioned) {
        this.unreadMentioned = unreadMentioned;
    }

    public Integer getLastMessageTime() {
        return lastMessageTime;
    }

    public void setLastMessageTime(Integer lastMessageTime) {
        this.lastMessageTime = lastMessageTime;
    }

    public Integer getHistoryEndTime() {
        return historyEndTime;
    }

    public void setHistoryEndTime(Integer historyEndTime) {
        this.historyEndTime = historyEndTime;
    }

    public Boolean getNewMessages() {
        return newMessages;
    }

    public void setNewMessages(Boolean newMessages) {
        this.newMessages = newMessages;
    }
}
