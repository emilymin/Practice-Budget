package hello;

public class Main {
    public static void main(String[] args) throws Exception {
        NormalCalculator normalCalculator = new NormalCalculator();
        MathCalculator mathCalculator = new MathCalculator();
        Client client = new Client();
        client.setCalculator(normalCalculator);
        System.out.println(client.add("12","13"));
        client.setCalculator(mathCalculator);
        System.out.println(client.add("12","13"));
    }
}
