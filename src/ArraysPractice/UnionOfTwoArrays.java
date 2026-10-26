package ArraysPractice2;

public class UnionOfTwoArrays {

    public static void main(String[] args) {

        int[] arr1 = {5, 10, 5, 15};
        int[] arr2 = {10, 20, 15, 25, 26};

        int [] union = new int[arr1.length+arr2.length];
        int count = 0;

        for(int i = 0; i<arr1.length; i++) {

            boolean isfound = false;

            for(int j = 0; j<count; j++) {

                if(union[j] == arr1[i]) {

                    isfound = true;
                    break;
                }
            }
            if(!isfound) {
                union[count] = arr1[i];
                count++;
            }
        }

        for(int i = 0; i<arr2.length; i++) {

            boolean isfound = false;

            for(int j = 0; j<count; j++) {
                if(union[j] == arr2[i]) {
                    isfound = true;
                    break;
                }
            }
            if(!isfound) {
                union[count] = arr2[i];
                count++;
            }
        }

        System.out.print("Union elements are : ");

        for(int i = 0; i<count; i++) {

            System.out.print(union[i]+" ");
        }
    }
}
