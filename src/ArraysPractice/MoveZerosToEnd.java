package ArraysPractice2;

import java.util.Arrays;

public class MoveZerosToEnd {

    public static void main(String[] args) {

        int [] numbers = {0, 1, 0, 2, 3, 4};

        int position = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                int temp = numbers[i];
                numbers[i] = numbers[position];
                numbers[position] = temp;
                position++; // 1 2
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
