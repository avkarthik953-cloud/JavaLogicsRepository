package ConditionalStatement;

public class EmployeeAccessCheck {

    public static void main(String[] args) {

        boolean isEmployeeActive = true;
        boolean hasValidCredentials = true;
        boolean hasRequiredRole = true;

        if (!isEmployeeActive) {
            System.out.println("Account Inactive");
        } else if (!hasValidCredentials) {
            System.out.println("Invalid Credentials");
        } else if (!hasRequiredRole) {
            System.out.println("Access Denied");
        } else {
            System.out.println("Access granted");
        }
    }
}
