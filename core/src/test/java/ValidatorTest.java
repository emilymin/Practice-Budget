import hello.Validator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidatorTest {
    @Test
    public void validateNumIn100() {
        Validator validator = new Validator();

        String result = validator.validateIn100("101");

        assertEquals("ERROR",result);
    }
}