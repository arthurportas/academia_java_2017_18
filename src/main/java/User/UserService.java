package User;

import Persistence.DBConnector;
import org.apache.commons.validator.routines.EmailValidator;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {


    public UserLoginResponse userLogin(UserLoginRequest userLoginRequest) throws SQLException {
        UserLoginResponse userLoginResponse=new UserLoginResponse();
        userLoginResponse.setLogged(false);

        ResultSet queryResponse=null;
        if (isUserValid(userLoginRequest)){
           String userQuery="SELECT user.name FROM user where user.name = '"
                   +userLoginRequest.getName() + "'"+
                   " AND user.password='" + userLoginRequest.getPassword() +"'";
            queryResponse = DBConnector.getConnection().query(userQuery);

        }


        if (queryResponse.next()){
            userLoginResponse=new UserLoginResponse();
            userLoginResponse.setLogged(true);
            User loggedUser = new User();
            loggedUser.setName(queryResponse.getString("name"));
            userLoginResponse.setLoggedUser(loggedUser);
            return userLoginResponse;
        }


        return userLoginResponse;
    }



    private boolean isUserValid (UserLoginRequest userLoginRequest){
        return (isUserNameValid(userLoginRequest) && isPasswordValid(userLoginRequest)) ? true : false;
    }

    private boolean isUserNameValid(UserLoginRequest userLoginRequest){
        EmailValidator validator = EmailValidator.getInstance();
        return validator.isValid(userLoginRequest.getName()) ? true : false;

    }

    private boolean isPasswordValid(UserLoginRequest userLoginRequest){
        return (userLoginRequest.getPassword().length()<=8) ? true : false;
    }

}
