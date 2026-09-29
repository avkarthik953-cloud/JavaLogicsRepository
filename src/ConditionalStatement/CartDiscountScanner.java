package ConditionalStatement;

import java.util.Scanner;

public class CartDiscountScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cart value : ");
        double cartValue = sc.nextDouble();

        if (cartValue < 2000) {
            System.out.println("Discount is not applicable");
        } else {

            System.out.println("Is Premium membership available : ");
            boolean PremiumMember = sc.nextBoolean();

            System.out.println("Is coupon available : ");
            boolean couponAvailable = sc.nextBoolean();

            double discount = 0;

            if (cartValue >= 5000) {
                discount = 20;
            } else if (cartValue >= 2000) {
                discount = 10;
            }
            if (PremiumMember) {
                discount = discount + 5;
            }
            if (couponAvailable) {
                discount = discount + 5;
            }

            if (discount > 25) {
                discount = 25;
            }

            double discountAmount = cartValue * discount / 100;
            double finalPrize = cartValue - discountAmount;

            System.out.println("Total discount applied " + discount + "%");
            System.out.println("Discount amount : " + discountAmount);
            System.out.println("Final Prize is : " + finalPrize);
        }
    }
}
