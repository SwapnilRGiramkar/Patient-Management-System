//This Program has an Connection of Java and MySql database using JDBC
//example--->

import java.sql.*;

public class DBConnection
{
    private static final String url="jdbc:mysql://localhost:3306/neuro";
    private static final String username="root";
    private static final String password="Swap@123";

    public static Connection getConnection() throws SQLException
    {
        return DriverManager.getConnection(url,username,password);
    }

}

