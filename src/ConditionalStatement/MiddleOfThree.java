package ConditionalStatement;

public class MiddleOfThree {

    public static void main(String[] args) {

        int a = 27, b = 30, c = 25;

        if ((a > b && a < c) || (a < b && a > c)) {
            System.out.println("a is middle");
        } else if ((b > a && b < c) || (b < a && b > c)) {
            System.out.println("b is middle");
        } else {
            System.out.println("c is middle");
        }
    }
}
