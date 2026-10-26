package ArraysPractice2;

public class UniqueElements {

    public static void main(String[] args) {

        int [] num = {10, 20, 30, 40, 10, 30, 20, 40};

        System.out.print("Unique elements are : ");

        for(int i = 0; i<num.length; i++) {

            boolean isfound = false;

            for(int j = 0; j<i; j++) {

                if(num[i] == num[j]) {
                    isfound = true;
                    break;
                }
            }

            if(!isfound) {
                System.out.print(num[i]+" ");
            }
        }
    }
}
