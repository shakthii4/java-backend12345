package db;



import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity
{
    private final Connection connection;

    public Connectivity() throws SQLException {

        new Driver(); // initialize the mysql driver

        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Bank_Account",
                "root",
                "password"
        ); // trying to make a connectivity

        connection.setAutoCommit(false); // enabling txn management
        System.out.println("---- Connected to MySQL Successfully ----");
    }

    public Connection getConnection() {
        return connection;
    }
}
