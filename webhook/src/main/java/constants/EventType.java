package constants;

/**
 * all event type
 */
public enum EventType {

    /**
     * publish config
     */
    PUBLISH("publish"),
    /**
     * edit config
     */
    EDIT("edit"),
    /**
     * delete config
     */
    DELETE("delete");

    private String name;

    EventType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
