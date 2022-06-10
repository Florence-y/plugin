package spi;

import model.WhileListPluginServiceContext;

public interface WhileListPluginService {

    /**
     * check is you can do someThing  such as
     * @param context the context offer developer to do some check
     * @return
     */
    boolean isCanDo(WhileListPluginServiceContext context);

    /**
     * execute the exact task
     * @return isSuccess
     */
    boolean process();
}
