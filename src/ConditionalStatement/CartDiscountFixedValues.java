package ConditionalStatement;

public class CartDiscountFixedValues {

    public static void main(String[] args) {

        double cartValue = 2001;
        boolean premiumMember = true;
        boolean coupon = false;

        double discount = 0;

        if (cartValue < 2000) {

            System.out.println("Discount is not applicable");

        } else {

            if (cartValue <= 4999) {

                discount = 10;

            } else {

                discount = 20;
            }

            if (premiumMember) {
                discount = discount + 5;
            }

            if (coupon) {

                discount = discount + 5;
            }

            if (discount > 25) {

                discount = 25;
            }

            double finaldiscount = cartValue * discount / 100;
            double finalbalance = cartValue - finaldiscount;

            System.out.println("Final discount price is : " + finaldiscount);
            System.out.println("Final balance is : " + finalbalance);
        }
    }
}
