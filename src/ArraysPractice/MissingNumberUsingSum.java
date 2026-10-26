package ArraysPractice2;

public class MissingNumberUsingSum {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 4, 5, 6};

        int sum = 0;

        for(int i = 0; i<numbers.length; i++) {

            sum = sum + numbers[i];
        }

        System.out.println("Sum of all array numbers : "+sum);

        int length = 6;
        int sum1 = 0;

        for(int i = 1; i<=length; i++) {

            sum1 = sum1+i;
        }

        System.out.println("Sum of all array numbers : "+sum1);

        int missingNumber = sum1 - sum;

        System.out.println("Missing number in an array : "+missingNumber);
    }
}
