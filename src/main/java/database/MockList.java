package database;


import dao.UserDao;
import lombok.Data;
import model.User;

import java.sql.SQLException;
import java.util.List;

@Data
public class MockList {

    public static List<User> savedUsers;

    static {
        try {
            savedUsers = getUsersFromDataBase();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static List<User> getUsersFromDataBase() throws SQLException {
        UserDao userDao = new UserDao();
        return userDao.getAllUsers();
    }

    public static boolean containsUserWithEmail(String email) {
        for (User user : savedUsers) {
            if(user.getEmail().toLowerCase().equals(email.toLowerCase())){
                return true;
            }
        }

        return false;
    }



    public static boolean containsUserWithEmailAndPassword(String email, String password) {
        for (User user : savedUsers) {
            if(user.getEmail().toLowerCase().equals(email.toLowerCase()) && user.getPassword().equals(password)){
                return true;
            }
        }

        return false;
    }

}
