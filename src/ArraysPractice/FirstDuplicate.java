package ArraysPractice;

public class FirstDuplicate {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 20, 50, 30};

        int duplicate = 0;
        boolean isduplicate = false;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    duplicate = numbers[i];
                    isduplicate = true;
                    break;
                }
            }

            if (isduplicate) {
                break;
            }
        }

        if (isduplicate) {
            System.out.println("First duplicate number is : " + duplicate);
        } else {
            System.out.println("No duplicate found");
        }
    }
}
