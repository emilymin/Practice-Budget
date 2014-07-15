import hello.Hello;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {
    @Test
    public void sayHelloTest(){
        Hello hello = new Hello();
        String result = hello.sayHello();

        assertEquals("Hello,how are you?",result);
    }
}
