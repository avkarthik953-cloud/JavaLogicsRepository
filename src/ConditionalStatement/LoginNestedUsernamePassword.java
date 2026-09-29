package ConditionalStatement;

import java.util.Scanner;

public class LoginNestedUsernamePassword {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctusername = "admin";
        String correctpassword = "Admin@123";

        System.out.println("Enter the username : ");
        String enteredUsername = sc.next();

        if (enteredUsername.equals(correctusername)) {

            System.out.println("Enter the password : ");
            String enteredPassword = sc.next();

            if (enteredPassword.equals(correctpassword)) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Invalid credentials. Login failed");
            }

        } else {
            System.out.println("Incorrect username entered");
        }
    }
}
