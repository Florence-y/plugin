package spi;

import model.WhilePluginServiceContext;

public interface WhilePluginService {

    /**
     * check is you can do someThing  such as
     * @param context
     * @return
     */
    boolean isCanDo(WhilePluginServiceContext context);


    boolean process();
}
