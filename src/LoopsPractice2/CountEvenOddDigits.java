package LoopsPractice2;

public class CountEvenOddDigits {

    public static void main(String[] args) {

        int num = 123456789, evencount = 0, oddcount =0;

        while(num !=0) {

            int digit = num % 10;
            if(digit%2 == 0) {

                evencount++;
            } else {

                oddcount++;
            }

            num = num / 10;
        }

        System.out.println(evencount);
        System.out.println(oddcount);
    }
}
