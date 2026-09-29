package ArraysPractice;

public class RetryResponseCodes {

    public static void main(String[] args) {

        int[] responseCodes = {500, 500, 503, 200};

        for (int i = 0; i < responseCodes.length; i++) {
            if (responseCodes[i] == 200) {
                System.out.println("Attempt " + (i + 1) + " -> " + responseCodes[i] + " -> " + " Passed");
                break;
            } else {
                System.out.println("Attempt " + (i + 1) + " -> " + responseCodes[i] + " -> " + " Failed");
            }
        }
    }
}
