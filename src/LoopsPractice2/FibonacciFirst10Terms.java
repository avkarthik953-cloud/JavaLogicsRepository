package LoopsPractice2;

public class FibonacciFirst10Terms {

    public static void main(String[] args) {

        int f = 0, s = 1, th, num = 10;

        for(int i = 0; i <=num; i++) {

            System.out.print(f+" ");

            th = f+s;

            f = s;
            s = th;

        }
    }
}
