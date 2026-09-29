package ConditionalStatement;

public class LoginBooleanFlags {

    public static void main(String[] args) {

        boolean usernamevalid = true;
        boolean passwordvalid = true;
        boolean accountlocked = true;

        if (usernamevalid == true && passwordvalid == true && accountlocked != false) {
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
    }
}
