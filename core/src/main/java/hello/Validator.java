package hello;

public class Validator {
    public static final String ERROR = "ERROR";

    public static String validateIn100(String s) {
        int n = Integer.parseInt(s);
        if (n>0 && n<=100){
            return s;
        }
        return ERROR;
    }
}
