package LoopsPractice2;

public class RightAnglePalindromeTriangle {

    public static void main(String[] args) {

        int num = 5;

        for(int i = 1; i<=num; i++) {

            for(int j = 1; j<=i; j++) {

                System.out.print(j);
            }
            for(int k = i-1; k>=1; k--) {

                System.out.print(k);
            }
            System.out.println();
        }
    }
}
