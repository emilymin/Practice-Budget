package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "SpringBeans.xml");

        Client client = (Client) context.getBean("clientBean");

        System.out.println(client.add("12","13"));
    }
}
