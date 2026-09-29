package ConditionalStatement;

public class LoanEligibilityExistingCustomer {

    public static void main(String[] args) {

        int age = 21;
        double salary = 20000;
        int creditScore = 655;
        boolean isexistingCustomer = true;

        if (age >= 21 && salary >= 30000 && creditScore >= 700) {
            System.out.println("Eligible for loan");
        } else {
            if (age >= 21 && salary >= 30000 && creditScore >= 650 && creditScore <= 699 && isexistingCustomer) {
                System.out.println("Existing Customer. Eligible for loan");
            } else {
                System.out.println("Not eligible for loan");
            }
        }
    }
}
