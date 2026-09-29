package LoopsPractice;

public class LoginRetryAttempts {

    public static void main(String[] args) {

        String correctUsername = "admin";
        String correctPassword = "Admin@123";
        int maxattempts = 3;
        int attempts = 1;

        String EnteredUsername = "Admin";
        String EnteredPassword = "Admin@123";

        boolean loginsuccess = false;

        while (attempts <= maxattempts) {

            if (EnteredUsername.equals(correctUsername) && EnteredPassword.equals(correctPassword)) {
                System.out.println("Login successfull");
                loginsuccess = true;
                break;
            } else {

                System.out.println("Login failed........" + (maxattempts - attempts) + " attempts left");
            }

            attempts++;

        }

        if (!loginsuccess) {
            System.out.println("Login Failed after " + maxattempts + " attempts");

        }
    }
}
