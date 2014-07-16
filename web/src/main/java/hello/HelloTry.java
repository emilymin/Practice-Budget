package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloTry {

    @Autowired
    public Client client;

    @RequestMapping(value = "/calculate", method = RequestMethod.GET)
    public String add(Model model, HttpServletRequest request) throws Exception {
        return "index";
    }

    @RequestMapping(value = "/show", method = RequestMethod.POST)
    public String show(Model model,HttpServletRequest request) throws Exception {
        String result = client.add(request.getParameter("add1").toString(), request.getParameter("add2").toString());
        model.addAttribute(result);
        request.setAttribute("result",result);

        return "show";
    }
}