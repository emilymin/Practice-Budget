package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class QueryController {

    //@Autowired
   // public Client client;
//    @Autowired
//    private BudgetQuery budgetQuery;

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public String query() throws Exception {
        return "query";
    }

    @RequestMapping(value = "/showResult", method = RequestMethod.POST)
    public String showResult(Model model,HttpServletRequest request) throws Exception {
        String result = request.getParameter("id");
        BudgetQuery budgetQuery = new BudgetQuery();
        Double totalBudget = budgetQuery.queryCost(result);
        request.setAttribute("totalBudget",totalBudget);

        model.addAttribute(totalBudget);

        return "showResult";
    }
}