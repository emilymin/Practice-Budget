import hello.Budget;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BudgetTest {
    @Test
    public void calculateTotalBudgetTest(){
        Budget budget = new Budget();
        budget.setMyBudget(100.0);
        budget.setBorrow("A",200.0);
        budget.setLend("B",200.0);
        budget.calculateTotalBudget();
        Double actualResult = 500.0;
        assertEquals(actualResult,budget.getMyTotalBudget());
    }
}
