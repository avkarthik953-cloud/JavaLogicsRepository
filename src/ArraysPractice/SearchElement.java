package ArraysPractice;

public class SearchElement {

    public static void main(String[] args) {

        int[] num = {10, 20, 30, 20, 50, 60, 70, 50};
        int element = 100;
        boolean elementfound = false;

        for (int i = 0; i < num.length; i++) {
            if (element == num[i]) {
                System.out.println("Element found " + element);
                elementfound = true;
                break;
            }
        }
        if (!elementfound) {
            System.out.println("Element not found " + element);
        }
    }
}
