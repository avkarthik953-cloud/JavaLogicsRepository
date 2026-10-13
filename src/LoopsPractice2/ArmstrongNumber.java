package LoopsPractice2;

public class ArmstrongNumber {

    public static void main(String[] args) {

        int num = 153, digitcount = 0, temp = num;

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

            System.out.println(sum+" is a Armstrong number");
        } else {

            System.out.println(sum+" is not a Armstrong number");
        }
    }
}
