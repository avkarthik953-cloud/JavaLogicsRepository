package LoopsPractice;

public class TestResultsCount {

    public static void main(String[] args) {

        int[] testResults = {1, 0, 1, 1, 0, 0, 1};

        int passedtestcases = 0, failedtestcases = 0;

        for (int i = 0; i < testResults.length; i++) {

            if (testResults[i] == 1) {

                passedtestcases++;

            } else {

                failedtestcases++;
            }
        }

        System.out.println("PassedTestcases : " + passedtestcases);
        System.out.println("FailedTestcases : " + failedtestcases);

        for (int i = 0; i < testResults.length; i++) {

            if (testResults[i] == 0) {

                System.out.println("Test " + (i + 1) + " failed");
            }
        }
    }
}
