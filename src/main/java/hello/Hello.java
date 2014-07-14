package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hello {
    public static String sayHello(){
        System.out.println("Happy");
        Logger logger = LoggerFactory.getLogger("Hello.class");
        logger.info("My name is Emily");
        logger.info("An info log message logged using SLF4j");
        return "Hello";
    }
}
