package ArraysPractice2;

import java.util.Arrays;

public class SeparateEvenOddInPlace {

    public static void main(String[] args) {

        int [] num = {10, 13, 17, 22, 23, 24, 44, 7, 3};

        int position = 0;

        for(int i = 0; i<num.length; i++) {

            if(num[i]%2 != 0) {

                int temp = num[i];
                num[i] = num[position];
                num[position] = temp;

                position++;

            }
        }
        System.out.println(Arrays.toString(num));
    }
}
