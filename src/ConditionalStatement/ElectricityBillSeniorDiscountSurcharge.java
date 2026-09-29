package ConditionalStatement;

public class ElectricityBillSeniorDiscountSurcharge {

    public static void main(String[] args) {

        int units = 200;
        boolean isseniorCitizen = true;

        double bill = 0;
        double surcharge = 0;

        double discount = 0;
        double finalbill = 0;

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

        if (isseniorCitizen) {
            discount = bill * 10 / 100;
        }

        finalbill = bill - discount;
        System.out.println("Final Bill is :" + finalbill);

        if (bill > 2000) {
            surcharge = 100;
        }

        double surchargebill = surcharge + finalbill;
        System.out.println("Surcharge bill is : " + surchargebill);
    }
}
