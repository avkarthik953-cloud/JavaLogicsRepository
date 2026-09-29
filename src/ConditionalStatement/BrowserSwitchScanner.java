package ConditionalStatement;

import java.util.Scanner;

public class BrowserSwitchScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the browser name : ");
        String browsername = sc.next();

        switch (browsername) {

        case "chrome":
            System.out.println("Chrome browser is selected");
            break;
        case "firefox":
            System.out.println("Firefox browser is selected");
            break;
        case "edge":
            System.out.println("edge browser is selected");
            break;
        case "safari":
            System.out.println("Safari browser is selected");
            break;
        default:
            System.out.println("Invalid browser selected");
        }
    }
}
