package ArraysPractice;

public class LargestEvenNumber {

    public static void main(String[] args) {

        int[] numbers = {15, 22, 37, 48, 19, 64, 51};
        int largest = -1;
        boolean evenfound = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && (!evenfound || numbers[i] > largest)) {
                largest = numbers[i];
                evenfound = true;
            }
        }

        if (evenfound) {
            System.out.println("Largest even number is : " + largest);
        } else {
            System.out.println("No even number found");
        }
    }
}
