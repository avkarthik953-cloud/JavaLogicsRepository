package ConditionalStatement;

public class CheckoutEligibilityDiscount {

    public static void main(String[] args) {

        double cartValue = 500;
        boolean premiumMember = true;
        boolean couponAvailable = false;

        boolean eligible = (cartValue >= 500) && (premiumMember || couponAvailable);

        if (eligible) {
            System.out.println("Checkout Allowed");

            double discountPercent = 0;

            if (premiumMember) {
                discountPercent = discountPercent + 10;
            }
            if (couponAvailable) {
                discountPercent = discountPercent + 5;
            }

            double discountAmount = cartValue * (discountPercent / 100);
            double finalAmount = cartValue - discountAmount;

            System.out.println("Cart Value: " + cartValue);
            System.out.println("Discount: " + discountPercent + "% (" + discountAmount + ")");
            System.out.println("Final Amount: " + finalAmount);

        } else {
            System.out.println("Checkout Not Allowed");
        }
    }
}
