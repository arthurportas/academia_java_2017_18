package DB;

import java.sql.*;

public class DB {

    private String DB_URL = "jdbc:mysql://localhost/webdb";

    private String USER = "root";
    private String PASS = "123456";

    private Connection conn;

    private static DB instance;

    private DB() throws SQLException {
        conn = DriverManager.getConnection(DB_URL,USER,PASS);
    }

    public static synchronized DB getConnection() throws SQLException {
        if(instance == null) {
            instance = new DB();
        };

        return instance;
    }

    public ResultSet query(String query) throws SQLException{
        Statement statement = instance.conn.createStatement();
        ResultSet res = statement.executeQuery(query);
        return res;
    }

    public int create(String query) throws SQLException {
        Statement statement = instance.conn.createStatement();
        int numRowsAffected = statement.executeUpdate(query);
        return numRowsAffected;
    }

    public Connection getConn() {
        return conn;
    }
}