package ArraysPractice2;

public class MissingNumbersInRange {

    public static void main(String[] args) {

        int [] num = {1, 2, 3, 4, 6, 10};

        int start = num[0];
        int end = num[num.length-1];

        System.out.print("Missing number in an array from 1 to n : ");

        for(int i = start; i < end; i++) {

            boolean isfound = false;

            for(int j = 0; j < num.length; j++) {

                if(num[j] == i) {

                    isfound = true;
                //	System.out.print(i+" ");
                    break;

                }

            }
            if(!isfound) {
                System.out.print(i+" ");
            }
        }
    }
}
