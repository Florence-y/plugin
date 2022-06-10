package spi;

import exception.FileTypeUnExpectException;
import model.WhiteListPluginServiceContext;

public interface WhiteListPluginService {

    /**
     * check is you can do someThing  such as
     * @param context the context offer developer to do some check
     * @return
     */
    boolean isCanDo(WhiteListPluginServiceContext context) throws FileTypeUnExpectException;

    /**
     * execute the exact task
     * @return isSuccess
     */
    boolean process();
}
