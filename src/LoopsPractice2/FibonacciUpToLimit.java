package LoopsPractice2;

public class FibonacciUpToLimit {

    public static void main(String[] args) {

        int limit = 100;

        int first = 0, second = 1;

        while(first <= limit) {

            System.out.print(first + " ");

            int next = first + second;

            first = second;
            second = next;
        }
    }
}
