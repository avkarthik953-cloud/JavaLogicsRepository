package ArraysPractice;

public class FirstFailedTest {

    public static void main(String[] args) {

        int[] testResults = {1, 1, 1, 1, 0, 1, 0, 1};

        for (int i = 0; i < testResults.length; i++) {
            if (testResults[i] == 0) {
                System.out.println("First Failed Test case = Test " + (i + 1));
                break;
            }
        }
    }
}
