package ConditionalStatement;

import java.util.Scanner;

public class LoginAttemptsScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "Admin@123";

        int attempts = 0;
        int maxattempts = 3;

        while (attempts < maxattempts) {

            System.out.println("Enter the username : ");
            String EnteredUsername = sc.next();

            System.out.println("Enter the password : ");
            String EnteredPassword = sc.next();

            if (EnteredUsername.equals(correctUsername) && EnteredPassword.equals(correctPassword)) {
                System.out.println("Login Successful");
                break;
            } else {
                attempts++;
                if (attempts >= maxattempts) {
                    System.out.println("Account got locked");
                } else {

                    System.out.println("Invalid credentials. Please enter credentials again, " + (maxattempts - attempts)
                            + " attempts left");
                }
            }
        }
    }
}
