package ConditionalStatement;

public class ApiValidationFailedMessages {

    public static void main(String[] args) {

        int statusCode = 200;
        int responseTime = 2000;
        boolean responsevalid = false;

        if (statusCode != 200) {

            System.out.println("Failed - Invalid Status");

        } else if (responseTime > 2000) {

            System.out.println("Failed - Slow Response");

        } else if (!responsevalid) {

            System.out.println("Failed - Invalid Response");

        } else {

            System.out.println("API Passed");
        }
    }
}
