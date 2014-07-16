package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Client {
    private Calculator calculator;

    public String add(String s1,String s2) throws Exception {
        return calculator.calculate(s1, s2);
    }

    @Autowired
    @Qualifier("mathCalculator")
    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }
}