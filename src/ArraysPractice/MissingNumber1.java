package ArraysPractice;

public class MissingNumber1 {

    public static void main(String[] args) {

        int[] num = {41, 42, 43, 45, 47};

        int start = num[0];
        int end = num[num.length - 1];

        for (int i = start; i <= end; i++) {
            boolean found = false;

            for (int j = 0; j < num.length; j++) {
                if (num[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Missing number is : " + i);
            }
        }
    }
}
