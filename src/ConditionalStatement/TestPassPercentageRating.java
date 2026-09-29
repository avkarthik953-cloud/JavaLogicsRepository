package ConditionalStatement;

import java.util.Scanner;

public class TestPassPercentageRating {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total tests : ");
        int totaltests = sc.nextInt();

        System.out.println("Enter Passed Tests : ");
        int passedtests = sc.nextInt();

        System.out.println("Enter Failed Tests : ");
        int failedtests = sc.nextInt();

        double passpercentage = (double) passedtests / totaltests * 100;

        System.out.println("Passpercentage : " + passpercentage);

        if (passpercentage >= 95) {
            System.out.println("Excellent");
        } else if (passpercentage >= 90) {
            System.out.println("Good");
        } else if (passpercentage >= 80) {
            System.out.println("Average");
        } else {
            System.out.println("Poor");
        }
    }
}
