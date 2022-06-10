package model;

import constants.EventType;

public abstract class Event {

    private String content;

    abstract EventType getEventType();
}
