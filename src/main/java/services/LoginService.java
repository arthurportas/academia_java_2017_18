package services;

import com.google.common.base.Preconditions;
import daos.LoginDAO;
import models.LoginRequest;
import models.LoginResponse;

import java.sql.SQLException;

public class LoginService {

    public LoginResponse login(LoginRequest request) throws SQLException {
        Preconditions.checkNotNull(request);
        Preconditions.checkNotNull(request.getUserName());
        Preconditions.checkNotNull(request.getPassword());

        return new LoginDAO().login(request);
    }
}
