package hello;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.SQLException;
import java.util.Collection;

public class DatabaseManager {
    public void query() throws SQLException {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUsername("");
        dataSource.setPassword("");
        dataSource.setUrl("");
        Collection con = (Collection) dataSource.getConnection();
    }
}
