package LoopsPractice2;

public class SumOfNumbers1To100 {

    public static void main(String[] args) {

        int num = 100;

        int sum = 0;

        for(int i = 1; i <= num; i++) {

            sum = sum + i;
        }

        System.out.println(sum);
    }
}
