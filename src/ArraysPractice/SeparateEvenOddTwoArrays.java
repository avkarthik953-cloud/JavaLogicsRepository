package ArraysPractice2;

import java.util.Arrays;

public class SeparateEvenOddTwoArrays {

    public static void main(String[] args) {

        int[] numbers = {12, 7, 8, 15, 20, 33, 42, 9};

        int evencount = 0, oddcount = 0;

        for(int i = 0; i<numbers.length; i++) {

            if(numbers[i] % 2 == 0) {

                evencount++;
            } else {
                oddcount++;
            }
        }

        int [] even = new int[evencount];
        int [] odd = new int[oddcount];

        int e = 0;
        int o = 0;

        for(int i = 0; i<numbers.length; i++) {

            if(numbers[i] % 2 ==0) {

                even[e] = numbers[i];
               e++;
            } else {
                odd[o] = numbers[i];
                o++;
            }
        }

        System.out.println("Even numbers : "+Arrays.toString(even));
        System.out.println("Odd numbers : "+Arrays.toString(odd));
    }
}
