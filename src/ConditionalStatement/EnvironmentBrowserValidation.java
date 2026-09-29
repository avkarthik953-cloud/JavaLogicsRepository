package ConditionalStatement;

public class EnvironmentBrowserValidation {

    public static void main(String[] args) {

        String environment = "QA";
        String browser = "chrome";

        boolean validEnvironment = environment.equals("DEV") || environment.equals("QA")
                || environment.equals("UAT") || environment.equals("PROD");

        boolean validBrowser = browser.equals("chrome") || browser.equals("firefox")
                || browser.equals("edge");

        if (validEnvironment && validBrowser) {
            System.out.println("Environment and browser are valid");
        } else if (!validEnvironment && !validBrowser) {
            System.out.println("Both environment and browser are invalid");
        } else if (!validEnvironment) {
            System.out.println("Invalid environment");
        } else {
            System.out.println("Invalid browser");
        }
    }
}
