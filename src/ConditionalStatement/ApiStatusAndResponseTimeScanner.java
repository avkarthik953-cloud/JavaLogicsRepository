package ConditionalStatement;

import java.util.Scanner;

public class ApiStatusAndResponseTimeScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Status code : ");
        int statuscode = sc.nextInt();

        if (statuscode == 500) {
            System.out.println("Internal server error.");

        } else {

            System.out.println("Enter the response time : ");
            int responsetime = sc.nextInt();

            if (statuscode == 200 && responsetime <= 2000) {
                System.out.println("API test passed");
            } else {
                System.out.println("API test failed");
            }
        }
    }
}
