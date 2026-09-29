package ConditionalStatement;

import java.util.Scanner;

public class WithdrawalMultiplesOf100 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 50000;
        System.out.println("Available balance : " + balance);
        System.out.print("Enter Withdrawal amount : ");
        double withdrawalamount = sc.nextDouble();

        if (withdrawalamount > 0) {
            if (withdrawalamount % 100 == 0) {
                if (withdrawalamount <= balance) {
                    balance = balance - withdrawalamount;
                    System.out.println("Withdrawal successful!!");
                    System.out.println("Withdrawal amount is : " + withdrawalamount);
                    System.out.println("Available Balance : " + balance);
                } else {
                    System.out.println("Insufficient Balance. Please enter valid amount");
                }
            } else {
                System.out.println("Invalid amount. Please enter multiples of 100");
            }
        } else {
            System.out.println("Inavlid amount. Entered amount must be greater than 0");
        }
    }
}
