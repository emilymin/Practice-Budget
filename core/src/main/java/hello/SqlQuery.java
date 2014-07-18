package hello;

public class SqlQuery {
    public String queryIdStatement(String id){
        return "select * from employee where uid = '" + id + "';";
    }

    public String queryBudgetStatement(String id){
        return "select * from budgetTable where uid = '" + id + "';";
    }
}
