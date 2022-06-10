package model;

/**
 * all fileType allow
 */
public enum FileType {

    ZIP(".zip"),
    TXT(".txt"),
    MD(".md");
    /**
     * the file suffix
     */
    private String suffix;

    FileType(String suffix) {
        this.suffix = suffix;
    }

    public String getSuffix() {
        return suffix;
    }
}
