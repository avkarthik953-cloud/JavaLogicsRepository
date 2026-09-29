package ConditionalStatement;

public class LeapYearCheck {

    public static void main(String[] args) {

        int year = 2032;

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Given number is a leap year");
        } else {
            System.out.println("Given number is not a leap year");
        }
    }
}
