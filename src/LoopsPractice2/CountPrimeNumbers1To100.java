package LoopsPractice2;

public class CountPrimeNumbers1To100 {

    public static void main(String[] args) {

        int num = 100, count = 0;

        System.out.print("Prime numbers between 1 to 100 : ");

        for(int i = 1; i <= num; i++) {

            boolean isprime = true;

            if(i == 1) {

                continue;
            }

            for(int j = 2; j < i; j++) {

                if(i % j == 0) {

                    isprime = false;
                    break;
                }
            }
            if(isprime) {

                count++;
            }
        }
        System.out.println(count);
    }
}
