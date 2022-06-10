package model.event;

import constants.EventType;

import java.time.LocalDateTime;

public abstract class Event {

    private String content;

    private LocalDateTime time;

    abstract EventType getEventType();

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
