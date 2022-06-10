package spi;

import exception.FileTypeUnExpectException;
import model.WhiteListPluginServiceContext;

import java.util.ArrayList;
import java.util.List;

public class WhiteListPluginServiceManager {
    /**
     * all the whitelist plugin
     */
    private final List<WhiteListPluginService> checkPluginServices = new ArrayList<>();


    private static final WhiteListPluginServiceManager INSTANCE = new WhiteListPluginServiceManager();

    public WhiteListPluginServiceManager() {
        initWhileListPluginService();
    }

    /**
     * init: load the plugin into webHookPluginServiceMap
     */

    private void initWhileListPluginService() {
        // load spi checkPluginServices
    }

    /**
     * process whileList
     * @param context
     */
    public void processWhileListDo(WhiteListPluginServiceContext context) throws FileTypeUnExpectException {
        for (WhiteListPluginService checkPluginService : checkPluginServices) {
            if (checkPluginService.isCanDo(context)){
                checkPluginService.process();
            }
        }
    }

    public static WhiteListPluginServiceManager getINSTANCE() {
        return INSTANCE;
    }
}
