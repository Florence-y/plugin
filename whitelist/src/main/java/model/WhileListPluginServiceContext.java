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
    /**
     * fileType
     */
    FileType fileType;


    // more nacos properties





    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

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
