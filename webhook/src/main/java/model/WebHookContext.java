package model;

import model.event.Event;

/**
 *  the context which we offer plugin developer
 */
public class WebHookContext {
    private Event event;
    private String trigger;

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }
}
