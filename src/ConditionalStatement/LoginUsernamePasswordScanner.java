package ConditionalStatement;

import java.util.Scanner;

public class LoginUsernamePasswordScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "Admin@123";

        System.out.println("Enter the username : ");
        String enteredusername = sc.next();

        System.out.println("Enter the password : ");
        String enteredpassword = sc.next();

        if (username.equals(enteredusername)) {

            if (password.equals(enteredpassword)) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Incorrect password entered");
            }
        } else {
            System.out.println("Incorrect username entered");
        }
    }
}
