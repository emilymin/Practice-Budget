package hello;

public abstract class Calculator {
    public static boolean validateNumsIn100(String s1,String s2){
        boolean status = Validator.validateIn100(s1) != Validator.ERROR && Validator.validateIn100(s2) != Validator.ERROR;
        if (status){
            return true;
        }
        return false;
    }

    public abstract String calculate(String s1,String s2)throws Exception;
}
