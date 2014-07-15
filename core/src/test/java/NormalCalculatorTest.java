import hello.NormalCalculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NormalCalculatorTest {
    @Test
    public void When12Add13Then1213() throws Exception {
        NormalCalculator normalCalculator = new NormalCalculator();

        String result = normalCalculator.calculate("12", "13");

        assertEquals("1213", result);
    }
}
