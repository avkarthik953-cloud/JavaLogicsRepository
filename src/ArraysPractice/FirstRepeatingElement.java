package ArraysPractice2;

public class FirstRepeatingElement {

    public static void main(String[] args) {

        int num [] = {10, 20, 30, 40, 30, 20};

        boolean isfound = false;

        for(int i = 0; i<num.length; i++) {

            for(int j = i+1; j<num.length; j++) {

                if(num[i] == num[j]) {

                    isfound = true;
                    System.out.println("First repeating element in an array : "+ num[i]);
                    break;
                }

            }
            if(isfound) {
                break;
            }
        }

        if(!isfound) {

            System.out.println("No elements repeated in an array");
        }
    }
}
