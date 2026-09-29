package ConditionalStatement;

public class ElectricityBillSeniorSurcharge {

    public static void main(String[] args) {

        int units = 2100;
        boolean seniorCitizen = false;

        double basebill = 0;

        if (units <= 100) {
            basebill = units * 2;

        } else if (units <= 200) {

            basebill = (100 * 2) + (units - 100) * 3;
        } else {
            basebill = (100 * 2) + (100 * 3) + (units - 200) * 5;
        }

        double discount = 0;

        if (seniorCitizen) {

            discount = basebill * 10 / 100;

        }

        double billafterdiscount = basebill - discount;

        double surcharge = 0;

        if (billafterdiscount > 2000) {

            surcharge = 100;

        }

        double finalbill = billafterdiscount + surcharge;

        System.out.println("Base bill : " + basebill);
        System.out.println("Discount : " + discount);
        System.out.println("Surcharge : " + surcharge);
        System.out.println("final bill : " + finalbill);
    }
}
