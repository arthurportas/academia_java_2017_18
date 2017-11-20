package dao;

import database.DB;
import database.DB_LOGIN;
import model.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public int saveUser(String email, String password) throws SQLException {
        String sql = "insert into users (email, password) values (?, ?)";
        PreparedStatement statement = DB_LOGIN.getDB().getConn().prepareStatement(sql);
        statement.setString(1, email);
        statement.setString(2, password);
        int numRowsAffected = statement.executeUpdate();
        return numRowsAffected;

    }

    public User getUserByEmailAndPassword(String email, String password) throws SQLException {
        String sql = "select email, password from users where email = ? and password = ?";
        PreparedStatement statement = DB_LOGIN.getDB().getConn().prepareStatement(sql);
        statement.setString(1, email);
        statement.setString(2, password);
        ResultSet resultSet = statement.executeQuery();

        if (resultSet.next()){
            String email1 = resultSet.getString("email");
            String password1 = resultSet.getString("password");
            User user1 = User.builder().email(email1).password(password1).build();
            return user1;
        }
        return null;
    }

    public List<User> getAllUsers() throws SQLException {

        List<User> fetchedUsers = new ArrayList<>();
        String sql = "select * from users";
        PreparedStatement statement = DB_LOGIN.getDB().getConn().prepareStatement(sql);

        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()){
            String email1 = resultSet.getString("email");
            String password = resultSet.getString("password");
            User user = User.builder().email(email1).password(password).build();
            fetchedUsers.add(user);
        }
        return fetchedUsers;

    }
}
