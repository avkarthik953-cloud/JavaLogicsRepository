package ConditionalStatement;

public class LoginCheck {

    public static void main(String[] args) {

        String username = "admin";
        String Password = "Admin@123";

        if (username.equals("admin") && Password.equals("Admin@123")) {
            System.out.println("Login is successful");
        } else {
            System.out.println("Invalid credentials, please try with valid credentials");
        }
    }
}
