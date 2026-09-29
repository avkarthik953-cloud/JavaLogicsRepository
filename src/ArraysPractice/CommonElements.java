package ArraysPractice;

public class CommonElements {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7, 3, 4, 5};

        System.out.print("Common elements are : ");

        for (int i = 0; i < array1.length; i++) {
            boolean isfound = false;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    isfound = true;
                    break;
                }
            }

            if (isfound) {
                boolean alreadyprinted = false;

                for (int k = 0; k < i; k++) {
                    if (array1[k] == array1[i]) {
                        alreadyprinted = true;
                        break;
                    }
                }

                if (!alreadyprinted) {
                    System.out.print(array1[i] + " ");
                }
            }
        }
    }
}
