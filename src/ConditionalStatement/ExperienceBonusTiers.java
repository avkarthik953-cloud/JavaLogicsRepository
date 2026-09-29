package ConditionalStatement;

import java.util.Scanner;

public class ExperienceBonusTiers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter salary : ");
        double salary = sc.nextDouble();

        System.out.println("Enter experience : ");
        int experience = sc.nextInt();

        if (experience > 20) {

            double bonus = salary * 20 / 100;
            double finalSalary = salary + bonus;
            System.out.println("Bonus amount is : " + bonus);
            System.out.println("Final Amount is : " + finalSalary);
        } else if (experience > 15) {

            double bonus = salary * 15 / 100;
            double finalSalary = salary + bonus;
            System.out.println("Bonus amount is : " + bonus);
            System.out.println("Final Amount is : " + finalSalary);
        } else if (experience > 10) {

            double bonus = salary * 10 / 100;
            double finalSalary = salary + bonus;
            System.out.println("Bonus amount is : " + bonus);
            System.out.println("Final Amount is : " + finalSalary);
        } else if (experience > 5) {

            double bonus = salary * 5 / 100;
            double finalSalary = salary + bonus;
            System.out.println("Bonus amount is : " + bonus);
            System.out.println("Final Amount is : " + finalSalary);
        } else {
            System.out.println("Not eligible for bonus");
        }
    }
}
