package spi;

import model.WhileListPluginServiceContext;

import java.util.ArrayList;
import java.util.List;

public class WhileListPluginServiceManager {

    private final List<WhileListPluginService> checkPluginServices = new ArrayList<>();


    private static final WhileListPluginServiceManager INSTANCE = new WhileListPluginServiceManager();

    public WhileListPluginServiceManager() {
        initWhileListPluginService();
    }

    private void initWhileListPluginService() {
        // load spi checkPluginServices
    }


    public void processWhileListDo(WhileListPluginServiceContext context){
        for (WhileListPluginService checkPluginService : checkPluginServices) {
            if (checkPluginService.isCanDo(context)){
                checkPluginService.process();
            }
        }
    }

    public static WhileListPluginServiceManager getINSTANCE() {
        return INSTANCE;
    }
}
