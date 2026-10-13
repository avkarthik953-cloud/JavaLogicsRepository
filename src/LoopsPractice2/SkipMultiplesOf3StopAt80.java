package LoopsPractice2;

public class SkipMultiplesOf3StopAt80 {

    public static void main(String[] args) {

        int num = 100;

        for(int i = 1; i <= num; i++) {

            if(i%3 == 0) {

                continue;
            }

            System.out.print(i+" ");

            if(i == 80) {

                break;
            }
        }
    }
}
