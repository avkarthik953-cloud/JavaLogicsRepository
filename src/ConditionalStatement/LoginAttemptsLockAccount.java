package ConditionalStatement;

import java.util.Scanner;

public class LoginAttemptsLockAccount {

    public static void main(String[] args) {

        String username = "Admin";
        String password = "Admin@123";

        int attempts = 0;
        int maxattempts = 3;

        Scanner sc = new Scanner(System.in);

        while (attempts < maxattempts) {

            System.out.println("Enter Username : ");
            String Enteredusername = sc.next();

            System.out.println("Enter Password : ");
            String Enteredpassword = sc.next();

            if (Enteredusername.equals(username) && Enteredpassword.equals(password)) {
                System.out.println("Login successful");
                break;
            } else {
                attempts++;
                if (attempts == maxattempts) {
                    System.out.println("Account got locked!! Please contact helpdesk");
                } else {
                    System.out.println("Invalid credentials. Please enter credentials again " + (maxattempts - attempts));
                }
            }
        }
    }
}
