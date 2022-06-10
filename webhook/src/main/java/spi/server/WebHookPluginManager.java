package spi.server;

import model.WebHookContext;

import java.util.HashMap;
import java.util.Map;

public class WebHookPluginManager {

    /**
     * the Name to Exact WebHookService
     */
    private final Map<String, WebHookPluginService> map = new HashMap<>();

    private static final WebHookPluginManager INSTANCE = new WebHookPluginManager();

    public WebHookPluginManager() {
        initWebHookPlugins();
    }

    private void initWebHookPlugins() {
        // spi load the WebHookPlugin
    }

    public WebHookPluginManager getInstance() {
        return INSTANCE;
    }

    /**
     * send the webHook to those enable and match Service
     * @param webHookContext
     */
    public void processWebHooks(WebHookContext webHookContext){
        for (WebHookPluginService service : map.values()) {
            if (service.isEnable(webHookContext)&&service.isMatch(webHookContext)){
                service.send(webHookContext);
            }
        }
    }
}
