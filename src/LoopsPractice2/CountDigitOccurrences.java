package LoopsPractice2;

public class CountDigitOccurrences {

    public static void main(String[] args) {

        int num = 12233422;

        int target = 2, count = 0;

        while(num != 0) {

            int digit = num % 10;

            if(digit == target) {

                count++;

            }

            num = num/10;
        }

        System.out.println(target + " occurs "+count+" times ");
    }
}
