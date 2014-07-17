package hello;

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

    public void setName(String name) {
        this.name = name;
    }

    public Double getTotalBudget(){
        return budget.getMyTotalBudget();
    }
}
