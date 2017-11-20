package DAO;

import domain.LoginRequest;
import DB.DB;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDAO {


    public static boolean validate(LoginRequest request) throws SQLException {

        String username = request.getUsername();

        String ps1 = request.getPassword();

        ResultSet ps2 = DB.getConnection().query("Select password from user where name = '" + username + "'");

        String ps3 = ps2.getString(0);

        boolean a = false;

        if (ps3 == ps1) a = true;

        return a;

    }

}
