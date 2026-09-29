package ConditionalStatement;

public class PromotionEligibility {

    public static void main(String[] args) {

        int experience = 2;
        double salary = 50000;
        int PerformanceRating = 4;

        if (experience >= 3 && salary >= 50000 && PerformanceRating >= 4) {
            System.out.println("Eligible for promotion");
        } else {
            System.out.println("Not eligible for promotion");
        }
    }
}
