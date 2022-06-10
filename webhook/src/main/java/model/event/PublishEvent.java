package model.event;

import constants.EventType;

public class PublishEvent extends Event{
    @Override
    public EventType getEventType() {
        return EventType.PUBLISH;
    }
}
