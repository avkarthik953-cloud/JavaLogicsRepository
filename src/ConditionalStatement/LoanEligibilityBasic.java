package ConditionalStatement;

public class LoanEligibilityBasic {

    public static void main(String[] args) {

        int age = 21;
        double salary = 50000;
        int creditScore = 701;

        if (age >= 21 && salary >= 30000 && creditScore >= 700) {
            System.out.println("Eligible for loan");
        } else {
            System.out.println("Not eligible for loan");
        }
    }
}
