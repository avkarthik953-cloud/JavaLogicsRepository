package LoopsPractice;

public class SumOfEvenNumbers1To100 {

    public static void main(String[] args) {

        int num = 100, sum = 0;

        for (int i = 0; i <= num; i += 2) {

            sum = sum + i;

        }

        System.out.println(sum);
    }
}
