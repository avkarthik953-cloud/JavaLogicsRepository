package LoopsPractice;

public class PalindromeNumber {

    public static void main(String[] args) {

        int num = 123, reverse = 0;

        int original = num;

        while (num != 0) {

            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;

        }

        if (original == reverse) {
            System.out.println("Given number is a palindrome number : " + reverse);
        } else {
            System.out.println("Given number is not a palindrome number : " + reverse);
        }
    }
}
