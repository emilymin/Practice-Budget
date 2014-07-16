import hello.Client;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class DirectServlet extends HttpServlet{

    public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws ServletException,IOException{

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();

        //ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        //Client client = new Client();//(Client) context.getBean("clientBean");

       ApplicationContext applicationContext = (ApplicationContext)this.getServletContext().getAttribute("context");
       // NormalCalculator client = (NormalCalculator) applicationContext.getBean("normalCalculator");
       // client = (Client) context.getBean("clientBean");
        //NormalCalculator normalCalculator = myListener.setNormalCalculator();
        Client client = (Client)applicationContext.getBean("clientBean");
        String result = "";
        try {
            result = client.add("12", "13");
        } catch (Exception e) {
            e.printStackTrace();
        }

        out.println(result);
        out.close();
    }
}
