package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BankConnectivity
{
    private final Connection connection;

    public BankConnectivity() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Bank_Account",
                "root",
                "password");
        connection.setAutoCommit(false);
    }

    public Connection getConnection()
    {
        return connection;
    }
}
