package ConditionalStatement;

public class BrowserSelectionSwitch {

    public static void main(String[] args) {

        String browser = "Brave";

        switch (browser) {

        case "Safari":
            System.out.println("Safari browser selected");
            break;
        case "Chrome":
            System.out.println("Chrome browser selected");
            break;
        case "Edge":
            System.out.println("Edge browser selected");
            break;
        case "Firefox":
            System.out.println("Firefox browser selected");
            break;
        default:
            System.out.println("Unsupported browser selected");
        }
    }
}
