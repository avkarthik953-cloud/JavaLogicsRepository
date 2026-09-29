package ArraysPractice;

public class BubbleSort {

    public static void main(String[] args) {

        int[] num = {5, 9, 4, 2, 6, 3, 1};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        System.out.print("After sorting an array : ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
