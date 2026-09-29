package LoopsPractice;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 20, 40};

        for (int i = 0; i < numbers.length; i++) {

            boolean isduplicate = false;

            for (int j = 0; j < i; j++) {

                if (numbers[i] == numbers[j]) {

                    isduplicate = true;
                    break;
                }
            }

            if (!isduplicate) {

                System.out.println("Array unique values are : " + numbers[i]);
            }

        }
    }
}
