import hello.MathCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathCalculatorTest {
    @Test
    public void When12Add13Then25() throws Exception {
        MathCalculator calculator = new MathCalculator();

        String result = calculator.calculate("12", "13");

        assertEquals("25", result);
    }
}
