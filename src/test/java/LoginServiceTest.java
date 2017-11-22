import models.LoginRequest;
import models.LoginResponse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import services.LoginService;

import java.sql.SQLException;

public class LoginServiceTest {

    private LoginService loginService;

    @Before
    public void setup() {
        loginService = new LoginService();
    }
    @Test
    public void login_valid_credentials_returnsTrue() throws SQLException {

        LoginRequest request = new LoginRequest("arthurportas", "123456");
        LoginResponse response = loginService.login(request);
        Assert.assertTrue(response.isValid());
    }

    @Test
    public void login_invalid_credentials_returnsFalse() throws SQLException {

        LoginRequest request = new LoginRequest("arthurportas", "passsword");
        LoginResponse response = loginService.login(request);
        Assert.assertFalse(response.isValid());
    }
}
