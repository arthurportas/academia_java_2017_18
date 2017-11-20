package service;

import DAO.LoginDAO;
import domain.LoginRequest;

import java.sql.SQLException;

import static DAO.LoginDAO.validate;

public class LoginService {

    public static boolean validateUsername(LoginRequest request) {

        String username = request.getUsername();

        if (username != null || username != "") {
            return true;
        }

        return false;
    }

    public static boolean validatePassword(LoginRequest request) {

        String pass = request.getPassword();

        if (pass != null || pass != "") {
            return true;
        }

        return false;
    }

    public static boolean validateLogin (LoginRequest request) throws SQLException {

        return LoginDAO.validate(request);

    }

}
