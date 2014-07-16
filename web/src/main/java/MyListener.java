import hello.MathCalculator;
import hello.NormalCalculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        sce.getServletContext().setAttribute("context",context);

        ServletContext ctx = sce.getServletContext();

        MathCalculator mathCalculator = new MathCalculator();
        ctx.setAttribute("mathCalculator",mathCalculator);

        NormalCalculator normalCalculator = new NormalCalculator();
        ctx.setAttribute("normalCalculator",normalCalculator);


    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

   // @Autowired
   // @Qualifier("mathCalculator")
    //public void setCalculator(MathCalculator mathCalculator){
      //  this.

    //}
}
