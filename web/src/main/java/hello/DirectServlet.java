package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/direct")
public class DirectServlet {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        model.addAttribute("message", "Spring 3 MVC Hello World");
        return "hello";

    }

    @RequestMapping(method = RequestMethod.POST)
    public void

    public void doPost(HttpServletRequest request,HttpServletResponse response)
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

        String add1 = request.getParameter("add1");
        String add2 = request.getParameter("add2");

        try {
            result = client.add(add1, add2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        out.println(result);
        out.close();
    }

}
