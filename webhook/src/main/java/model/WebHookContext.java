package model;

import model.event.Event;

/**
 * the context which we offer plugin developer
 */
public class WebHookContext {
    /**
     * the webHook event
     */
    private Event event;
    /**
     * the config change user
     */
    private String trigger;
    /**
     * the config data id
     */
    private String dataId;

    // more nacos properties

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

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
