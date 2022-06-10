package spi;


import exception.FormatErrorException;
import model.CheckContext;

/**
 * the CheckPluginService SPI
 */
public interface CheckPluginService {

    /**
     * the check
     * @param context Context
     * @return isSuccess
     * @throws FormatErrorException if check fail will throw
     */
    boolean check(CheckContext context) throws FormatErrorException;

    /**
     * the check plugin is enable
     * @return
     */
    boolean isEnable();

}
