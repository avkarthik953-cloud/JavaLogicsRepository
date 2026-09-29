package ArraysPractice;

public class BuildPassPercentage {

    public static void main(String[] args) {

        int[] testresults = {1, 1, 1, 1, 1, 0, 1, 1};
        int passedcount = 0, failedcount = 0, totaltestcases = 0;

        for (int i = 0; i <= testresults.length - 1; i++) {
            if (testresults[i] == 1) {
                passedcount++;
            } else {
                failedcount++;
            }
            totaltestcases = i;
        }

        System.out.println("Total tests = " + (totaltestcases + 1));
        System.out.println("Passed test cases = " + passedcount);
        System.out.println("Failed test cases = " + failedcount);

        double passpercentage = (double) passedcount / (totaltestcases + 1) * 100;
        System.out.println("Pass percentage is : " + passpercentage);

        if (passpercentage >= 80) {
            System.out.println("Build passed");
        } else {
            System.out.println("Build failed");
        }
    }
}
