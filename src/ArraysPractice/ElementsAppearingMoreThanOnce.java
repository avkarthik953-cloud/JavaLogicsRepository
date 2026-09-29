package ArraysPractice;

public class ElementsAppearingMoreThanOnce {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 20, 40, 50, 30, 40};

        System.out.println("Duplicate Values : ");

        for (int i = 0; i < numbers.length; i++) {
            boolean isseenbefore = false;

            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isseenbefore = true;
                    break;
                }
            }

            if (!isseenbefore) {
                for (int k = i + 1; k < numbers.length; k++) {
                    if (numbers[k] == numbers[i]) {
                        System.out.println(numbers[i]);
                        break;
                    }
                }
            }
        }
    }
}
