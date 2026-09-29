package LoopsPractice;

public class SecondLargest {

    public static void main(String[] args) {

        int[] a = {10, 40, 25, 80, 65, 60};

        int firstlargest = 0, secondlargest = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] > firstlargest) {

                secondlargest = firstlargest;

                firstlargest = a[i];

            } else if (a[i] > secondlargest) {

                secondlargest = a[i];
            }
        }

        System.out.println("Second largest number is : " + secondlargest);
    }
}
