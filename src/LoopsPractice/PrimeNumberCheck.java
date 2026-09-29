package LoopsPractice;

public class PrimeNumberCheck {

    public static void main(String[] args) {

        int num = 4;

        boolean isprime = true;

        if (num == 1) {

            System.out.println("Given number is not a prime number : " + num);
        } else {

            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.println("Given number is a prime number : " + num);
            } else {
                System.out.println("Given number is not a prime number : " + num);
            }

        }
    }
}
