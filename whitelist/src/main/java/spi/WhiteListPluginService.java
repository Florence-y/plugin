package spi;

import exception.FileTypeUnExpectException;
import model.WhiteListPluginServiceContext;

import java.util.Arrays;
import java.util.Scanner;

public interface WhiteListPluginService {

    /**
     * check is you can do someThing  such as
     * @param context the context offer developer to do some check
     * @return
     */
    Scanner
    boolean isCanDo(WhiteListPluginServiceContext context) throws FileTypeUnExpectException;

    /**
     * execute the exact task
     * @return isSuccess
     */
    boolean process();
}
