package ArraysPractice;

public class SumOfPositiveNumbers {

    public static void main(String[] args) {

        int[] numbers = {10, -5, 20, -8, 15, -3, 7};
        int sum = 0;

        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] > 0) {
                sum = sum + numbers[i];
            }
        }

        System.out.println("Sum of positive numbers are : " + sum);
    }
}
