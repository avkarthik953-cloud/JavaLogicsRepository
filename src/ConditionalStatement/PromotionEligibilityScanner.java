package ConditionalStatement;

import java.util.Scanner;

public class PromotionEligibilityScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the experience : ");
        int experience = sc.nextInt();

        System.out.println("Enter the performance rating : ");
        int performanceRating = sc.nextInt();

        if (experience >= 5 && performanceRating >= 4) {
            System.out.println("Eligible for Promotion");
        } else {
            System.out.println("Not eligible for promotion");
        }
    }
}
