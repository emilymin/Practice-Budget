package hello;

public class NormalCalculator extends Calculator implements Calculate {

    @Override
    public String calculate(String s1, String s2) throws Exception {
        try {
            if(validateNumsIn100(s1, s2)) {
                return s1 + s2;
            }
        } catch (Exception e) {
            return Validator.ERROR;
        }
        return Validator.ERROR;
    }
}
