package ConditionalStatement;

import java.util.Scanner;

public class LoanApprovalNestedScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age : ");
        int age = sc.nextInt();

        if (age >= 21) {

            System.out.println("Enter Salary : ");
            double salary = sc.nextDouble();

            if (salary >= 30000) {

                System.out.println("Enter Credit score : ");
                int creditscore = sc.nextInt();

                if (creditscore >= 700) {
                    // No need to ask existing customer at all
                    System.out.println("Loan got approved");

                } else if (creditscore >= 650 && creditscore <= 699) {
                    // Only ask existing customer in this borderline range
                    System.out.println("Is existing customer (true/false) : ");
                    boolean existingcustomer = sc.nextBoolean();

                    if (existingcustomer == true) {
                        System.out.println("Loan got approved");
                    } else {
                        System.out.println("Insufficient Credit score. Loan got rejected");
                    }

                } else {
                    // creditscore < 650
                    System.out.println("Insufficient Credit score. Loan got rejected");
                }

            } else {
                System.out.println("Insufficient Salary. Loan got rejected");
            }

        } else {
            System.out.println("Age limit is not met. Loan got rejected");
        }

        sc.close();
    }
}
