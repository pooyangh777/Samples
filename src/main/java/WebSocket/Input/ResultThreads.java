package WebSocket.Input;

import java.util.List;

public class ResultThreads {
    private List threads;
    private long contentCount;
    private boolean hasNext;
    private long nextOffset;

    public long getContentCount() {
        return contentCount;
    }

    public void setContentCount(long contentCount) {
        this.contentCount = contentCount;
    }

    public boolean isHasNext() {
        return hasNext;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    public long getNextOffset() {
        return nextOffset;
    }

    public void setNextOffset(long nextOffset) {
        this.nextOffset = nextOffset;
    }

    public List getThreads() {
        return threads;
    }

    public void setThreads(List threads) {
        this.threads = threads;
    }
}

