package persistence;

import java.sql.*;

public class DB {

    // JDBC driver name and database URL
    private String DB_URL = "jdbc:mysql://localhost/pet";

    //  Database credentials
    private String USER = "root";
    private String PASS = "123456";

    private Connection conn;

    private static DB instance;

    private DB() throws SQLException {
        conn = DriverManager.getConnection(DB_URL,USER,PASS);
    }

    public static synchronized DB getDB() throws SQLException {
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

    public Connection getConn(){
        return this.conn;
    }
}
