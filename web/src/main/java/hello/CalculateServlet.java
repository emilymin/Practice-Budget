package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class CalculateServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        //Client client = (Client) context.getBean("clientBean");

        ServletContext servletContext = getServletContext();
        MathCalculator client = (MathCalculator) servletContext.getAttribute("mathCalculator");

        String result = "";
        try {
            result = client.calculate("12", "13");
        } catch (Exception e) {
            e.printStackTrace();
        }

        ServletContext context1 = getServletContext();

        out.println(result);
        out.close();
    }
}