package LoopsPractice2;

public class EvenNumbers1To50 {

    public static void main(String[] args) {

        int num = 50;

        for(int i = 1; i <= num; i++) {

            if(i%2 == 0) {

                System.out.println(i);
            }
        }
    }
}
