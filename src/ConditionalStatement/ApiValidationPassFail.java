package ConditionalStatement;

public class ApiValidationPassFail {

    public static void main(String[] args) {

        int statusCode = 200;
        int responsetime = 2000;
        boolean isresponseValid = true;

        if (statusCode != 200) {
            System.out.println("Fail - Invalid Status");
        } else if (responsetime > 2000) {
            System.out.println("Fail - Slow Response");
        } else if (!isresponseValid) {
            System.out.println("Fail - Invalid Response");
        } else {
            System.out.println("Pass");
        }
    }
}
