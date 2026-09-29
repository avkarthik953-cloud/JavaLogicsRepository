package ConditionalStatement;

public class PositiveNegativeEvenOdd {

    public static void main(String[] args) {

        int number = -39;

        if (number % 2 == 0 && number > 0) {
            System.out.println("Positive even number");
        } else if (number % 2 == 0 && number < 0) {
            System.out.println("Negative even number");
        } else if (number % 2 != 0 && number > 0) {
            System.out.println("Positive odd number");
        } else if (number % 2 != 0 && number < 0) {
            System.out.println("Negative odd number");
        } else {
            System.out.println("Number is zero");
        }
    }
}
