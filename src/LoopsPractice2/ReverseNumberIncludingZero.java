package LoopsPractice2;

public class ReverseNumberIncludingZero {

    public static void main(String[] args) {

        int num = 12030;

        while(num !=0) {

            int digit = num % 10;

            System.out.print(digit);

            num = num / 10;
        }
    }
}
