package LoopsPractice2;

public class CheckFibonacciNumber {

    public static void main(String[] args) {

        int num = 21;

        int first = 0, second = 1;

        while (first < num) {
            int next = first + second;
            first = second;
            second = next;
        }

        if (first == num) {
            System.out.println(num + " belongs to Fibonacci series");
        } else {
            System.out.println(num + " does not belong to Fibonacci series");
        }
    }
}
