package LoopsPractice;

public class CountPositiveNegativeZero {

    public static void main(String[] args) {

        int[] numbers = {10, -5, 0, 20, -8, 15, 0, -3};

        int positivecount = 0, negativecount = 0, zerocount = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > 0) {

                positivecount++;

            } else if (numbers[i] < 0) {
                negativecount++;
            } else {
                zerocount++;
            }
        }

        System.out.println("Positive count : " + positivecount);
        System.out.println("Negative count : " + negativecount);
        System.out.println("Zero count : " + zerocount);
    }
}
