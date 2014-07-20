package hello;

import java.util.List;

public class Staff {
    private String id;
    private String name;
    //private Time timeOfWorking;
    private Budget budget;

    public Staff() {
        id = "";
        name = "";
        budget = new Budget();
    }

    public void setId(String id) {
        this.id = id;

    }

   // public void setName(String name) {
//        this.name = name;
//    }

    public void setBudgetList(List<Double> budgetList){
        budget.setMyBudget(budgetList);
    }

    public Double getTotalBudget(){
        budget.calculateTotalBudget();
        return budget.getMyTotalBudget();
    }
}
