package spi.client;

import constants.EventType;

import java.util.List;

/**
 *  client to operate the WebHooks
 */
public interface ClientWebHookService {

    /**
     * client add WebHooks
     *
     * @param name       the webHooks name
     * @param url        the server url that you want to send event,this the unique key
     * @param eventTypes the event your server received edit、publish、delete
     * @return
     */

    Integer addWebHooks(String name, String url, List<EventType> eventTypes);

    /**
     * @param url the webhook unique key
     * @return isSuccess
     */
    boolean enableWebHooks(String url);

    /**
     * @param url the webhook unique key
     * @return isSuccess
     */
    boolean unableWebHooks(String url);

    /**
     *
     * @param url the webhook unique key
     * @return isSuccess
     */
    boolean removeWebHooks(String url);
}
