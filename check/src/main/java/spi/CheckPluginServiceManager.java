package spi;

import exception.FormatErrorException;
import model.CheckContext;

import java.util.ArrayList;
import java.util.List;

public class CheckPluginServiceManager {

    private final List<CheckPluginService> checkPluginServices = new ArrayList<>();

    public CheckPluginServiceManager() {
        initCheckPluginServices();
    }

    private void initCheckPluginServices() {
        // load CheckPluginService spi
    }

    /**
     * multiply check plugin execute
     * @param context check context
     * @return
     */
    public boolean processCheck(CheckContext context) {
        // multiply check plugin once one check fail return false
        for (CheckPluginService checkPluginService : checkPluginServices) {
            try {
                boolean isLegal = checkPluginService.check(context);
                if (!isLegal) {
                    return false;
                }
            } catch (FormatErrorException e) {
                // log data id and content to trace
                return false;
            }
        }
        // check success
        return true;
    }
}
