package ConditionalStatement;

import java.util.Scanner;

public class PercentageGrade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the percentage : ");
        int percentage = sc.nextInt();

        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid percentage entered");
        } else if (percentage < 50) {
            System.out.println("Fail");
        } else if (percentage <= 59) {
            System.out.println("Average");
        } else if (percentage <= 74) {
            System.out.println("Good");
        } else if (percentage <= 89) {
            System.out.println("Very good");
        } else {
            System.out.println("Excellent");
        }
    }
}
