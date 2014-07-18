package hello;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class BudgetQuery {
    private static Statement statement;

    @Autowired
    @Qualifier("dataSource")
    private BasicDataSource basicDataSource;

    public BudgetQuery() throws SQLException {
        Connection connection = basicDataSource.getConnection();
        statement = connection.createStatement();
    }

    public String queryTime(String id) throws SQLException {
        String time = "";
        String sql = "select * from employee where EmplID = '" + id + "';";
        ResultSet result = statement.executeQuery(sql);
        if (result.next()){
            time = result.getString("YearOfExp");
        }
    return time;
    }

    public static List<Double> queryBudget(String id) throws SQLException {
        List<Double> budget = new LinkedList<Double>();
        String sql = "select * from budgetTable where EmplID = '" + id + "';";
        ResultSet result = statement.executeQuery(sql);
        if (result.next()){
            String money = result.getString("Cost");
            budget.add(Double.parseDouble(money));
        }
        return budget;
    }

    public static Double queryCost(String id) throws SQLException {
        Staff staff = new Staff();
        staff.setId(id);
        List<Double> budget = queryBudget(id);
        staff.setBudgetList(budget);
        return staff.getTotalBudget();
    }

    public void queryMaxCost(String id) throws SQLException {
        Staff staff = new Staff();
        staff.setId(id);
        String time = queryTime(id);
        //staff.setBudgetList(budget);
        //staff.getTotalBudget();
    }
}
























