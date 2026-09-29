package ConditionalStatement;

import java.util.Scanner;

public class BonusWithPerformanceRating {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Salary : ");
        double Salary = sc.nextDouble();

        System.out.println("Enter the experience : ");
        int experience = sc.nextInt();

        System.out.println("Enter the performance rating : ");
        int rating = sc.nextInt();

        if (experience >= 10 && rating >= 4) {

            double bonus = Salary * 20 / 100;
            double finalamount = Salary + bonus;
            System.out.println("Bonus amount : " + bonus);
            System.out.println("Final Salary : " + finalamount);

        } else if (experience >= 5 && rating >= 4) {

            double bonus = Salary * 10 / 100;
            double finalamount = Salary + bonus;
            System.out.println("Bonus amount : " + bonus);
            System.out.println("Final Salary : " + finalamount);

        } else if (experience >= 3 && rating >= 3) {

            double bonus = Salary * 5 / 100;
            double finalamount = Salary + bonus;
            System.out.println("Bonus amount : " + bonus);
            System.out.println("Final Salary : " + finalamount);

        } else {
            System.out.println("Not eligible for Bonus");
        }
    }
}
