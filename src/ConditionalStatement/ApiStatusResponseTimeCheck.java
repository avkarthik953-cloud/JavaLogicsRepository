package ConditionalStatement;

import java.util.Scanner;

public class ApiStatusResponseTimeCheck {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the status code : ");
        int statuscode = sc.nextInt();

        System.out.println("Response time : ");
        long responsetime = sc.nextLong();

        if (statuscode == 200 && responsetime <= 2000) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
