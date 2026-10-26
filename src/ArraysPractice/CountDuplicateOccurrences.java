package ArraysPractice2;

public class CountDuplicateOccurrences {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 10, 30, 20, 10, 40};

        int duplicatecount = 0;

        for(int i = 0; i<numbers.length; i++) {

            for(int j = 0; j<i; j++) {

                if(numbers[i] == numbers[j]) {

                    duplicatecount++;
                    break;
                }


            }
        }

        System.out.println("Duplicate occurences are : "+duplicatecount);
    }
}
