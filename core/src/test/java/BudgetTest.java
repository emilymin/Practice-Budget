import hello.Budget;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class BudgetTest {
     @Test
    public void calculateTotalBudgetTest(){
         Budget budget = new Budget();

         LinkedList<Double> budgetList = new LinkedList<Double>();
         budgetList.add(200.0);
         budgetList.add(300.0);
         budgetList.add(600.0);
         budget.setMyBudget(budgetList);
         Double actualMyBudget = 1100.0;
         budget.calculateTotalBudget();
         Double myBudget = budget.getMyTotalBudget();

         assertEquals(actualMyBudget,myBudget);
     }

    @Test
    public void getMaxBudgetTest(){
        Budget budget = new Budget();
        budget.calculateMaxBudget(0.1);
       Double maxBudget = budget.getMyMaxBudget();
        Double actualMaxBudget = 1166.67;

        assertEquals(actualMaxBudget,maxBudget);
    }
}
