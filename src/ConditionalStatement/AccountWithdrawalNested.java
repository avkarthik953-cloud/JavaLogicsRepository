package ConditionalStatement;

import java.util.Scanner;

public class AccountWithdrawalNested {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Specify is account Active or not : ");
        boolean isAccountActive = sc.nextBoolean();

        if (isAccountActive == true) {

            System.out.println("Verify the balance amount in account : ");
            double balance = sc.nextDouble();

            if (balance > 0) {

                System.out.println("Enter the withdrawal amount : ");
                int withdrawalamount = sc.nextInt();

                if (withdrawalamount <= balance) {

                    if (withdrawalamount % 100 == 0) {

                        System.out.println("Withdrawal successful");

                        double finalbalance = balance - withdrawalamount;

                        System.out.println("Final balance : " + finalbalance);
                    } else {
                        System.out.println("Withdrawal amount must be multiples of 100");
                    }

                } else {
                    System.out.println("Entered amount must be less than available balance");
                }
            } else {
                System.out.println("Account Balance must be sufficient to withdraw amount");
            }
        } else {
            System.out.println("Account is Inactive. Unable to withdraw amount");
        }
    }
}
