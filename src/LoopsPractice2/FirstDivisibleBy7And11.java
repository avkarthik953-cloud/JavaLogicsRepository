package LoopsPractice2;

public class FirstDivisibleBy7And11 {

    public static void main(String[] args) {

        int num = 100;

        for(int i = 1; i <= num; i++) {

            if(i%7 == 0 && i%11 == 0) {

                System.out.println(i);
                break;
            }

        }
    }
}
