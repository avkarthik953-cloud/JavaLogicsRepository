package ConditionalStatement;

import java.util.Scanner;

public class BrowserEnvironmentScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the browser name : ");
        String enteredBrowser = sc.next();

        System.out.println("Enter the environment : ");
        String enteredEnvironment = sc.next();

        boolean isbrowser = enteredBrowser.equals("chrome") || enteredBrowser.equals("edge") || enteredBrowser.equals("firefox") || enteredBrowser.equals("safari");
        boolean isenvironment = enteredEnvironment.equals("QA") || enteredEnvironment.equals("DEV") || enteredEnvironment.equals("UAT") || enteredEnvironment.equals("PROD");

        if (isbrowser && isenvironment) {
            System.out.println("Both browser and environment are correct");
        } else if (!isbrowser && isenvironment) {
            System.out.println("Only environment is correct");
        } else if (isbrowser && !isenvironment) {
            System.out.println("Only browser is correct");
        } else {
            System.out.println("Both environment and browser are not correct");
        }
    }
}
