package exception;

/**
 * check format error
 */
public class FileTypeUnExpectException extends Exception {
    /**
     * config data id
     */
    String dataId;
    /**
     * feed back message
     */
    String message;

    public FileTypeUnExpectException() {
    }

    public FileTypeUnExpectException(String dataId, String message) {
        this.dataId = dataId;
        this.message = message;
    }

    public FileTypeUnExpectException(String message, String dataId, String message1) {
        super(message);
        this.dataId = dataId;
        this.message = message1;
    }

    public FileTypeUnExpectException(String message, Throwable cause, String dataId, String message1) {
        super(message, cause);
        this.dataId = dataId;
        this.message = message1;
    }

    public FileTypeUnExpectException(Throwable cause, String dataId, String message) {
        super(cause);
        this.dataId = dataId;
        this.message = message;
    }

    public FileTypeUnExpectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String dataId, String message1) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.dataId = dataId;
        this.message = message1;
    }


}
