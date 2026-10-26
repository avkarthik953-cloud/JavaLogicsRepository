package ArraysPractice2;

public class DuplicateElements {

    public static void main(String[] args) {

        int [] num = {10, 20, 30, 40, 10, 30, 20, 40, 40, 40, 40, 50};

        System.out.print("Duplicate elements are : ");

        for(int i = 0; i<num.length; i++) {

            boolean isSeenbefore = false;

            for(int j = 0; j<i; j++) {

                if(num[i] == num[j]) {
                    isSeenbefore = true;
                    break;
                }
            }

            if(!isSeenbefore) {
                for(int k = i+1; k<num.length; k++) {
                    if(num[k] == num[i]) {
                        System.out.print(num[i]+" ");
                        break;
                    }
                }
        }

        }
    }
}
