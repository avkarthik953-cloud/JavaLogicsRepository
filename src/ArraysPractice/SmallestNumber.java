package ArraysPractice;

public class SmallestNumber {

    public static void main(String[] args) {

        int[] a = {45, 12, 78, 23, 9, 56};
        int min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Smallest number is : " + min);
    }
}
