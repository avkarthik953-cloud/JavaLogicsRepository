package ConditionalStatement;

import java.util.Scanner;

public class ExperienceLevel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the experience : ");
        int experience = sc.nextInt();

        if (experience > 0 && experience < 2) {
            System.out.println("Fresher");
        } else if (experience >= 2 && experience <= 4) {
            System.out.println("Junior");
        } else if (experience >= 5 && experience <= 7) {
            System.out.println("Senior");
        } else {
            System.out.println("Lead");
        }
    }
}
