import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent sce) {

        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        sce.getServletContext().setAttribute("context",context);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
