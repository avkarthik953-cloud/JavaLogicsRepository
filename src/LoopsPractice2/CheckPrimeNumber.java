package LoopsPractice2;

public class CheckPrimeNumber {

    public static void main(String[] args) {

        int num = 33;
        boolean isprime = true;

        for(int i = 2; i < num; i++) {

            if(num % i == 0) {

                isprime = false;
                break;

            }
        }

        if(isprime) {

            System.out.println(num+" is prime");
        } else {
            System.out.println("It is not a prime number");
        }
    }
}
