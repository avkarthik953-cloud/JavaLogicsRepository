package ConditionalStatement;

public class WithdrawalFixedValues {

    public static void main(String[] args) {

        double balance = 50000;
        double withdrawalamount = 20000;

        if (withdrawalamount > 0) {
            if (withdrawalamount <= balance) {
                balance = balance - withdrawalamount;
                System.out.println("Withdrawal Successful");
                System.out.println("Remanining amount is : " + balance);
            } else {
                System.out.println("Withdrawal not successful");
            }
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
}
