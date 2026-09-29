package ConditionalStatement;

public class LargestOfThree {

    public static void main(String[] args) {

        int a = 25, b = 40, c = 15;

        if (a > b && a > c) {
            System.out.println("A is largest number");
        } else if (b > a && b > c) {
            System.out.println("B is largest number");
        } else {
            System.out.println("C is the largest number");
        }
    }
}
