package ConditionalStatement;

public class PositiveNegativeZero {

    public static void main(String[] args) {

        int num = -25;

        if (num > 0) {
            System.out.println("Given number is Positive");
        } else if (num < 0) {
            System.out.println("Given number is negative");
        } else {
            System.out.println("Given number is zero");
        }
    }
}
