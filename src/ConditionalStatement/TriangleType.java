package ConditionalStatement;

public class TriangleType {

    public static void main(String[] args) {

        int a = 5, b = 5, c = 8;

        if (a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c) {
                System.out.println("All three sides are equal. It is Equivalent Triangle");
            } else if (a == b || b == c || c == a) {
                System.out.println("Two sides are equal. It is Isosceles triange ");
            } else {
                System.out.println("scalene triangle");
            }
        } else {
            System.out.println("Invalid triangle");
        }
    }
}
