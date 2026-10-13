package LoopsPractice2;

public class CountFactors {

    public static void main(String[] args) {

        int num = 24, count = 0;

        for(int i = 1; i <= num; i++) {

            if(num % i == 0) {
                count++;
            }
        }
        System.out.println("Number of factors = "+count);
    }
}
