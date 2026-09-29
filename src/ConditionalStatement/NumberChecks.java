package ConditionalStatement;

public class NumberChecks {

    public static void main(String[] args) {

        int number = 153;

        if (number > 0) {
            System.out.println("Given number is positive");
        } else if (number < 0) {
            System.out.println("Given number is negative");
        } else {
            System.out.println("Give number is zero");
        }

        if (number % 2 == 0) {
            System.out.println("Given number is even number");
        } else {
            System.out.println("Given number is odd number");
        }

        if (number % 3 == 0) {
            System.out.println("Given number is divisible by 3");
        }

        if (number % 5 == 0) {
            System.out.println("Given number is divisible by 5");
        }

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Given number is divisible by both 3 and 5");
        }
    }
}
