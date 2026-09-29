package ArraysPractice;

public class RepeatedNumberCount {

    public static void main(String[] args) {

        int[] num = {10, 20, 30, 40, 20, 50, 20, 60};
        int count = 0;
        int number = 20;

        for (int i = 0; i < num.length; i++) {
            if (number == num[i]) {
                count++;
            }
        }

        System.out.println("20 number repeated " + count + " times");
    }
}
