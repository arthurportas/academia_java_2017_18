package daos;

import models.LoginRequest;
import models.LoginResponse;
import persistence.DB;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;

public class LoginDAO {

    private String LOGIN_QUERY = "select * from users u where u.user_name = '%s' and u.password = '%s'";

    public LoginResponse login(LoginRequest request) throws SQLException {

        ResultSet rs = DB.getDB().query(
                String.format(LOGIN_QUERY, request.getUserName(), request.getPassword())
        );

       if(rs.next()) {

           return new LoginResponse(true);
       }
        return new LoginResponse(false);
    }
}
