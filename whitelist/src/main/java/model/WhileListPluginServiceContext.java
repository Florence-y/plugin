package model;

import java.time.LocalDateTime;

public class WhileListPluginServiceContext {
    /**
     * trigger
     */
    String trigger;
    /**
     * triggerTime
     */
    LocalDateTime time;

    // more nacos properties

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
