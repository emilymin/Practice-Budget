package hello;

public class Client {
    private Calculator calculator;

    public void setCalculator(Calculator calculator){
        this.calculator = calculator;
    }

    public String add(String s1,String s2) throws Exception {
        return calculator.calculate(s1, s2);
    }
}