package DBConnector;

import java.sql.*;

public class DBConnector {
    // JDBC driver name and database URL
    private String DB_URL = "jdbc:mysql://localhost:3306/pet";

    //  Database credentials
    private final String USER = "root";
    private final String PASS = "123456";

    private Connection conn;

    private static DBConnector instance;

    private DBConnector() throws SQLException {
        conn = DriverManager.getConnection(DB_URL,USER,PASS);
    }

    public static synchronized DBConnector getConnection() throws SQLException {
        if(instance == null) {
            instance = new DBConnector();
        }

        return instance;
    }

    public ResultSet query(String query) throws SQLException{
        Statement statement = instance.conn.createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }

    //CRUD
    public int create(String query) throws SQLException {
        Statement statement = instance.conn.createStatement();
        int numRowsAffected = statement.executeUpdate(query);
        return numRowsAffected;
    }
}
