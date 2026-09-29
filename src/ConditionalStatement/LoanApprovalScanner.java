package ConditionalStatement;

import java.util.Scanner;

public class LoanApprovalScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the age : ");
        int age = sc.nextInt();

        if (age >= 21) {

            System.out.println("Enter the salary : ");
            double salary = sc.nextDouble();

            if (salary >= 30000) {

                System.out.println("Enter the creditScore : ");
                int creditScore = sc.nextInt();

                if (creditScore >= 700) {
                    System.out.println("Loan got approved");

                } else {
                    System.out.println("Is customer already exists relation with Bank (true/false) : ");
                    boolean isexistingcustomer = sc.nextBoolean();

                    if (creditScore >= 650 && creditScore <= 699 && isexistingcustomer) {
                        System.out.println("Existing Customer. Loan got approved");
                    } else {
                        System.out.println("Requirement didn't get match. Loan got rejected");
                    }
                }

            } else {
                System.out.println("Salary didn't not match. Not eligible for loan");
            }

        } else {
            System.out.println("Under Age. Not eligible for loan");
        }
    }
}
