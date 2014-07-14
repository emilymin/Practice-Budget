package hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest{
    @Test
    public void testSayHello(){
        String result = Hello.sayHello();

        assertEquals("Hello",result);
    }
}