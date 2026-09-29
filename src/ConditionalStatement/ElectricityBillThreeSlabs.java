package ConditionalStatement;

import java.util.Scanner;

public class ElectricityBillThreeSlabs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the units : ");
        int units = sc.nextInt();

        double bill;

        if (units <= 0) {
            System.out.println("Invalid units");
        } else if (units <= 100) {

            bill = units * 2;

            System.out.println("Total bill : " + bill);

        } else if (units <= 200) {

            bill = (100 * 2) + (units - 100) * 3;

            System.out.println("Total bill : " + bill);
        } else {

            bill = (100 * 2) + (100 * 3) + (units - 200) * 5;

            System.out.println("Total bill : " + bill);
        }
    }
}
