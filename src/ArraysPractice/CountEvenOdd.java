package ArraysPractice;

public class CountEvenOdd {

    public static void main(String[] args) {

        int[] numbers = {12, 7, 9, 20, 34, 51, 66, 73};
        int evencount = 0;
        int oddcount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }

        System.out.println("Even count is : " + evencount);
        System.out.println("Odd count is : " + oddcount);
    }
}
