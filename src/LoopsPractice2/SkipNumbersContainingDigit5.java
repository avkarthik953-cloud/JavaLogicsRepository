package LoopsPractice2;

public class SkipNumbersContainingDigit5 {

    public static void main(String[] args) {

        int num = 100;

        for(int i = 1; i <= num; i++) {

            int temp = i;
            boolean isfivefound = false;

            while(temp !=0) {

                int digit = temp % 10;

                if(digit == 5) {

                    isfivefound = true;
                    break;

                }

                temp = temp / 10;
            }

            if(isfivefound) {
                continue;
            }

            System.out.println(i+" ");
        }
    }
}
