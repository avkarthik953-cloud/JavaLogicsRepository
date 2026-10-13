package LoopsPractice2;

public class NumberPalindrome {

    public static void main(String[] args) {

        int num = 1221, temp = num, reverse = 0;

        while(temp !=0) {

            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp/10;

        }

        System.out.println(reverse);

        if(num == reverse) {

            System.out.println("Palindrome");
        } else {

            System.out.println("Not a palindrome");
        }
    }
}
