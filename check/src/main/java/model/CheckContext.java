package model;


/**
 * the context which we offer plugin developer
 */
public class CheckContext {
    /**
     * the config dataId
     */
    String dataId;
    /**
     * the content need to check
     */
    String content;

    // more nacos properties

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
