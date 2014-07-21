import hello.BudgetQuery;
import org.junit.Test;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BudgetQueryTest {
    @Test
    public void queryBudgetTest() throws SQLException {
        BudgetQuery budgetQuery = new BudgetQuery();
        List<Double> budget = budgetQuery.queryBudget("EMP15153");

        List<Double> actualBudget = new LinkedList<Double>();
        actualBudget.add(180.0);

        assertEquals(actualBudget,budget);
    }

    @Test
    public void queryTimeTest() throws SQLException {
        BudgetQuery budgetQuery = new BudgetQuery();
        Double time = budgetQuery.queryTime("EMP15153");
        Double actualTime = 0.7;

        assertEquals(actualTime,time);
    }
}
