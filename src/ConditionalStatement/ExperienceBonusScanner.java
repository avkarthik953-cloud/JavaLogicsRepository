package ConditionalStatement;

import java.util.Scanner;

public class ExperienceBonusScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the salary : ");
        double salary = sc.nextDouble();

        System.out.println("Enter the experience : ");
        int experience = sc.nextInt();

        if (experience >= 10) {

            double bonus = salary * 20 / 100;
            System.out.println("Original Salary : " + salary);
            System.out.println("Bonus Salary : " + bonus);
            salary = salary + bonus;
            System.out.println("Final Salary : " + salary);

        } else if (experience >= 5) {

            double bonus = salary * 10 / 100;
            System.out.println("Original Salary : " + salary);
            System.out.println("Bonus Salary : " + bonus);
            salary = salary + bonus;
            System.out.println("Final Salary : " + salary);

        } else if (experience >= 3) {
            double bonus = salary * 5 / 100;
            System.out.println("Original Salary : " + salary);
            System.out.println("Bonus Salary : " + bonus);
            salary = salary + bonus;
            System.out.println("Final Salary : " + salary);

        } else if (experience < 3) {
            System.out.println("Not eligible for bonus");
        }
    }
}
