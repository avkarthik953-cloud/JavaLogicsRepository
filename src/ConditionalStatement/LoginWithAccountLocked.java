package ConditionalStatement;

import java.util.Scanner;

public class LoginWithAccountLocked {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "Admin@123";

        System.out.println("Enter the account status : ");
        boolean accountlocked = sc.nextBoolean();

        if (!accountlocked) {

            System.out.println("Enter the username : ");
            String enteredUsername = sc.next();

            if (correctUsername.equals(enteredUsername)) {

                System.out.println("Enter the password : ");
                String enteredPassword = sc.next();

                if (correctPassword.equals(enteredPassword)) {
                    System.out.println("Login Successful");
                } else {
                    System.out.println("Invalid credentials. Cannot login");
                }

            } else {
                System.out.println("Invalid Username.");
            }

        } else {
            System.out.println("Account Locked. Cannot login into application");
        }
    }
}
