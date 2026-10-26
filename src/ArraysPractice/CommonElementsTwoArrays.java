package ArraysPractice2;

public class CommonElementsTwoArrays {

    public static void main(String[] args) {

        int [] a = {1,2,3,4,5,6};
        int [] b = {4,5,6,7,8,9,1};

        System.out.print("Common elements are : ");


        for(int i = 0; i<a.length; i++) {

            boolean isseenbefore = false;

            for(int j = 0; j<b.length; j++) {

                if(a[i] == b[j]) {
                    isseenbefore = true;
                    break;
                }
            }

            if(isseenbefore) {
                boolean isalreadyprinted = false;
                for(int k=0; k<i; k++) {

                    if(a[k] == a[i]) {
                        isalreadyprinted = true;
                        break;
                    }
                }
                if(!isalreadyprinted) {
                    System.out.print(a[i]+" ");
                }
            }
        }
    }
}
