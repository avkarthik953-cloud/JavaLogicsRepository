package ConditionalStatement;

public class EqualNumbersCheck {

    public static void main(String[] args) {

        int a = 30, b = 30, c = 30;

        if (a == b && b == c) {
            System.out.println("All three numbers are equal");
        } else if (a == b || b == c || c == a) {
            System.out.println("Two numbers are equal");
        } else {
            System.out.println("All three numbers are different");
        }
    }
}
