package ConditionalStatement;

import java.util.Scanner;

public class PriceDiscountScanner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price : ");
        double price = sc.nextDouble();

        if (price >= 100000) {

            double discount = price * 20 / 100;
            System.out.println("Original Price is :" + price);
            System.out.println("Discount amount : " + discount);
            price = price - discount;
            System.out.println("Final Price after discount : " + price);

        } else if (price >= 50000) {

            double discount = price * 10 / 100;
            System.out.println("Original Price is :" + price);
            System.out.println("Discount amount : " + discount);
            price = price - discount;
            System.out.println("Final Price after discount : " + price);

        } else if (price >= 20000) {

            double discount = price * 5 / 100;
            System.out.println("Original Price is :" + price);
            System.out.println("Discount amount : " + discount);
            price = price - discount;
            System.out.println("Final Price after discount : " + price);

        } else if (price > 0 && price < 20000) {

            System.out.println("No discount is available");
        } else {

            System.out.println("Invalid amount entered");
        }
    }
}
