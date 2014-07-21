import hello.Staff;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class StaffTest {
    @Test
    public void getTotalBudget(){
        Staff staff = new Staff();

        LinkedList<Double> budgetList = new LinkedList<Double>();
        budgetList.add(200.0);
        budgetList.add(300.0);
        budgetList.add(600.0);

        staff.setBudgetList(budgetList);
        Double actualMyBudget = 1100.0;
        Double myBudget = staff.getTotalBudget();

        assertEquals(actualMyBudget,myBudget);

    }

    @Test
    public void getMaxBudgetTest(){
        Staff staff = new Staff();
        staff.setTimeOfWorking(0.1);
        Double maxBudget = staff.getMaxBudget();
        Double actualMaxBudget = 1166.67;

        assertEquals(actualMaxBudget,maxBudget);
    }

}

