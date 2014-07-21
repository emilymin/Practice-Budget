package hello;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class BudgetQuery {
    private static Statement statement;

    //@Autowired
    //@Qualifier("dataSource")
    //private BasicDataSource basicDataSource;

    public BudgetQuery() throws SQLException {
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("");
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/BudgetDatabase");
        Connection connection = basicDataSource.getConnection();
        statement = connection.createStatement();
    }

    public Double queryTime(String id) throws SQLException {
        Double time = 0.0;
        String sql = "select * from employee where EmplID = '" + id + "';";
        ResultSet result = statement.executeQuery(sql);
        if (result.next()){
            time = result.getDouble("YearOfExp");
        }
    return time;
    }

    public List<Double> queryBudget(String id) throws SQLException {
        List<Double> budget = new LinkedList<Double>();
        String sql = "select * from budgetTable where EmplID = '" + id + "' and (ExpenseType='Books' or ExpenseType='Training/Education');";
        ResultSet result = statement.executeQuery(sql);
        if (result != null){
            while (result.next()) {
                Double money = result.getDouble("Cost");
                budget.add(money);
            }
    }
        return budget;
    }

    public Double queryCost(String id) throws SQLException {
        Staff staff = new Staff();
        staff.setId(id);
        List<Double> budget = queryBudget(id);
        staff.setBudgetList(budget);
        return staff.getTotalBudget();
    }

    public Double queryMaxBudget(String id) throws SQLException {
        Staff staff = new Staff();
        Double time = queryTime(id);
        staff.setTimeOfWorking(time);
        return staff.getMaxBudget();
    }
}