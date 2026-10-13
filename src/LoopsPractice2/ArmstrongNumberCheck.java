package LoopsPractice2;

public class ArmstrongNumberCheck {

    public static void main(String[] args) {

        int num = 153;
        int temp = num;
        int digitcount =0;

        while(temp !=0) {

            int digit = temp % 10;
            digitcount++;
            temp = temp / 10;
        }

        temp = num;
        int sum = 0;

        while(temp !=0) {

            int digit = temp % 10;
            int power = 1;

            for(int i = 1; i<=digitcount; i++) {

                power = power * digit;
            }

            sum = sum + power;
            temp = temp/10;
        }
        if(num == sum) {

            System.out.println("Given number is a armstrong number : "+sum);
        } else
            System.out.println("Give number is not a armstrong number : "+sum);
    }
}
