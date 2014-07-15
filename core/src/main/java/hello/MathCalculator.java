package hello;

public class MathCalculator extends Calculator implements Calculate {

    public MathCalculator() {
    }

    public String calculate(String s1, String s2) throws Exception{
        try {
            if (validateNumsIn100(s1, s2))
            return Integer.parseInt(s1) + Integer.parseInt(s2) + "";
        }
        catch (Exception e){
            return Validator.ERROR;
        }
        return Validator.ERROR;
    }
}
