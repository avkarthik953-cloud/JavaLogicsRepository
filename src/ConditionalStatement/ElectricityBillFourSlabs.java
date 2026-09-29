package ConditionalStatement;

import java.util.Scanner;

public class ElectricityBillFourSlabs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Units : ");
        int units = sc.nextInt();

        double bill = 0;

        if (units > 0) {

            if (units <= 100) {
                bill = units * 2;
            } else if (units <= 200) {
                bill = (100 * 2) + (units - 100) * 3;
            } else if (units <= 300) {
                bill = (100 * 2) + (100 * 3) + (units - 200) * 5;
            } else {
                bill = (100 * 2) + (100 * 3) + (100 * 5) + (units - 300) * 7;
            }
            System.out.println("Total electricity bill : " + bill);
        } else {
            System.out.println("Invalid units");
        }
    }
}
