package ArraysPractice;

public class EvenOddCount {

    public static void main(String[] args) {

        int[] num = {10, 5, 25, 28, 3, 6, 8, 4};
        int even = 0, odd = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even number count : " + even);
        System.out.println("Odd number count : " + odd);
    }
}
