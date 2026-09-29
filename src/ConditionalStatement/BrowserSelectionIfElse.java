package ConditionalStatement;

public class BrowserSelectionIfElse {

    public static void main(String[] args) {

        String browser = "Safari";

        if (browser.equals("Chrome")) {
            System.out.println("Chrome Browser is selected");
        } else if (browser.equals("Firefox")) {
            System.out.println("FireFox browser is selected");
        } else if (browser.equals("Edge")) {
            System.out.println("Edge browser is selected");
        } else if (browser.equals("Safari")) {
            System.out.println("Safari browser is selected");
        } else {
            System.out.println("Unsupported browser selected");
        }
    }
}
