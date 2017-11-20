package User;

import lombok.Data;

@Data
public class UserLoginResponse {

    private boolean isLogged;
    private User loggedUser;



}
