package WebSocket;

public class GetThreadRequest {
    public Integer count;
    public Integer offset;
    public String name;
    public Boolean news;
    public Boolean archived;
    public Integer threadIds;
    public Integer creatorCoreUserId;
    public Integer partnerCoreUserId;
    public Integer partnerCoreContactId;
    public String metadataCriteria;
    public Boolean isGroup;

    public GetThreadRequest(Integer count, Integer offset, String name, Boolean news, Boolean archived, Integer threadIds, Integer creatorCoreUserId, Integer partnerCoreUserId, Integer partnerCoreContactId, String metadataCriteria, Boolean isGroup) {
        this.count = count;
        this.offset = offset;
        this.name = name;
        this.news = news;
        this.archived = archived;
        this.threadIds = threadIds;
        this.creatorCoreUserId = creatorCoreUserId;
        this.partnerCoreUserId = partnerCoreUserId;
        this.partnerCoreContactId = partnerCoreContactId;
        this.metadataCriteria = metadataCriteria;
        this.isGroup = isGroup;
    }

    public GetThreadRequest(Integer count, Integer offset, String name) {
        this.count = count;
        this.offset = offset;
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getNews() {
        return news;
    }

    public void setNews(Boolean news) {
        this.news = news;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public Integer getThreadIds() {
        return threadIds;
    }

    public void setThreadIds(Integer threadIds) {
        this.threadIds = threadIds;
    }

    public Integer getCreatorCoreUserId() {
        return creatorCoreUserId;
    }

    public void setCreatorCoreUserId(Integer creatorCoreUserId) {
        this.creatorCoreUserId = creatorCoreUserId;
    }

    public Integer getPartnerCoreUserId() {
        return partnerCoreUserId;
    }

    public void setPartnerCoreUserId(Integer partnerCoreUserId) {
        this.partnerCoreUserId = partnerCoreUserId;
    }

    public Integer getPartnerCoreContactId() {
        return partnerCoreContactId;
    }

    public void setPartnerCoreContactId(Integer partnerCoreContactId) {
        this.partnerCoreContactId = partnerCoreContactId;
    }

    public String getMetadataCriteria() {
        return metadataCriteria;
    }

    public void setMetadataCriteria(String metadataCriteria) {
        this.metadataCriteria = metadataCriteria;
    }

    public Boolean getGroup() {
        return isGroup;
    }

    public void setGroup(Boolean group) {
        isGroup = group;
    }
}
