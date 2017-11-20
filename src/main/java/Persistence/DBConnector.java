package Persistence;

import java.sql.*;

public class DBConnector {

    // JDBC driver name and database URL
    private String DB_URL = "jdbc:mysql://localhost/pet";

    //  Database credentials
    private final String USER = "root";
    private final String PASS = "123456";

    public Connection conn;

    private static DBConnector instance;

    private DBConnector() throws SQLException {
        conn = DriverManager.getConnection(DB_URL,USER,PASS);
        conn.setAutoCommit(false);
    }

    public static synchronized DBConnector getConnection() throws SQLException {
        if(instance == null) {
            instance = new DBConnector();
        }

        return instance;
    }

    public Connection getConn() {
        return conn;
    }

    public ResultSet query(String query) throws SQLException{
        PreparedStatement statement = instance.conn.prepareStatement(query);
        ResultSet res = statement.executeQuery(query);
        return res;
    }

    public PreparedStatement queryPrepared(String query) throws SQLException{
        PreparedStatement statement = instance.conn.prepareStatement(query);
        return statement;
    }

    //CRUD
    public int create(String query) throws SQLException {
        PreparedStatement statement = instance.conn.prepareStatement(query);
        int numRowsAffected = statement.executeUpdate(query);
        return numRowsAffected;
    }

    public void close(){
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
