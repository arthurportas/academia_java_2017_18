package User;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceTest {
    @Test
    public void ValiduserLogin() throws Exception {
        UserLoginRequest userLoginRequest=UserLoginRequest.builder()
                .name("admin@teste.com")
                .password("admin")
                .build();

        UserLoginResponse userService=new UserService().userLogin(userLoginRequest);
        assertTrue(userService.isLogged());

        User loggedUser= userService.getLoggedUser();
        assertEquals(loggedUser.getName(),"admin@teste.com");
    }

    @Test
    public void InValiduserLogin() throws Exception {
        UserLoginRequest userLoginRequest2=UserLoginRequest.builder()
                .name("admin30@teste.com")
                .password("admin")
                .build();

        UserLoginResponse userService=new UserService().userLogin(userLoginRequest2);
        assertFalse(userService.isLogged());
    }



}