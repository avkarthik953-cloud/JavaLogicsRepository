package LoopsPractice;

public class EvenNumbers1To20 {

    public static void main(String[] args) {

        int num = 20;

        for (int i = 1; i <= num; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
                i++;
            }
        }
    }
}
