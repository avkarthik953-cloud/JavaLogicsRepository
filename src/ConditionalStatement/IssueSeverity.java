package ConditionalStatement;

public class IssueSeverity {

    public static void main(String[] args) {

        String environment = "Production";
        String issueType = "Payment";

        if (environment.equals("Production")) {

            if (issueType.equals("Payment")) {
                System.out.println("Issue is Critical severity");

            } else if (issueType.equals("Login")) {
                System.out.println("Issue is High severity");

            } else {
                System.out.println("Issue is Medium severity");
            }

        } else {
            System.out.println("Issue is Low severity");
        }
    }
}
