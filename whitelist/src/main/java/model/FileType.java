package model;

public enum FileType {

    ZIP(".zip"),
    TXT(".txt"),
    MD(".md");
    private String suffix;

    FileType(String suffix) {
        this.suffix = suffix;
    }

    public String getSuffix() {
        return suffix;
    }
}
