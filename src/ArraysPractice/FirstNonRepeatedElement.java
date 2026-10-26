package ArraysPractice2;

public class FirstNonRepeatedElement {

    public static void main(String[] args) {

        int num [] = {10, 20, 30, 40, 30, 20, 10};

        boolean isfound = false;

        for(int i = 0; i<num.length; i++) {

            int count = 0;

            for(int j = 0; j<num.length; j++) {

                if(num[i] ==num[j]) {
                    count++;
                }
            }
            if(count == 1) {
                System.out.println("First non repeating element : "+num[i]);
                isfound = true;
                break;
            }
        }

        if(!isfound)
        {
            System.out.println("All are repeated elements");
        }
    }
}
