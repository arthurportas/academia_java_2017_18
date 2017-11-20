package application;

import dao.UserDao;
import database.MockList;
import model.User;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SQLException {

        Scanner scanner = new Scanner(System.in);
        UserDao userDao = new UserDao();
        String email;
        String password;



        User user = new User();
        int option = 0;

        System.out.println("Enter 1 to register users or 0 to exit!");
        option = scanner.nextInt();

        while(option != 0){
            System.out.println("Welcome to the user registration System!");
//

            System.out.println("Enter your email: ");
            email = scanner.next();
            user.setEmail(email);
            System.out.println("Enter your password");
            password = scanner.next();
            user.setPassword(password);
            if(!MockList.containsUserWithEmail(email)){
                userDao.saveUser(email, password);
            }else{
                System.out.println("That email already exists...");
            }

            user = new User();
            System.out.println("Enter 1 to register users or 0 to exit !");
            option = scanner.nextInt();
        }

        System.out.println("Make login??? (1)Yes (0)No");
        option = scanner.nextInt();

        if (option == 1){

            System.out.println("Enter your email: ");
            email = scanner.next();
            System.out.println("Enter your password");
            password = scanner.next();
            User returnedUser = userDao.getUserByEmailAndPassword(email, password);

            if(returnedUser != null){
                System.out.println("Welcome to the System...");
            }else {
                System.out.println("Access denied...");
            }

        }


    }
}
