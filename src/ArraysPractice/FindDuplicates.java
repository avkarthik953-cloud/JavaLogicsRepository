package ArraysPractice;

public class FindDuplicates {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 20, 40, 40};
        boolean duplicatefound = false;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.println("Duplicate found : " + numbers[i]);
                    duplicatefound = true;
                }
            }
        }

        if (!duplicatefound) {
            System.out.println("No duplicate found");
        }
    }
}
