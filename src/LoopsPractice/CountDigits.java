package LoopsPractice;

public class CountDigits {

    public static void main(String[] args) {

        int number = 563521, count = 0;

        while (number != 0) {

            number = number / 10;
            count++;
        }

        System.out.println(count);
    }
}
