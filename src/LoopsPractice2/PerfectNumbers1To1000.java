package LoopsPractice2;

public class PerfectNumbers1To1000 {

    public static void main(String[] args) {

        int num = 1000;

        System.out.print("perfect numbers between 1 to 1000 : ");

        for(int i = 1; i <= num; i++) {

            int sum = 0;

            for(int j = 1; j < i; j++) {

                if(i % j == 0) {

                    sum = sum + j;
                }
            }

            if(sum == i) {

                System.out.print(i+" ");
            }
        }
    }
}
