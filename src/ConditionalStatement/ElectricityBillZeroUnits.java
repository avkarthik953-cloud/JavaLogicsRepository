package ConditionalStatement;

public class ElectricityBillZeroUnits {

    public static void main(String[] args) {

        int units = 1;

        double bill;

        if (units < 0) {
            System.out.println("Invalid units entered");
        } else if (units == 0) {
            bill = 100;
            System.out.println("Electricity bill is : " + bill);
        } else if (units <= 100) {
            bill = units * 2;
            System.out.println("Electricity bill is : " + bill);
        } else if (units <= 200) {
            bill = (100 * 2) + (units - 100) * 3;
            System.out.println("Electricity bill is : " + bill);
        } else {
            bill = (100 * 2) + (100 * 3) + (units - 200) * 5;
            System.out.println("Electricity bill is : " + bill);
        }
    }
}
