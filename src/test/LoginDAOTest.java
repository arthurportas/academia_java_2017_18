import DB.DB;
import domain.LoginRequest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import service.LoginService;

import java.sql.SQLException;

public class LoginDAOTest {

    @Before
    public void setUp() throws SQLException {

        String a = "Insert into pet (Joao, 1234)";
        DB.getConnection().create(a);

    }

    @Test
    public void validateUsername_working() throws SQLException {

        LoginRequest request = LoginRequest.builder()
                .username("Joao")
                .password("1234")
                .build();

        boolean pass = LoginService.validateUsername(request);

        Assert.assertTrue(pass);
    }

}
