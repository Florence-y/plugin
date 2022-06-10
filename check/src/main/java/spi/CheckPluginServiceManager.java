package spi;

import exception.FormatErrorException;
import model.CheckContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
public class CheckPluginServiceManager {
    /**
     * all the check plugin
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(CheckPluginServiceManager.class);

    private final List<CheckPluginService> checkPluginServices = new ArrayList<>();

    private static final CheckPluginServiceManager INSTANCE = new CheckPluginServiceManager();

    public CheckPluginServiceManager() {
        initCheckPluginServices();
    }

    private void initCheckPluginServices() {
        // load CheckPluginService spi
    }

    /**
     * multiply check plugin execute
     * @param context check context
     * @return process is success`
     */
    public boolean processCheck(CheckContext context) {
        // multiply check plugin once one check fail return false
        for (CheckPluginService checkPluginService : checkPluginServices) {
            // isEnable
            if (checkPluginService.isEnable()){
                // do check
                try {
                    boolean isLegal = checkPluginService.check(context);
                    if (!isLegal) {
                        return false;
                    }
                } catch (FormatErrorException e) {
                    LOGGER.warn("CheckPlugin:check fail,data id:{},content:{}",context.getDataId(),context.getContent());
                    return false;
                }
            }
        }
        // check success
        return true;
    }

    public static CheckPluginServiceManager getINSTANCE() {
        return INSTANCE;
    }
}
