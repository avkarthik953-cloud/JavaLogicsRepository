package LoopsPractice;

public class ApiRetryAttempts {

    public static void main(String[] args) {

        int maxattempts = 5;
        int attempt = 1;
        boolean apisuccessful = true;

        while (attempt <= maxattempts) {

            System.out.println("Attempt " + attempt + " : Calling API...");

            // if (attempt == 5) {
            //     apisuccessful = false;
            // } else {
            //     apisuccessful = false;
            // }

            if (apisuccessful) {
                System.out.println("API Passed");
                break;
            } else {

                System.out.println("API Failed... " + (maxattempts - attempt) + " attempts left");

            }

            attempt++;
        }

        if (!apisuccessful) {
            System.out.println("API Failed after " + maxattempts + " attempts");
        }
    }
}
