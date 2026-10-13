package LoopsPractice2;

public class SmallestDigit {

    public static void main(String[] args) {

        int num = 583924;

        int smallest = num%10;

        while(num !=0) {

            int digit = num % 10;

            if(digit < smallest) {

                smallest = digit;
            }

            num = num /10;

        }

        System.out.println(smallest);
    }
}
