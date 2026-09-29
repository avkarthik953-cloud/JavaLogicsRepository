package ConditionalStatement;

import java.util.Scanner;

public class AtmWithdrawalActiveAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Veriy the account is active : ");
        boolean isaccountActive = sc.nextBoolean();

        if (isaccountActive) {

            System.out.println("Enter the balance amount : ");
            double balance = sc.nextDouble();

            if (balance > 0) {

                System.out.println("Enter the withdrawal amount : ");
                double withdrawalAmount = sc.nextDouble();

                if (withdrawalAmount <= 0) {
                    System.out.println("Invalid withdrawal Amount");
                }

                else if (withdrawalAmount % 100 == 0) {

                    if (withdrawalAmount <= balance) {

                        System.out.println("Withdrawal Amount : " + withdrawalAmount);
                        System.out.println("Withdrawal Successful ");

                        double finalbalance = balance - withdrawalAmount;
                        System.out.println("Final Balance is : " + finalbalance);

                    } else {
                        System.out.println("Insufficient balance. Please enter valid amount");
                    }

                } else {
                    System.out.println("Invalid amount entered. Amount entered must be multiples of 100");
                }

            } else {
                System.out.println("Incorrect balance amount entered. Cannot proceed transaction");
            }

        } else {
            System.out.println("Account is Inactive. Couldn't initiate withdraw process");
        }
    }
}
