package ArraysPractice2;

import java.util.Arrays;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {

        int[] a = {1, 2, 2, 3, 4};
        int[] b = {2, 4, 4, 5, 6};

        int [] result = new int [a.length];

        int count = 0;

        for(int i = 0; i<a.length; i++) {

            boolean isfound = false;

            for(int j = 0; j<b.length; j++) {

                if(a[i] == b[j]) {
                    isfound = true;
                    break;
                }

            }
            if(isfound) {
                boolean isalreadyprinted = false;
                for(int k = 0; k<i; k++) {
                    if(a[k] == a[i]) {
                        isalreadyprinted = true;
                        break;
                    }
                }

                if(!isalreadyprinted) {
                    result[count] = a[i];
                    count++;
                }

            }
        }

        System.out.println("Intersection elements : "+Arrays.toString(Arrays.copyOf(result, count)));
    }
}
