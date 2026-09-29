package ArraysPractice;

public class MissingNumber2 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 7, 8, 9, 10};

        int start = numbers[0];
        int end = numbers[numbers.length - 1];

        for (int i = start; i <= end; i++) {
            boolean isfound = false;

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == i) {
                    isfound = true;
                    break;
                }
            }

            if (!isfound) {
                System.out.println("Missing number : " + i);
            }
        }
    }
}
