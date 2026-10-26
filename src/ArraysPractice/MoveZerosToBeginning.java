package ArraysPractice2;

import java.util.Arrays;

public class MoveZerosToBeginning {

    public static void main(String[] args) {

        int num [] = {0, 1, 0, 2, 3, 4};

        int position = num.length-1;

        for(int i = num.length-1; i>=0; i--) {

            if(num[i] != 0) {

                int temp = num[i];
                num[i] = num[position];
                num[position] = temp;

                position--;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
