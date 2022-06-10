package spi;


import exception.FormatErrorException;
import model.CheckContext;

public interface CheckPluginService {


    boolean check(CheckContext context) throws FormatErrorException;

    boolean isEnable();

}
