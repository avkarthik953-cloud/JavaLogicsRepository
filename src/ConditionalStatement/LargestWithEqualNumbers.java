package ConditionalStatement;

public class LargestWithEqualNumbers {

    public static void main(String[] args) {

        int a = 30, b = 25, c = 30;

        if (a == b && b == c) {
            System.out.println("All numbers are equal");
        } else if (a == b && a > c) {
            System.out.println(a + " is largest (two numbers are equal)");
        } else if (a == c && a > b) {
            System.out.println(a + " is largest (two numbers are equal)");
        } else if (b == c && b > a) {
            System.out.println(b + " is largest (two numbers are equal)");
        } else if (a >= b && a >= c) {
            System.out.println(a + " is largest");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is largest");
        } else {
            System.out.println(c + " is largest");
        }
    }
}
