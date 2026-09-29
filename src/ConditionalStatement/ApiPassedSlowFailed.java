package ConditionalStatement;

import java.util.Scanner;

public class ApiPassedSlowFailed {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the status code : ");
        int statusCode = sc.nextInt();

        System.out.println("Enter the responseTime : ");
        int responseTime = sc.nextInt();

        if (statusCode == 200 && responseTime <= 2000) {
            System.out.println("API passed");
        } else if (statusCode == 200 && responseTime > 2000) {
            System.out.println("API passed but slow");
        } else {
            System.out.println("API failed");
        }
    }
}
