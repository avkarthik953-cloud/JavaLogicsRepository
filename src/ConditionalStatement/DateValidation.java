package ConditionalStatement;

public class DateValidation {

    public static void main(String[] args) {

        int day = 30, month = 2, year = 2024;

        if (month < 1 || month > 12) {
            System.out.println("Invalid Month");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day >= 1 && day <= 30) {
                System.out.println("Valid Days");

            } else {
                System.out.println("Invalid Days");
            }
        } else if (month == 2) {

            boolean isleapyear = false;

            if (year % 400 == 0) {
                isleapyear = true;
            } else if (year % 4 == 0 && year % 100 != 0) {
                isleapyear = true;
            }

            if (isleapyear) {

                if (day >= 1 && day <= 29) {
                    System.out.println("valid days");
                } else {
                    System.out.println("Invalid Days");
                }

            } else {
                if (day >= 1 && day <= 28) {
                    System.out.println("Valid Days");
                } else {
                    System.out.println("Invalid days");
                }
            }

        } else {
            if (day >= 1 && day <= 31) {
                System.out.println("Valid days");
            } else {
                System.out.println("Invalid days");
            }
        }
    }
}
