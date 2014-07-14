package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hello {
    public static String sayHello(){
        Logger logger = LoggerFactory.getLogger("Hello.class");
        logger.info("An info log message logged using SLF4j");
        return "Hello";
    }
}
