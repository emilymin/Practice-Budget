package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Client {
    private Calculator calculator;
    private String add1;
    private String add2;

    public String add(String s1,String s2) throws Exception {
        return calculator.calculate(s1, s2);
    }

    @Autowired
    @Qualifier("mathCalculator")
    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public String getAdd1(){
        return this.add1;
    }

    public String getAdd2(){
        return this.add2;
    }
}