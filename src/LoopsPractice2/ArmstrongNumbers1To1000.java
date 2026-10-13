package LoopsPractice2;

public class ArmstrongNumbers1To1000 {

    public static void main(String[] args) {

        int limit = 1000;

        for(int num = 1; num <= limit; num++) {

            int digitcount =0;
            int temp = num;

            while(temp !=0) {

                int digit = temp % 10;
                digitcount++;
                temp = temp / 10;

            }

            temp = num;
            int sum = 0;
            while(temp != 0) {

                int digit1 = temp % 10;

                int power = 1;

                for(int i = 1; i <= digitcount; i++) {

                    power = power * digit1;
                }

                sum = sum + power;
                temp = temp/10;

            }

            if(num == sum) {

                System.out.println(num+" is a Armstrong number");
            }

        }
    }
}
