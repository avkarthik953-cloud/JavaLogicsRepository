package ConditionalStatement;

public class SalaryCategory {

    public static void main(String[] args) {

        double salary = -65000;

        if (salary >= 100000) {
            System.out.println("High Salary");
        } else if (salary >= 50000) {
            System.out.println("Good Salary");
        } else if (salary >= 30000) {
            System.out.println("Average Salary");
        } else {
            System.out.println("Low Salary");
        }
    }
}
