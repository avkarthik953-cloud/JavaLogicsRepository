package LoopsPractice2;

public class SumOfEvenNumbers1To100 {

    public static void main(String[] args) {

        int num = 100;

        int sum = 0;

        for(int i = 0; i <= num; i++) {

            if(i%2 == 0) {

                sum = sum+i;
            }
        }

        System.out.println(sum);
    }
}
