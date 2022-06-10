package spi.server;

import model.WebHookContext;

import java.util.HashMap;
import java.util.Map;

/**
 * the WebHookPluginService manager
 */
public class WebHookPluginManager {

    /**
     * the Name to Exact WebHookService
     */
    private final Map<String, WebHookPluginService> webHookPluginServiceMap = new HashMap<>();

    private static final WebHookPluginManager INSTANCE = new WebHookPluginManager();

    public WebHookPluginManager() {
        initWebHookPlugins();
    }
    /**
     * init: load the plugin into webHookPluginServiceMap
     */
    private void initWebHookPlugins() {
        // spi load the WebHookPlugins
    }

    // singleton
    public WebHookPluginManager getInstance() {
        return INSTANCE;
    }

    /**
     * send the webHook to those enable and match Service
     * @param webHookContext
     */
    public void processWebHooks(WebHookContext webHookContext){
        for (WebHookPluginService service : webHookPluginServiceMap.values()) {
            // check enable and match
            if (service.isEnable(webHookContext)&&service.isMatch(webHookContext)){
                // send the webhook to server
                service.send(webHookContext);
            }
        }
    }
}
